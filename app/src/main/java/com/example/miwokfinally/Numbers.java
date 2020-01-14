package com.example.miwokfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    private   MediaPlayer mp;
    private AudioManager am;

    private AudioManager.OnAudioFocusChangeListener lmk = new AudioManager.OnAudioFocusChangeListener(){
        public void onAudioFocusChange(int focusChange)
      {
         if(focusChange==AudioManager.AUDIOFOCUS_LOSS)
         {
             mRelease(mp);
         }
         else if(focusChange==AudioManager.AUDIOFOCUS_GAIN)
         {
             mp.start();
         }
         else if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)
         {
             mp.pause();
             mp.seekTo(0);
         }
      }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
      final  ArrayList<WordAdapter> s = new ArrayList<WordAdapter>();
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
        s.add(new WordAdapter("lutti","one",R.drawable.number_one,R.raw.al));
        CustomAdapter c =new CustomAdapter(this,s,R.color.green);
        ListView l = (ListView)findViewById(R.id.list);
        l.setAdapter(c);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WordAdapter a = s.get(i);
                mRelease(mp);
                am = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
                int result = am.requestAudioFocus(lmk,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if(result==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                {
                    mp = MediaPlayer.create(Numbers.this,a.getaudio());
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mRelease(mp);
                        }
                    });
                }

            }
        });

    }
    private void mRelease(MediaPlayer m)
    {
        if(m!=null)
        {
            m.release();
        }

        m=null;
        if(am!=null)
       am.abandonAudioFocus(lmk);
    }
    @Override
    public void onPause()
    {
        super.onPause();
        mRelease(mp);
    }
}
