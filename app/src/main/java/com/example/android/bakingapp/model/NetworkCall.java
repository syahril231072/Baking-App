package com.example.android.bakingapp.model;

import com.example.android.bakingapp.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by USER on 19/08/2017.
 */

public interface NetworkCall {

    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<Recipe>> getAllRecips();
}
