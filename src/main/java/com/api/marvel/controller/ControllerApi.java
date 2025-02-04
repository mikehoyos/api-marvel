package com.api.marvel.controller;

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

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins= "http://localhost:4200")
public class ControllerApi {
    private final MarvelServiceClient marvelServiceClient;
    @GetMapping(value = "mike", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Marvelresponse> getCharacter(@RequestHeader HttpHeaders headers) {
        log.info("En controller");
        return new ResponseEntity<>(marvelServiceClient.getCharacter(), HttpStatus.OK);
    }

    @PostMapping(value = "mikeId")
    public ResponseEntity<Marvelresponse> getCharacterById(@RequestBody MarvelRequest id) {
        log.info("En controller Id {}", id);
        return new ResponseEntity<>(marvelServiceClient.getCharacterById(id), HttpStatus.OK);
    }

    @GetMapping(value = "Mock")
    public ResponseEntity<MarvelRequest> getCharacterByMock() {
        log.info("En controller Mock");
        MarvelRequest rq = new MarvelRequest(10);
        return new ResponseEntity<>(rq, HttpStatus.OK);
    }
}
