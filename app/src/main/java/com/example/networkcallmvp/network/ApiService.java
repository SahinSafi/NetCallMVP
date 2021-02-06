package com.example.networkcallmvp.network;

import com.example.networkcallmvp.mainActivity.model.ImageModel;

import java.util.List;

public interface ApiService {

    void getImageList(ResponseCallback<List<ImageModel>> responseCallback);

}
