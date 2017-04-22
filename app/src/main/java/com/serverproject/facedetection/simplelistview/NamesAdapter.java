package com.serverproject.facedetection.simplelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Eslam on 4/22/2017.
 */


public class NamesAdapter extends BaseAdapter {



    String namesemployee[];
    Context context;
    public NamesAdapter(Context context,String[]datanameemployee){
     this.context=context;
        this.namesemployee=datanameemployee;

    }
    @Override
    public int getCount() {
        return namesemployee.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //1.draw data

        //2.define attributes view

        // return view


       // parent = (LinearLayout)convertView.findViewById(R.id.linear);
       convertView =LayoutInflater.from(context).inflate(R.layout.display_items,parent,false);

        TextView txtdisplay=(TextView)convertView.findViewById(R.id.txtdisplaynames);
//
//        namesemployee posiiton =0  "eslam"
//        namesemployee posiiton = 1 "ahmed"

        txtdisplay.setText(namesemployee[position]);
        return convertView;
    }
}
