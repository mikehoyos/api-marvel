package com.api.marvel.business;

import com.api.marvel.model.MarvelRequest;
import com.api.marvel.model.Marvelresponse;
import com.api.marvel.service.MarvelServiceClient;
import com.api.marvel.service.client.MarvelClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Clase de negocio cliente donde se manda a llamar mètodos a consumr.
 */
@Service
@Slf4j
@AllArgsConstructor
public class MarvelBusinessClient implements MarvelServiceClient {
    /**
     * Bean para cliente de marvel
     *
     */
    private MarvelClient marvelClient;
    /**
     * Metodo para obtener characters
     *
     * @return Marvelresponse
     */
    @Override
    public Marvelresponse getCharacter() {
        Marvelresponse marvelresponse = marvelClient.getCharacter("42ca8a580f3b3aecb8dc76908194aadd","aeb3bf6cf21a20ada8ee437822b2c716");
        return marvelresponse;
    }

    /**
     * Metodo para obtener characters por id.
     *
     * @param marvelRequest para buscar por parametro
     * @return Marvelresponse
     */
    @Override
    public Marvelresponse getCharacterById(MarvelRequest marvelRequest) {
        Marvelresponse marvelresponse = marvelClient.getCharacterById(marvelRequest.id(),"42ca8a580f3b3aecb8dc76908194aadd","aeb3bf6cf21a20ada8ee437822b2c716");
        return marvelresponse;
    }
}
