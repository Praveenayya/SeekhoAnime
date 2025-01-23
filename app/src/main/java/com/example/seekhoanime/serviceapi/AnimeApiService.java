package com.example.seekhoanime.serviceapi;

import com.example.seekhoanime.appPojoClasses.animechild.AnimeChild;
import com.example.seekhoanime.appPojoClasses.animemain.AnimMain;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnimeApiService {

    @GET("top/anime")
    Call<AnimMain> getAllAnimList();

    @GET("anime/{anime_id}")
    Call<AnimeChild> getAnimeByID(@Path("anime_id") Integer anime_id);
}
