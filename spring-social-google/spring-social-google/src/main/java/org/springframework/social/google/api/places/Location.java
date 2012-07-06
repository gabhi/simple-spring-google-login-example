package org.springframework.social.google.api.places;

/**
 * Created with IntelliJ IDEA.
 * User: abhijitgaikwad
 * Date: 7/6/12
 * Time: 12:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Location {
        String lat;
    String lng;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}

