/*
 * Copyright (c) 2012.
 * Author: Gaikwad Abhijit
 * email: gaikwad.abhijit@gmail.com
 * website:http://gabhi.com
 */

package org.springframework.social.google.api.places;

import org.springframework.social.google.api.ApiEntity;


public class Place extends ApiEntity {
    private String formatted_address;
    private  String icon;
    private String name;
    private String rating;
    private String reference;

     String[] types;
    Geometry geometry;
                 String vicinity;
    Opening_hours opening_hours ;

    public Opening_hours getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(Opening_hours opening_hours) {
        this.opening_hours = opening_hours;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
    // to add          "types" : [ "restaurant", "food", "establishment" ]
   //
//    "geometry" : {
//        "location" : {
//            "lat" : -33.8750460,
//                    "lng" : 151.2052720
//        }
//    }
    //


    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    public Place(String formatted_address, String icon, String name, String rating, String reference) {
        this.formatted_address = formatted_address;
        this.icon = icon;
        this.name = name;
        this.rating = rating;
        this.reference = reference;
    }

    public Place(String id) {
        super(id);
    }

    public Place() {
    }
}

