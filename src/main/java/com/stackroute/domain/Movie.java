package com.stackroute.domain;

public class Movie {

    private int movieId;
    private String movieName;
    private Actor actor;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
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
