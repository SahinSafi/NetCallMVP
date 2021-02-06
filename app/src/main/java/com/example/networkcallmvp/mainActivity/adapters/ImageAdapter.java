package com.example.networkcallmvp.mainActivity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.networkcallmvp.R;
import com.example.networkcallmvp.mainActivity.model.ImageModel;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private List<ImageModel> imageModelList;

    public ImageAdapter(Context context, List<ImageModel> imageModelList) {
        this.context = context;
        this.imageModelList = imageModelList;
    }

    @Override
    public int getCount() {
        return imageModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_image, null);
        }

        ImageModel imageModel = imageModelList.get(position);

        ImageView imageView = convertView.findViewById(R.id.imageViewID);
        TextView nameText = convertView.findViewById(R.id.nameID);

        Glide.with(context).load(imageModel.getDownloadUrl()).into(imageView);
        nameText.setText(imageModel.getAuthor());

        return convertView;
    }
}
