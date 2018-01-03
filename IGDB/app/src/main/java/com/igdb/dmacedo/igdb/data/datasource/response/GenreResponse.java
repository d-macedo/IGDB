package com.igdb.dmacedo.igdb.data.datasource.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GenreResponse {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("slug")
    private String slug;

    @SerializedName("url")
    private String url;

    @SerializedName("created_at")
    private int created_at;

    @SerializedName("updated_at")
    private int updated_at;

    @SerializedName("games")
    private List<Integer> games;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public List<Integer> getGames() {
        return games;
    }

    public void setGames(List<Integer> games) {
        this.games = games;
    }
}
