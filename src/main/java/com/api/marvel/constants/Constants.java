package com.api.marvel.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {

    public static final String BASE_PACKAGE = "com.api.marvel";
    public static final String POST_VAL_DEST_ACCOUNT = "${api.uri.mapping.validate.dest.account}";

    public static final String FEIGN_NAME_MARVEL = "${constants.api.feign.name.marvel}";
    public static final String FEIGN_URL_MARVEL  = "${constants.api.feign.url.marvel}";
    public static final String FEIGN_PATH_MARVEL ="${constants.api.feign.path.marvel}";
}
