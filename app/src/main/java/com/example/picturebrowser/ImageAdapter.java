package com.example.picturebrowser;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private int[] res;
    private Context context;

    public ImageAdapter(int[] res, Context context) {
        this.res = res;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Object getItem(int position) {
        return res[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundResource(res[position % res.length]);
        imageView.setLayoutParams(new Gallery.LayoutParams(500, 288));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }
}
