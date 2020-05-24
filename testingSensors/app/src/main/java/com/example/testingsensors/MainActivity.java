package com.example.testingsensors;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    Sensor accellerometer, light, pressure;
    TextView x_value, y_value, z_value, lit, press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x_value = findViewById(R.id.x_value);
        y_value = findViewById(R.id.y_value);
        z_value = findViewById(R.id.z_value);
        lit = findViewById(R.id.Light);
        press = findViewById(R.id.pressure);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accellerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (accellerometer != null){
            sensorManager.registerListener(MainActivity.this, accellerometer, SensorManager.SENSOR_DELAY_NORMAL);
        }


    }
    public void onSensorChanged(SensorEvent )
}
