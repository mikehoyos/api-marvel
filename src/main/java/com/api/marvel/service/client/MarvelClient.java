package com.api.marvel.service.client;
import com.api.marvel.constants.Constants;
import com.api.marvel.model.Marvelresponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = Constants.FEIGN_NAME_MARVEL, url = Constants.FEIGN_URL_MARVEL)
public interface MarvelClient {
    @GetMapping(value = Constants.FEIGN_PATH_MARVEL,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Marvelresponse getCharacterById(@RequestParam("id") String id,
                                @RequestParam("apikey") String apikey,
                                @RequestParam("hash") String hash);

    @GetMapping(value = Constants.FEIGN_PATH_MARVEL,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Marvelresponse getCharacter(@RequestParam("apikey") String apikey,
                                @RequestParam("hash") String hash);
}
