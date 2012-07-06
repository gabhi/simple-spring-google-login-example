package org.springframework.social.google.api.places.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.google.api.places.PlaceSearchResults;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: abhijitgaikwad
 * Date: 7/5/12
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlaceTemplateTest   {
    public void testGetPlaces() throws Exception {
        StringBuffer ret = new StringBuffer();

        //   PlacesQueryBuilder p = new PlacesQueryBuilderImpl(restTemplate);
        try {
            URL url = new URL("https://maps.googleapis.com/maps/api/place/search" +
                    "/json?location=-33.8670522,151.1957362&radius=500&types=food" +
                    "&name=harbour&sensor=false&key=AIzaSyB0f-PalseZwVFQJnkZjvGMumaOOGE6LoI");
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
    }


    public static void main(String args[] ) throws Exception   {
        StringBuffer ret = new StringBuffer();

        //   PlacesQueryBuilder p = new PlacesQueryBuilderImpl(restTemplate);
        try {
            URL url = new URL("https://maps.googleapis.com/maps/api/place/search" +
                    "/json?location=-33.8670522,151.1957362&radius=500&types=food" +
                    "&name=harbour&sensor=false&key=AIzaSyB0f-PalseZwVFQJnkZjvGMumaOOGE6LoI");
            InputStream response = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(response));

            for (String line; (line = reader.readLine()) != null;) {
                ret.append(line);
                System.out.println(line);

            }

            PlaceSearchResults ob = new ObjectMapper().readValue(ret.toString(), PlaceSearchResults.class);
            System.out.println(ob);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
