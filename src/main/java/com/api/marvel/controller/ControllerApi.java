package com.api.marvel.controller;

import com.api.marvel.constants.Constants;
import com.api.marvel.entity.Bitacora;
import com.api.marvel.service.BitacoraService;
import com.api.marvel.service.MarvelServiceClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.example.service.model.Marvelresponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase enpoin de entrada del api.
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins= Constants.CROSS_ORI)
public class ControllerApi {
    /**
     * Bean cin el cliente se service mavel.
     */
    private final MarvelServiceClient marvelServiceClient;
    private final BitacoraService bitacoraService;
    @GetMapping(value = Constants.RQ_MAP, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Marvelresponse> getCharacter(@RequestHeader HttpHeaders headers) {
        log.info("En controller");
        return new ResponseEntity<>(marvelServiceClient.getCharacter(), HttpStatus.OK);
    }

    @PostMapping(value = Constants.RQ_MAP_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Marvelresponse> getCharacterById(String marvelRequest) {
        log.info("En controller byId");
        Bitacora bitacora = new Bitacora();
        bitacora.setIp("1.2.7.0.0.1");
        bitacora.setMethod("getCharacterById");
        bitacora.setTime( LocalDate.now());
        log.info("En controller getBitacora");
        bitacoraService.updateBitacora(bitacora);
        return new ResponseEntity<>(marvelServiceClient.getCharacterById(marvelRequest), HttpStatus.OK);
    }

    @PostMapping(value = Constants.GET_BITACORA, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bitacora>> getBitacora(String marvelRequest) {
        log.info("En controller getBitacora");
        return new ResponseEntity<>(bitacoraService.bitacoras(), HttpStatus.OK);
    }
}
