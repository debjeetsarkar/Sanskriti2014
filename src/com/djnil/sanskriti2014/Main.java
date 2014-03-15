package com.djnil.sanskriti2014;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		ImageButton b = (ImageButton) findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Main.this, Options.class));
					
			}
		});
    }

}
