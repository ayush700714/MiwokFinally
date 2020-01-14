package com.example.miwokfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<WordAdapter> s = new ArrayList<WordAdapter>();
        s.add(new WordAdapter("lutti","one",R.drawable.number_one,R.raw.number_one));
        s.add(new WordAdapter("df","two",R.drawable.number_two,R.raw.number_one));
        s.add(new WordAdapter("xv","three",R.drawable.number_three,R.raw.number_one));
        s.add(new WordAdapter("luttxfz","four",R.drawable.number_four,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_four,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_five,R.raw.number_one));
        s.add(new WordAdapter("df","two",R.drawable.number_six,R.raw.number_one));
        s.add(new WordAdapter("xv","three",R.drawable.number_seven,R.raw.number_one));
        s.add(new WordAdapter("luttxfz","four",R.drawable.number_eight,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_nine,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_one,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_one,R.raw.number_one));
        s.add(new WordAdapter("df","two",R.drawable.number_two,R.raw.number_one));
        s.add(new WordAdapter("xv","three",R.drawable.number_three,R.raw.number_one));
        s.add(new WordAdapter("luttxfz","four",R.drawable.number_four,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_four,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_five,R.raw.number_one));
        s.add(new WordAdapter("df","two",R.drawable.number_six,R.raw.number_one));
        s.add(new WordAdapter("xv","three",R.drawable.number_seven,R.raw.number_one));
        s.add(new WordAdapter("luttxfz","four",R.drawable.number_eight,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_nine,R.raw.number_one));
        s.add(new WordAdapter("lutti","one",R.drawable.number_one,R.raw.number_one));
        CustomAdapter c =new CustomAdapter(this,s,R.color.green);
        ListView l = (ListView)findViewById(R.id.list);
        l.setAdapter(c);
    }
}
