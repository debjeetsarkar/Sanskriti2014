package com.djnil.sanskriti2014;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;


public class Onstage extends Activity {
	final Context context = this;
    private static final String[][] data = {{"\nTarana - Eastern Solo Vocals\nThis is an eastern solo singing competition.\nRegistration for TARANA is open to any individual, college or otherwise.\nOne singer and one instrument (might be played by another person.) is allowed.\nCompetitors are expected to bring their own instruments.\nTime limit during prelims is 5+1 minutes, inclusive of sound check, or 2 songs, whichever is less.\n8 individuals/teams will qualify to the finals.\nIt is compulsory to sing two songs during the finals.\nTime limit during finals is 7+1 minutes, inclusive of sound check, or 2 songs,whichever is less.\nMarks will be deducted for exceeding the time limit.\n",
    "\n\nRaag N Josh - Eastern Bands\nRegistration for RAAG N JOSH is open to any eastern band, college or otherwise.\nTime limit during prelims is 10+2 minutes, inclusive of sound check.\n8 bands will qualify to the finals.\nTime limit during finals is 12+3 minutes, inclusive of sound check.\nMarks will be deducted for exceeding the time limit.\nEquipments provided will be:\nDrums\nAdequate Microphones, Plug-ins and sufficient sound requirements\nEach participant has to perform a minimum of two songs during the finals.\nBands will have to bring their own musical instruments. However, programmed music is not allowed.\n"},
    {"\nJam It - Western Bands\nRegistration for JAM IT is open to any western band, college or otherwise.\nTime limit during prelims is 10+2 minutes,inclusive of sound check.\n8 bands will qualify to the finals.\nTime limit during finals is 12+3 minutes, inclusive of sound check.\nMarks will be deducted for exceeding the time limit.\nEquipments provided will be:\nDrums\nAdequate Microphones, plug-ins and sufficient sound requirements\nIt is compulsory for each band to play a minimum of two songs during the finals.\nBands will have to bring their own musical instruments. However,programmed music is not allowed.\n",
    "\n\nRendition - Western Solo Vocals\nThis is a western solo singing competition.\nRegistration for RENDITION is open to any individual, college or otherwise.\nOne singer and one instrument (might be played by another person.) is allowed.\nCompetitors are expected to bring their own instruments.\nTime limit during prelims is 5+1 minutes, inclusive of sound check, or 2 songs, whichever is less.\n8 individuals/teams will qualify to the finals.\nTime limit during finals is 7+1 minutes, inclusive of sound check, or 2 songs, whichever is less.\nDuring finals, each participant has to  perform a minimum of two songs.\nMarks will be deducted for exceeding the time limit.\n",
    "\n\nBreak It or Don't Make It\nFORMAT OF BATTLE\nRound 1 requires contestants to showcase a dance performance of not more than 2 minutes to music provided.\nThe top 4 from round 1 will proceed to the 2nd round to battle one on one.\nMusic pre-selected by the Organizers will be used from round 2 onwards\nParticipants will select opponents by drawing lots.\nThe 2 individual winners from round 2 will battle in the final round and the judges will select the final winner based on the final battle.\nRULES FOR THE EVENT\nUsage of props is allowed but requires approval from the organizer. E.g. Usage of liquid, fire, sharp objects, etc, is not allowed.\nNo vulgarity, obscenity or aggression is allowed in this competition.\nThe order of performance for the competition will be determined by drawing lots.\nParticipant who do not turn up or are late for the competition will be deemed disqualified.\nThe organizer reserves the right to change the time and venue should the need arise without prior warning.\nThe judges’ decision will be final and no correspondence will be entertained.\nThe organizer reserves the right to amend the rules and regulations without prior notice.\n"},
    {"\nThink Twice - Debate Competition\nThere will be only 10 teams for the event, registration is on first come first serve basis.\nThe team size is 3\nThe participants will not be allowed to read out from any material but will be allowed to carry plain papers to jot down any points if required.\nThe prelims will be held in Oxford style (with modified rules and regulations) and the finals will be held in Asian Parliamentary style.\nThe time alloted to each speaker in the prelimns is 4 mins.\nThe modified rules are extensive and are available in the events brochure.\n",
    "\n\nGhoongrooz - Eastern Choreography\nThis is a EASTERN dance completion in two categories\nSolo/Duet\nGroup\nRegistration for GHOONGROOZ is open to any individual or group, college or otherwise.\nTime limit for solo/duet category is 5+2 minutes, from empty stage to empty stage.\nTime limit for group category is 6+2 minutes, from empty stage to empty stage.\nMarks will be deducted for exceeding the time limit.\nThere is no limit on the maximum number of participants in a group.\nAccessories, costumes have to be arranged by participants.\nThe performance music has to be brought by the participants in a CD.\n",
    "\n\nInstrumental - Music Competition\nThis is a Solo Competition.\nParticipants will have to bring their own instruments.\nParticipants are allowed to bring a background track in a CD/ Pen Drive.\nPerformance time is 4+1 mins (from empty to empty stage.)\nParticipants will be judged solely on the quality of the instrument they are playing and not on the background track.\nJudge’s Decision is final and binding.",
    "\n\nMoonwalk - Western Choreography\nThis is a WESTERN dance completion in three categories\nSolo\nDuet\nGroup\nRegistration for MOONWALK is open to any individual or group, college or otherwise.\nTime limit for solo category is 5+1 minutes, from empty stage to empty stage.\nTime limit for duet category is 5+1 minutes, from empty stage to empty stage.\nTime limit for group category is 6+2 minutes, from empty stage to empty stage.\nMarks will be deducted for exceeding the time limit.\nThere is no limit on the maximum number of participants in a group.\nAccessories, costumes have to be arranged by participants.\nThe performance music has to be brought by the participants in a CD.\n"},
    {"\nNatyalaya - Drama Competition\nRegistration for NATYALAYA is open to any group/ team, college or otherwise.\nLanguages allowed for dramas are Bengali, Hindi and English.\nThe competition will be of 2 rounds.\nIn the 1st round, the team has to be put up a drama on any topic as per the teams wish.\nThe number of members in each team is not limited to any particular number.\nThe time limit for each team is 15 (+ 5 or -5) minutes, including stage setup.\nIn the 2nd round, the teams will be given a common topic by the judges on which they have to put up a short play.\nThe time duration for the 2nd round is 5 – 7 minutes.\n",
    "\n\nAntakshari\nThere will be two rounds: prelims and finals.\nTeam size is three.\nThe prelims will be a written test.\nThe finals will be a conventional Antakshari format, rules to be declared during the event."},
    {"\nTarana Finale\n",
    "\n\nGhoonrooz Finale\n",
    "\n\nRaag n Josh Finale\n"},
    {"\nRendition Finale\n",
    "\n\nJam It - Finale\n",
    "\n\nMoon Walk Finale\n"},
    {"\nGuitar Wars - Western Music\nThis is a WESTERN GUITAR SOLO PLAYING Competition.\nThe participation limit in this event is 8.\nTime Limit is 2 and half minutes (excluding sound check).\nOpen registration for all participants.\nThe participants have to bring their own guitar.\n"}};
    private ExpandableListView expandableListView;
    //Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onstage);
        //button1 = (Button)findViewById(R.id.btn1);
        expandableListView = (ExpandableListView)findViewById(R.id.onstage_expv);
        expandableListView.setAdapter(new OnstageExpandableListAdapter(context, this, data));
        Button b1 = (Button) findViewById(R.id.btn1);
		b1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Onstage.this, Sponsors.class));
					
			}
		});
		Button b2 = (Button) findViewById(R.id.btn2);
		b2.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				startActivity(new Intent(Onstage.this, Contact.class));
					
			}
		});
    }

}
