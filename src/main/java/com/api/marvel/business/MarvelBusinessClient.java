package com.api.marvel.business;


import com.api.marvel.service.MarvelServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.example.service.impl.CharacterServiceImpl;
import org.example.service.model.Marvelresponse;
import org.springframework.stereotype.Service;

/**
 * Clase de negocio cliente donde se manda a llamar mètodos a consumr.
 */
@Service
@Slf4j
public class MarvelBusinessClient implements MarvelServiceClient {
    /**
     * Bean para cliente de marvel
     *
     */
    private final CharacterServiceImpl characterServiceImpl;
    public MarvelBusinessClient(CharacterServiceImpl characterServiceImpl){
        this.characterServiceImpl = characterServiceImpl;

    }
    /**
     * Metodo para obtener characters
     *
     * @return Marvelresponse
     */
    @Override
    public Marvelresponse getCharacter() {
        return characterServiceImpl.getCharacter();
    }

    /**
     * Metodo para obtener characters por id.
     *
     * @param marvelRequest para buscar por parametro
     * @return Marvelresponse
     */
    @Override
    public Marvelresponse getCharacterById(String marvelRequest) {
        return  characterServiceImpl.getCharacterById(marvelRequest);
    }
}
