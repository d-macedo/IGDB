package com.igdb.dmacedo.igdb.data.datasource.response;

import com.google.gson.annotations.SerializedName;

public class AllGenresResponse {

    @SerializedName("id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
