package com.example.capteurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AccelerometreActivity extends AppCompatActivity {

    private SensorManager sensorManager = null;
    private Sensor accel = null;
    TextView txt3;


    final SensorEventListener mSensorEventListener = new SensorEventListener() {
        float x, y, z;

        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float acceleration = (x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
            LinearLayout backGround = findViewById(R.id.accelerometre);
            txt3 = findViewById(R.id.avant);

            if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
                x = sensorEvent.values[0];
                y = sensorEvent.values[1];
                z = sensorEvent.values[2];

                if (acceleration > 2 && acceleration < 4) {
                    backGround.setBackgroundColor(Color.parseColor("#000000"));
                }
                if (acceleration < 2) {
                    backGround.setBackgroundColor(Color.parseColor("#008000"));
                }
                if (acceleration > 4) {
                    backGround.setBackgroundColor(Color.parseColor("#FF0000"));
                }

                if (x < 0) {
                    txt3.setText("droite");
                } else if (x > 0) {
                    txt3.setText("gauche");
                } else if (y < 0) {
                    txt3.setText("bas");
                } else if (y > 0) {
                    txt3.setText("haut");
                }
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometre);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(mSensorEventListener, accel);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(mSensorEventListener, accel, SensorManager.SENSOR_DELAY_NORMAL);
    }


}





