package com.example.networkcallmvp.network;

import com.example.networkcallmvp.mainActivity.model.ImageModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("v2/list")
    Call<List<ImageModel>> getImageList();
}
