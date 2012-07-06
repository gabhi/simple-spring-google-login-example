/*
 * Copyright (c) 2012.
 * Author: Gaikwad Abhijit
 * email: gaikwad.abhijit@gmail.com
 * website:http://gabhi.com
 */
package org.springframework.social.google.api.places.impl;

import org.springframework.social.google.api.impl.AbstractGoogleApiOperations;
import org.springframework.social.google.api.places.PlacesOperations;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * {@link org.springframework.social.google.api.tasks.TaskOperations} implementation.
 * @author Gabriel Axel
 */
public class PlaceTemplate extends AbstractGoogleApiOperations implements
        PlacesOperations {



    static final String PLACES_URL = "https://maps.googleapis.com/maps/api/place/search/json?location=-33.8670522,151.1957362&radius=500&types=food&name=harbour&sensor=false&key=AIzaSyB0f-PalseZwVFQJnkZjvGMumaOOGE6LoI";

    static final String DEFAULT = "@default";
    static final String PLACES = "/tasks";


    public PlaceTemplate(RestTemplate restTemplate, boolean isAuthorized) {
        super(restTemplate, isAuthorized);
    }


    @Override
    public String getPlaces() {
        StringBuffer ret = new StringBuffer();

        //   PlacesQueryBuilder p = new PlacesQueryBuilderImpl(restTemplate);
        try {
        URL url = new URL("https://maps.googleapis.com/maps/api/place/search" +
  "/json?location=-33.8670522,151.1957362&radius=500&types=food&name=harbour&sensor=false&key=AIzaSyB0f-PalseZwVFQJnkZjvGMumaOOGE6LoI");
        InputStream response = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(response));

            for (String line; (line = reader.readLine()) != null;) {
                ret.append(line);
                System.out.println(line);

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        return ret.toString();
        //return restTemplate.getForObject(PLACES_URL, String.class);
    }
}
