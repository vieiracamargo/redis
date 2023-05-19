package com.example;

import java.time.LocalDate;


public class Game {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private String trailerUrl;

    public Game(String title, String description, LocalDate releaseDate, String trailerUrl) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.trailerUrl = trailerUrl;
    }

    public Game() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }
}
