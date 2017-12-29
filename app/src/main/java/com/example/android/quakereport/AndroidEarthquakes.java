package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by thema on 01/11/2017.
 */

public class AndroidEarthquakes {
    private double mEarthQuakeMagnitude;

    private String mEarthQuakeLocation;

    private long mEarthQuakeDate;

    private String mUrl;

    public AndroidEarthquakes(){

    }

    public AndroidEarthquakes (double magnitude, String location, long date, String url){
        mEarthQuakeMagnitude = magnitude;
        mEarthQuakeLocation = location;
        mEarthQuakeDate = date;
        mUrl = url;
    }

    public double getmEarthQuakeMagnitude(){
        return mEarthQuakeMagnitude;
    }

    public String getmEarthQuakeLocation(){
        return mEarthQuakeLocation;
    }

    public long getmEarthQuakeDate(){
        return mEarthQuakeDate;
    }

    public String getmUrl(){
        return mUrl;
    }
}
