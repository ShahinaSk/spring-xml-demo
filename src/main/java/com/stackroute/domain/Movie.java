package com.stackroute.domain;

public class Movie {

    private int movieId;
    private String movieName;
    private Actor actor;

    public Movie(int movieId, String movieName, Actor actor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.actor = actor;
    }
    public Movie(){

    }

    @Override
    public String
    toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\''+", " + actor +
                '}';
    }
}
