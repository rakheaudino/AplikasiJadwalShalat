package com.example.moviedatabase;

import java.io.Serializable;

public class MovieItem implements Serializable {
    String title, release_date, overview, vote_average, isya;

    public MovieItem(String title, String release_date, String overview, String vote_average, String isya) {
        this.title = title;
        this.release_date = release_date;
        this.overview = overview;
        this.vote_average = vote_average;
        this.isya = isya;
    }


    public String getTitle() {
        return title;
    }

    public String getReleaseDate(){
        return release_date;
    }

    public String getOverview() {
        return overview;
    }

    public String getVoteAverage() {
        return vote_average;
    }

    public String getIsya() {
        return isya;
    }
}