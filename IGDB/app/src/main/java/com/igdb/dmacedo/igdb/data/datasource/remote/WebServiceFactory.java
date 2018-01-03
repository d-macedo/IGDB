package com.igdb.dmacedo.igdb.data.datasource.remote;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServiceFactory {

    public static IGDBWebService create(){
        return new Retrofit.Builder()
                .baseUrl(IGDBWebService.BASE_URL)
                .client(OkHttpClientFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(IGDBWebService.class);
    }
}
