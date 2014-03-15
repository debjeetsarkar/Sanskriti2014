package com.djnil.sanskriti2014;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;


public class Offstage extends Activity {
	final Context context = this;
    private static final String[][] data = {{"\nAd - Mag - Zap\nThis event consists of 2 rounds.\nThe 1st round will be an online round.\nThe participants interested to participate in this event are requested to send in a mail mentioning the Participant Name, College Name and Contact Number with the subject “Ad-Mag-Zap Registration” to events_team@fetsanskritiju.in by the 9th of March, 2014.\nThe 1st round will be an advertisement designing competition, the topic of which will be communicated through e-mail.\nThe 2nd round will be an on-spot event on Magazine Cover Designing.\nThe decision of the judges is final and binding.\n"},
    {"\nTug Of War\nRegistration for TUG OF WAR is open to teams from colleges only.\nAll members of a team have to be from the same college.\nColleges can send more than one team for this event.\nNumber of participants are limited and registration is on 'first come first serve' basis.\nStandard TUG OF WAR rules apply.\nAny sort of misconduct during this event can lead to permanent disqualification from all events.\nTeam size is 8.\n"},
    {"\nMedley\nThe team size for this event will be 2.\nThere will be more than 3 rounds and teams might be eliminated in subsequent rounds.\nThe exact details and the rules of the rounds will be announced during the event.\nAny sort of misconduct during this event can lead to disqualification.\nThe decision of the judge/host is final and binding.\n",
    "\n\nCreative Writing\nThis event has 4 categories, namely:\n1. Bengali Prose\n2. Bengali Poetry\n3. English Prose\n4. English Poetry\n5. Hindi Prose\n6. Hindi Poetry\nRegistration for this event is open only to college students.\nThe colleges may send any number of contestants.\nThe contestants are expected to bring their own pen, pencils etc.\nThe paper will be supplied at the venue.\nThe topic will be announced on spot before the competition.\nThe contestants will not be allowed to refer to any material for any sort of help.\n",
    "\n\nPoster Painting\nRegistration for this event is open only to college students.\nThe colleges may send any number of contestants.\nThe contestants are expected to bring their own colors and brushes.\nThe paper will be supplied at the venue.\nThe topic will be announced an hour before the competition.\nThe contestants will not be allowed to refer to any material for any sort of help.\nThe decision of the judges is final and binding.\n"},
    {"\nRangoli\nRegistration for this event is open only to college students.\nThe colleges may send any number of contestants.\nRangoli Event is an event of 2 – member teams.\nThe contestants are expected to bring their own colors and brushes.\nThe topic will be announced an hour before the competition.\nThe contestants will not be allowed to refer to any material for any sort of help.\nThe decision of the judges is final and binding.\n",
    "\n\nT-shirt Design\nRegistration for this event is open only to college students.\nThe colleges may send any number of contestants.\nThe contestants are expected to bring their own colors and brushes.\nThe T-shirt will be supplied at the venue.\nThe topic will be announced an hour before the competition.\nThe contestants will not be allowed to refer to any material for any sort of help.\nThe decision of the judges is final and binding.\n",
    "\n\nHair Styling\nThere must be a team of an artist and a model.\nThe contestants are expected to bring any material that they may need.\nNo material will be supplied at the venue.\nThe topic will be given an hour before the competition.\n",
    "\n\nFace Painting\nThere must be a team of an artist and a model.\nThe contestants are expected to bring any material that they may need.\nNo material will be supplied at the venue.\nThe topic will be given an hour before the competition.\n"},
    {"\nInQUIZZitive\nGAME PLAN is the sports quiz and KNOWLEDGE QUOTIENT is the general quiz, while ENTERTAINMENT QUOTIENT is a quiz based on Music, Arts, Literature and Entertainment.\nThe team size for all the quizzes is 3 members.\nThe quizzes will be held in two rounds viz. Prelims and Finals.\nThe exact rules for the rounds will be announced during the event.\nThe decision of the quizmaster is final and binding.\n"}};
    private ExpandableListView expandableListView;
    //Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offstage);
        //button1 = (Button)findViewById(R.id.btn1);
        expandableListView = (ExpandableListView)findViewById(R.id.offstage_expv);
        expandableListView.setAdapter(new OffstageExpandableListAdapter(context, this, data));
        Button b1 = (Button) findViewById(R.id.btn1);
		b1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Offstage.this, Sponsors.class));
					
			}
		});
		Button b2 = (Button) findViewById(R.id.btn2);
		b2.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Offstage.this, Contact.class));
					
			}
		});
    }

}
