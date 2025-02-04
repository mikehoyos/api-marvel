package com.api.marvel.controller;

import com.api.marvel.constants.Constants;
import com.api.marvel.model.MarvelRequest;
import com.api.marvel.model.Marvelresponse;
import com.api.marvel.service.MarvelServiceClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Clase enpoin de entrada del api.
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins= "http://localhost:4200")
public class ControllerApi {
    /**
     * Bean cin el cliente se service mavel.
     */
    private final MarvelServiceClient marvelServiceClient;
    @GetMapping(value = Constants.RQ_MAP, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Marvelresponse> getCharacter(@RequestHeader HttpHeaders headers) {
        log.info("En controller");
        return new ResponseEntity<>(marvelServiceClient.getCharacter(), HttpStatus.OK);
    }
}
