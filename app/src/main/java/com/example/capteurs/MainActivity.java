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

    //    SensorManager sensorManager;
//    List<Sensor> sensor;
//    ListView lv;
//    TextView sen;
    Button btn1, btn2, btn3, btn4, btn5, btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
       // btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
       // btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);


//        Intent intent = new Intent(MainActivity.this, AccelActivity.class);
//        startActivity(intent);
//        Button btn3 = findViewById(R.id.goto3);
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("s","s");
//                Intent intent = new Intent(MainActivity.this, AccelActivity.class);
//                startActivity(intent);
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1: //switch to the spending view
                startActivity(new Intent(MainActivity.this, sensorListActivity.class));
                break;
            case R.id.button2: //switch to the spending view
                startActivity(new Intent(MainActivity.this, DetectSensorActivity.class));
                break;
            case R.id.button3: //switch to the spending view
                startActivity(new Intent(MainActivity.this, AccelerometreActivity.class));
                break;
//            case R.id.button4: //switch to the spending view
//                startActivity(new Intent(MainActivity.this, DirectionActivity.class));
//                break;
            case R.id.button5: //switch to the spending view
                startActivity(new Intent(MainActivity.this, FlashActivity.class));
                break;
            case R.id.button6: //switch to the spending view
                startActivity(new Intent(MainActivity.this, ProximiteActivity.class));
                break;
        }
    }
}
