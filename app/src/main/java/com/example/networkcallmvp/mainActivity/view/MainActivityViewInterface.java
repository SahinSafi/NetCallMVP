package com.example.networkcallmvp.mainActivity.view;

import com.example.networkcallmvp.mainActivity.model.ImageModel;

import java.util.List;

public interface MainActivityViewInterface {

    void onImageResponse(List<ImageModel> imageModelList);
    void onImageResponseError(String errorMessage);
}
