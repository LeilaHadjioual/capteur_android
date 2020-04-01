package com.example.capteurs;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class DistanceActivity extends AppCompatActivity {

    private TextView distTxt;
    double latA = 17.4511252;
    double latB = 17.4200480;
    double lngA = 78.3748113;
    double lngB = 78.4442193;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        distTxt = findViewById(R.id.distGps);

        Location a = new Location("point A");

        a.setLatitude(latA);
        a.setLongitude(lngA);

        Location b = new Location("point B");

        b.setLatitude(latB);
        b.setLongitude(lngB);

        float distance = a.distanceTo(b);
        distTxt.setText("distance " + distance/1000);

    }


}
