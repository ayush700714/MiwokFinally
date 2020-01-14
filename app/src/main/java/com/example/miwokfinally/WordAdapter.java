package com.example.miwokfinally;

public class WordAdapter {

   private String miwok2,default2;
   private int r;
   private int t;
   private Boolean s;
    public WordAdapter(String miwok, String default1,int r1,int t1)
    {
        miwok2=miwok;
        default2=default1;
        r=r1;
        t=t1;
        if(r==0)
        {
            s=false;
        }
        else
        {
            s=true;
        }
    }
    public  String getMiwok()
    {
        return miwok2;
    }
    public String getdefault()
    {
        return default2;
    }
    public int getimage()
    {
        return r;
    }
    public Boolean getdisplay()
    {
        return s;
    }
    public int getaudio()
    {
        return t;
    }
}
