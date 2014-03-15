package com.djnil.sanskriti2014;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GuestHolder {

    public TextView text;
    public ImageView imageview;
    public GuestHolder(View v) {
        this.text = (TextView)v.findViewById(R.id.guest_text);
        this.imageview = (ImageView)v.findViewById(R.id.guest_image);
    }

}
