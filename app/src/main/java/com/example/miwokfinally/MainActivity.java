package com.example.miwokfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView a = (TextView) findViewById(R.id.color);
        a.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                  Intent intent = new Intent(MainActivity.this,Color.class);
                  startActivity(intent);
            }
        });
        TextView b = (TextView) findViewById(R.id.family);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(intent);
            }
        });
        TextView c = (TextView) findViewById(R.id.phrases);
        c.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,Phrases.class);
                startActivity(intent);
            }
        });
        TextView d = (TextView) findViewById(R.id.numbers);
        d.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,Numbers.class);
                startActivity(intent);
            }
        });
    }
}
