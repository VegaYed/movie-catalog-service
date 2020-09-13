package com.example.moviecatalogservice.models;

import lombok.Data;

@Data
public class Rating {

    private String idMovie;
    private int rating;

    public Rating(){

    }

    public Rating(String idMovie, int rating) {
        this.idMovie = idMovie;
        this.rating = rating;
    }
}
