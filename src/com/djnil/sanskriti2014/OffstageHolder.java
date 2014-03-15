package com.djnil.sanskriti2014;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OffstageHolder {

    public TextView text;
    public ImageView imageview;
    public OffstageHolder(View v) {
        this.text = (TextView)v.findViewById(R.id.offstage_text);
        this.imageview = (ImageView)v.findViewById(R.id.offstage_image);
    }

}
