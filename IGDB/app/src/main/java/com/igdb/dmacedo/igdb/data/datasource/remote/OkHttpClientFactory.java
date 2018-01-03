package com.igdb.dmacedo.igdb.data.datasource.remote;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public class OkHttpClientFactory {

    public static OkHttpClient create(){
        return new OkHttpClient.Builder().addInterceptor(InterceptorFactory.create()).build();
    }
}
