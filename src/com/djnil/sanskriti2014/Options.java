package com.djnil.sanskriti2014;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Options extends Activity {
	
	protected void onCreate(Bundle savedInstanceState)
	{
		overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		
		Button guestb = (Button) findViewById(R.id.guestButton);
		guestb.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Options.this, Guest.class));
					
			}
		});
		
		Button onstageb = (Button) findViewById(R.id.onstageButton);
		onstageb.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Options.this, Onstage.class));
					
			}
		});
		
		Button offstageb = (Button) findViewById(R.id.offstageButton);
		offstageb.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				
				startActivity(new Intent(Options.this, Offstage.class));
					
			}
		});
	}
	
}
