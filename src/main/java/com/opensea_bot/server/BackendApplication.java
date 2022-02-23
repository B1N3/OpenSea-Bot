package com.opensea_bot.server;

import com.opensea_bot.server.models.OpenSeaCollection;
import com.opensea_bot.server.services.OpenSeaConnector;
import com.opensea_bot.server.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {

		OpenSeaConnector openSeaConnector = new OpenSeaConnector();
		JsonUtils jsonUtils = new JsonUtils();

		//String collectionJson = openSeaConnector.getCollection("piggybanxnft");
		//OpenSeaCollection collection = jsonUtils.parseSingleCollection(collectionJson);

		String listings = openSeaConnector.getRecentListings();
		System.out.println(listings);

		//SpringApplication.run(BackendApplication.class, args);
	}

}
