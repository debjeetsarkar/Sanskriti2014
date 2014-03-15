package com.djnil.sanskriti2014;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OnstageHolder {

    public TextView text;
    public ImageView imageview;
    public OnstageHolder(View v) {
        this.text = (TextView)v.findViewById(R.id.onstage_text);
        this.imageview = (ImageView)v.findViewById(R.id.onstage_image);
    }

}
