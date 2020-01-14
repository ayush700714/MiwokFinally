package com.example.miwokfinally;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<WordAdapter> {

    private int color23;
    public CustomAdapter(Activity context, ArrayList<WordAdapter> b,int f)
    {

        super(context,0,b);
        color23=f;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
      View listview = convertView;
      if(listview==null)
      {
          listview= LayoutInflater.from(getContext()).inflate(

                  R.layout.listi_tem, parent, false);
      }
      WordAdapter a = getItem(position);
        LinearLayout li = (LinearLayout)listview.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(),color23);
        li.setBackgroundColor(color);
        TextView b = (TextView) listview.findViewById(R.id.miwok);
        b.setText(a.getMiwok());
        TextView c = (TextView) listview.findViewById(R.id.deafult);
        c.setText(a.getdefault());
        ImageView d =(ImageView) listview.findViewById(R.id.image23);
        if(a.getdisplay())
        {

            d.setImageResource(a.getimage());
        }
        else
        {
            d.setVisibility(View.GONE);
        }
        return listview;
    }
}
