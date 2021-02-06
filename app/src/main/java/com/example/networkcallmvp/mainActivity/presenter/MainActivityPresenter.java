package com.example.networkcallmvp.mainActivity.presenter;

import com.example.networkcallmvp.mainActivity.model.ImageModel;
import com.example.networkcallmvp.mainActivity.model.MainActivityModel;
import com.example.networkcallmvp.mainActivity.view.MainActivityViewInterface;

import java.util.List;

public class MainActivityPresenter implements MainActivityPresenterInterface {

    MainActivityViewInterface viewInterface;

    public MainActivityPresenter(MainActivityViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    public void callImageNetwork() {
        MainActivityModel.getImageLis(this);
    }

    @Override
    public void onResponseImage(List<ImageModel> imageModelList) {
        viewInterface.onImageResponse(imageModelList);
    }

    @Override
    public void onImageResponseError(String message) {
        viewInterface.onImageResponseError(message);
    }
}
