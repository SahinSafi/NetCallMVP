package com.example.networkcallmvp.mainActivity.model;

import com.example.networkcallmvp.mainActivity.presenter.MainActivityPresenterInterface;
import com.example.networkcallmvp.network.ApiService;
import com.example.networkcallmvp.network.NetworkCall;
import com.example.networkcallmvp.network.ResponseCallback;

import java.util.List;

public class MainActivityModel {

    public static void getImageLis(MainActivityPresenterInterface presenterInterface){
        ApiService apiService = new NetworkCall();
        apiService.getImageList(new ResponseCallback<List<ImageModel>>() {
            @Override
            public void onSuccess(List<ImageModel> data) {
                presenterInterface.onResponseImage(data);
            }

            @Override
            public void onError(String errorMessage) {
                presenterInterface.onImageResponseError(errorMessage);
            }
        });
    }
}
