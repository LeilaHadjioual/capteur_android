package com.example.capteurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.os.Bundle;
import android.hardware.SensorManager;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(MainActivity.this, sensorListActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this, DetectSensorActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this, AccelerometreActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(MainActivity.this, DirectionActivity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(MainActivity.this, FlashActivity.class));
                break;
            case R.id.button6:
                startActivity(new Intent(MainActivity.this, ProximiteActivity.class));
                break;
            case R.id.button7:
                startActivity(new Intent(MainActivity.this, CoordinatesActivity.class));
                break;
            case R.id.button8:
                startActivity(new Intent(MainActivity.this, DistanceActivity.class));
                break;
            case R.id.button9:
                startActivity(new Intent(MainActivity.this, DirectionGpsActivity.class));
                break;
        }
    }
}
