package com.djnil.sanskriti2014;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;

public class OffstageExpandableListAdapter extends BaseExpandableListAdapter implements ExpandableListAdapter  {
	public Context context;
    private LayoutInflater vi;
    private String[][] data;
    int _objInt;
    private static final int GROUP_ITEM_RESOURCE = R.layout.offstage_group_item;
    private static final int CHILD_ITEM_RESOURCE = R.layout.offstage_child_item;
    public OffstageExpandableListAdapter(Context context, Activity activity, String[][] data) {
        this.data = data;
        this.context = context;
        vi = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        _objInt = data.length;
    }


    public String getChild(int groupPosition, int childPosition) {
        return data[groupPosition][childPosition];
    }

    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    public int getChildrenCount(int groupPosition) {
        return data[groupPosition].length;
    }

    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View v = convertView;
        String child = getChild(groupPosition, childPosition);
        int id_res = 0;
        if(groupPosition == 0){
        	if(childPosition == 0) id_res = R.drawable.ad_mag_zap;
        }
        else if(groupPosition == 1){
        	if(childPosition == 0) id_res = R.drawable.tug;
        }
        else if(groupPosition == 2){
        	if(childPosition == 0) id_res = R.drawable.medley;
        	if(childPosition == 1) id_res = R.drawable.creativew;
        	if(childPosition == 2) id_res = R.drawable.posterpainting;
        	//if(childPosition == 3) id_res = R.drawable.cartooning;
        }
        else if(groupPosition == 3){
        	if(childPosition == 0) id_res = R.drawable.rangoli;
        	if(childPosition == 1) id_res = R.drawable.tshirt;
        	if(childPosition == 2) id_res = R.drawable.hairstyling;
        	if(childPosition == 3) id_res = R.drawable.facepainting;
        }
        else if(groupPosition == 4){
        	if(childPosition == 0) id_res = R.drawable.inquizzitive;
        }
        if (child != null) {
            v = vi.inflate(CHILD_ITEM_RESOURCE, null);
            OffstageHolder holder = new OffstageHolder(v);
            holder.text.setText(Html.fromHtml(child));
            holder.imageview.setImageResource(id_res);
        }
        return v;
    }

    public String getGroup(int groupPosition) {
        return "group-" + groupPosition;
    }

    public int getGroupCount() {
        return data.length;
    }


    public long getGroupId(int groupPosition) {
        return groupPosition;
    }


    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View v = convertView;
        String group = null;
        long group_id = getGroupId(groupPosition);
        if(group_id == 0){
        	group = "10th March";
        }
        else if(group_id == 1){
        	group = "11th March";
        }
        else if(group_id == 2){
        	group = "13th March";
        }
        else if(group_id == 3){
        	group = "14th March";
        }
        else if(group_id == 4){
        	group = "15th March";
        }
        if (group != null) {
            v = vi.inflate(GROUP_ITEM_RESOURCE, null);
            OffstageHolder holder = new OffstageHolder(v);
            holder.text.setText(Html.fromHtml(group));
        }
        
        return v;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


    public boolean hasStableIds() {
        return true;
    }
}
