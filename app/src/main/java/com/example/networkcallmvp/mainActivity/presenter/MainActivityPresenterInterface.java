package com.example.networkcallmvp.mainActivity.presenter;

import com.example.networkcallmvp.mainActivity.model.ImageModel;

import java.util.List;

public interface MainActivityPresenterInterface {
    void onResponseImage(List<ImageModel> imageModelList);
    void onImageResponseError(String message);
}
