package com.api.marvel.business;

import com.api.marvel.model.Marvelresponse;
import com.api.marvel.service.client.MarvelClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MarvelBusinessClientTest {
    @InjectMocks
    private MarvelBusinessClient marvelBusinessClient;

    @Mock
    private MarvelClient marvelClient;

    private Marvelresponse marvelresponse;

    @BeforeEach
    void setUp(){
        this.marvelresponse = new Marvelresponse(200,"ok","copyRogth","Marvel comics","HTML", "etag",null);
    }

    @Test
    void getCharacter() {
        Mockito.when(marvelClient.getCharacter("42ca8a580f3b3aecb8dc76908194aadd","aeb3bf6cf21a20ada8ee437822b2c716")).thenReturn(marvelresponse);
        Marvelresponse resp = marvelClient.getCharacter("42ca8a580f3b3aecb8dc76908194aadd","aeb3bf6cf21a20ada8ee437822b2c716");
        assertEquals(200, marvelresponse.code());
        Assertions.assertNotNull(resp);
        verify(marvelClient).getCharacter("42ca8a580f3b3aecb8dc76908194aadd","aeb3bf6cf21a20ada8ee437822b2c716");
    }
}