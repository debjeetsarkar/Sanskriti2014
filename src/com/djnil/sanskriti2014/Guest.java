package com.djnil.sanskriti2014;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;

public class Guest extends Activity {
	final Context context = this;
    private static final String[][] data = {{"\nKrosswindz\n A bangla rock/folk-fusion band, based in Kolkata, India.\nThey have performed all over India and abroad,\nand have helped urbanize the folk music of Bengal and have tried to make it popular.\nKrosswindz is one of the few Kolkata based Bengali rock bands who have female singers in their lead vocals.\nGenre :Bangla Rock, Fusion\n JU Saltlake Campus\nwww.krosswindz.com\n"},
    {"\nFolkroots\n A folk fusion band comprising of grammy nominee Subhen Chatterjee , Pota (ex-Cactus,Marudyan) , Ivy and Sambit on drums.\n"},
    {"\nPratik Srivastava\nEminent sarod player.\nThe remarkable control, with which  Pratik Srivastava handles sarod and gives a matured recital, is definitely beyond his age.\nIf the alaap, jod and jhala in Bhimpalasi were packed with immense possibilities, the gatkari in slow jhaptal is their elaboration.\n"},
    {"\nSoulmate\n A blues rock band from Shillong, Meghalaya, India.\nThe band is primarily made up of Rudy Wallang (guitar/nocals/songwriter) and Tipriti TIPS Kharbangar (vocals/guitar),\n although they frequently team up with session musicians (on drums, bass,Hammond organ and possibly other backup instruments) when on tour.\nTipriti is considered as one of the finest female singers to have emerged from Shillong and Wallang is considered one of the most respected blues guitarists in India.\nGenre: Blues rock\nJU Jadavpur Campus\nhttps://myspace.com/soulmateshillong\n"},
    {"\nSwarathma\n This is abangalore based indian folk/fusion band the currnet lineup features Vasu Dixit (vocals and rythm guitar,\nPawan Kumar KJ (percussion and backing vocals),\n Varun Murali (lead guitar),\nSanjeev Nayak (violin) and Jishnu Dasgupta (base guitar and backing vocals\nGenre : Indian Folk/Fusion\nJU Jadavpur Campus\n http://www.swarathma.com"},
    {"\nPapon and The East India Company\n An electric folk-fusion band from New Delhi, formed in 2007.\nThe band, now based out of Mumbai, comprises of Papon (vocals, guitars), Brin (live electronica),\nJeenti (guitars), Kirti (World percussions), Aakash (bass), Tanmay (drums) and Birinchi (keys).\nThe band has performed at major festivals like Oktoberfest in Bangalore, NH7 Weekender, SAARC Music Festival in New Delhi, Eastwind Festival, etc.\nand has performed overseas with Sutasi in Singapore. The outfit also recently performed at the Dubai World Music festival.\nToday, the band is a much appreciated live act throughout the gig circuit in the country.\nAmbient Electronica\nJU Main Campus\n"}};
    private ExpandableListView expandableListView;
    //Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        //button1 = (Button)findViewById(R.id.btn1);
        expandableListView = (ExpandableListView)findViewById(R.id.guest_expv);
        expandableListView.setAdapter(new GuestExpandableListAdapter(context, this, data));
        Button b1 = (Button) findViewById(R.id.btn1);
		b1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Guest.this, Sponsors.class));
					
			}
		});
		Button b2 = (Button) findViewById(R.id.btn2);
		b2.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Guest.this, Contact.class));
					
			}
		});
    }
}

