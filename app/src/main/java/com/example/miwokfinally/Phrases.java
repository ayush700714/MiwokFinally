package com.example.miwokfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<WordAdapter> s = new ArrayList<WordAdapter>();
        s.add(new WordAdapter("lutti","one",0,R.raw.number_one));
        s.add(new WordAdapter("df","two",0,R.raw.number_one));
        s.add(new WordAdapter("xv","three",0,R.raw.number_one));
        s.add(new WordAdapter("luttxfz","four",0,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.ic_launcher_foreground,R.raw.number_one));
        CustomAdapter c =new CustomAdapter(this,s,R.color.green);
        ListView l = (ListView)findViewById(R.id.list);
        l.setAdapter(c);
    }
}
