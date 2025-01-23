package com.example.seekhoanime.serviceapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://api.jikan.moe/v4/";
    //https://api.jikan.moe/v4/top/anime
    //https://api.jikan.moe/v4/anime/9969

    public static AnimeApiService getApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(AnimeApiService.class);
    }
}
