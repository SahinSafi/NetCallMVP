package com.example.networkcallmvp.network;

import com.example.networkcallmvp.mainActivity.model.ImageModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkCall implements ApiService{

    @Override
    public void getImageList(ResponseCallback<List<ImageModel>> responseCallback) {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<ImageModel>> call = apiInterface.getImageList();
        call.enqueue(new Callback<List<ImageModel>>() {
            @Override
            public void onResponse(Call<List<ImageModel>> call, Response<List<ImageModel>> response) {
                if (response.code() == 200){
                    responseCallback.onSuccess(response.body());
                }else {
                    responseCallback.onError(response.message());
                }
            }

            @Override
            public void onFailure(Call<List<ImageModel>> call, Throwable t) {
                responseCallback.onError(t.getMessage());
            }
        });
    }
}
