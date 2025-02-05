package com.api.marvel.service;


import org.example.service.model.Marvelresponse;

public interface MarvelServiceClient {
    /**
     * Metodo para obtener characters
     * @return Marvelresponse
     */
    Marvelresponse getCharacter();

    /**
     * Metodo para obtener characters por id.
     * @param marvelRequest para buscar por parametro
     * @return Marvelresponse
     */
    Marvelresponse getCharacterById(String marvelRequest);
}
