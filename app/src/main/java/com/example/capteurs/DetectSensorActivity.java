package com.example.capteurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class DetectSensorActivity extends AppCompatActivity {
    TextView text1;
    SensorManager sensorManager;
    List<Sensor> sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect_sensor);

        text1 = findViewById(R.id.capteur);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if (sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) != null) {
            text1.setText("le capteur  magnetomètre existe");
        } else {
            text1.setText("le capteur magnetomètre n'exste pas");
        }

        //vérifie si capteur existe
//        Sensor magn = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
//        if (magn != null) {
//            Log.d("magnetometre", "ok magnetometre");
//            text1.setText("capteur magnetometre existe ");
//        } else {
//            Log.d("magnetometre", "fonctionnalités indisponibles car il n'y a pas de magnetometre");
//            text1.setText("capteur magnetometre n'existe pas");
//
//
//        }
    }
}
