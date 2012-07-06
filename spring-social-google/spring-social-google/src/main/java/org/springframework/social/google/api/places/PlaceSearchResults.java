/*
 * Copyright (c) 2012.
 * Author: Gaikwad Abhijit
 * email: gaikwad.abhijit@gmail.com
 * website:http://gabhi.com
 */

package org.springframework.social.google.api.places;

public class PlaceSearchResults   {


    public String[] getHtml_attributions() {
        return html_attributions;
    }
    private String next_page_token;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public void setHtml_attributions(String[] html_attributions) {
        this.html_attributions = html_attributions;
    }

    public Place[] getResults() {
        return results;
    }

    public void setResults(Place[] results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String[] html_attributions;
    Place[] results;
    String status;


}

