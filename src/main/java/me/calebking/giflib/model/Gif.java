package me.calebking.giflib.model;

import java.time.LocalDate;

/**
 * Created by caleb.king on 2/10/16.
 */
public class Gif {
    private String name;
    private LocalDate dateUpLoaded;
    private String username;
    private boolean favorite;

    public Gif(String name, LocalDate dateUpLoaded, boolean favorite, String username) {
        this.name = name;
        this.dateUpLoaded = dateUpLoaded;
        this.favorite = favorite;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateUpLoaded() {
        return dateUpLoaded;
    }

    public void setDateUpLoaded(LocalDate dateUpLoaded) {
        this.dateUpLoaded = dateUpLoaded;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
