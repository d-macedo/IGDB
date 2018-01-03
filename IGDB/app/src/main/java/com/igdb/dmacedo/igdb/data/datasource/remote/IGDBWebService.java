package com.igdb.dmacedo.igdb.data.datasource.remote;

import com.igdb.dmacedo.igdb.data.datasource.response.AllGenresResponse;
import com.igdb.dmacedo.igdb.data.datasource.response.GenreResponse;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface IGDBWebService {

    String BASE_URL = "https://api-2445582011268.apicast.io";

    @GET("/genres/")
    Single<List<AllGenresResponse>> genres();



}
