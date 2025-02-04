package com.api.marvel.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Clase con constantes necesarias para el api.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {

    /**
     * Constante con la base del paquete.
     */
    public static final String BASE_PACKAGE = "com.api.marvel";
    /**
     * Constante con el nombre del feing client.
     */
    public static final String FEIGN_NAME_MARVEL = "${constants.api.feign.name.marvel}";
    /**
     * Contante con la url del feign client.
     */
    public static final String FEIGN_URL_MARVEL  = "${constants.api.feign.url.marvel}";
    /**
     * Constante con el path del feign client.
     */
    public static final String FEIGN_PATH_MARVEL ="${constants.api.feign.path.marvel}";

    /**
     * Contante con el valor del reques maping de metddo
     *
     */
    public static final String RQ_MAP = "characters";
}
