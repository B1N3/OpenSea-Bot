package com.opensea_bot.server.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenSeaConnector {

    public String getCollections(int limit){
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject("https://api.opensea.io/api/v1/collections?offset=0&limit=" + limit, String.class);

        return response;
    }

    public String getRecentListings(){
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject("https://testnets-api.opensea.io/wyvern/v1/orders?bundled=false&include_bundled=false&limit=20&offset=0&order_by=created_date&order_direction=desc", String.class);

        return response;
    }


    public String getCollection(String slug){
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject("https://api.opensea.io/api/v1/collection/" + slug, String.class);

        return response;
    }

    public String getCollectionStats(String slug){
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject("https://api.opensea.io/api/v1/collection/" + slug + "/stats", String.class);

        return response;
    }

}
