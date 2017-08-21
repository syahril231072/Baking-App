package com.example.android.bakingapp.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by USER on 19/08/2017.
 */

public class RetrofitInstance {
    public static final String URL = "https://d17h27t6h515a5.cloudfront.net/";

    public static Retrofit getInstance(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
