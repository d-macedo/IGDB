package com.igdb.dmacedo.igdb.data.datasource.remote;

import com.igdb.dmacedo.igdb.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class InterceptorFactory {

    private static final String USER_KEY = "user-key";

    private static final String ACCEPT = "Accept";

    private static final String FIELDS= "fields";

    public static Interceptor create(){
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                HttpUrl url = request.url().newBuilder()
                        .addQueryParameter(ACCEPT, "application/json")
                        .addQueryParameter(USER_KEY, BuildConfig.USER_KEY)
                        .build();
                request = request.newBuilder().url(url).build();
                Response response = chain.proceed(request);
                return response;
            }
        };
    }
}
