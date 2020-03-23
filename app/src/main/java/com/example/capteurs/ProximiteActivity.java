package com.example.capteurs;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ProximiteActivity extends AppCompatActivity implements SensorEventListener {

    float p;
    SensorManager sensorManager;
    Sensor proximity;

    TextView txtProx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximite);
        Log.d("distancetestt", "oncreate");
        txtProx = findViewById(R.id.text2);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        proximity = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
    }

    @Override
    protected void onPause() {
        sensorManager.unregisterListener(this, proximity);
        super.onPause();
    }

    @Override
    protected void onResume() {
        sensorManager.registerListener(this, proximity, SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        Log.d("distancetestt", "avant");

        if (event.sensor.getType() == Sensor.TYPE_PROXIMITY) {
            Log.d("distancetestt", "avant");
            p = event.values[0];
            Log.d("distancetestt", "avant");
            if (p < 10) {
                //txtProx.setText("près");
                Log.d("distancetestt", "près");
            } else {
                //txtProx.setText("loin");
                Log.d("distancetestt", "loin");
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}






