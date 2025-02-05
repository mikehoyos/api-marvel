package com.api.marvel.controller;

import com.api.marvel.model.MarvelRequest;
import com.api.marvel.service.MarvelServiceClient;
import org.example.service.model.Marvelresponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ControllerApiTest {
    @InjectMocks
    private ControllerApi controllerApi;

    @Mock
    MarvelServiceClient marvelServiceClient;

    private MarvelRequest request;
    private HttpHeaders httpHeaders;

    @BeforeEach
    void setUp(){
        request  = new MarvelRequest(1010);
    }
    @Test
    void getCharacter() {
        Marvelresponse marvelResponse = new Marvelresponse(200, "ok", "copyRogth", "Marvel comics", "HTML", "etag", null);
        when(marvelServiceClient.getCharacter()).thenReturn(marvelResponse);
        var response = controllerApi.getCharacter(httpHeaders);
        Assertions.assertNotNull(response);
        assertEquals(200, response.getStatusCodeValue());
        verify(marvelServiceClient).getCharacter();
    }
}