package com.example.capteurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class sensorListActivity extends AppCompatActivity {

    SensorManager sensorManager;
    List<Sensor> sensor;
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_list);

        //get all capteurs
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        lv = (ListView) findViewById(R.id.listView1);
        sensor = sensorManager.getSensorList(Sensor.TYPE_ALL);
        lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1, sensor));
    }
}
