package com.igdb.dmacedo.igdb.entity;

import com.google.gson.annotations.SerializedName;

public class AllGenresEntity {

    @SerializedName("id")
    private int id;


    public AllGenresEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
