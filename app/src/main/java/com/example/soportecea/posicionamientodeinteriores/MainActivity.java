package com.example.soportecea.posicionamientodeinteriores;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    Arbol arbol;
    String lab;
    private TextView txtLabA;
    private TextView txtLabB;
    private TextView txtLabC;
    private TextView txtLabD;
    private TextView txtLabE;
    private Button btnLocalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arbol = new Arbol();
        txtLabA=(TextView)findViewById(R.id.textCuatro);
        txtLabB=(TextView)findViewById(R.id.textCinco);
        txtLabC=(TextView)findViewById(R.id.textTres);
        txtLabD=(TextView)findViewById(R.id.textDos);
        txtLabE=(TextView)findViewById(R.id.textUno);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        mSensorManager.registerListener(this, mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this){
            switch (event.sensor.getType()){
                case Sensor.TYPE_MAGNETIC_FIELD:
                    lab = arbol.comparar(event.values[0],event.values[1],event.values[2]);
                    Log.i("DEBUG",String.valueOf(event.values[0])+String.valueOf(event.values[1])+String.valueOf(event.values[2]));
                    switch(lab){
                        case "A":
                            txtLabA.setTextColor(Color.WHITE);
                            txtLabA.setBackgroundColor(Color.CYAN);
                            txtLabB.setTextColor(Color.BLACK);
                            txtLabB.setBackgroundColor(Color.WHITE);
                            txtLabC.setTextColor(Color.BLACK);
                            txtLabC.setBackgroundColor(Color.WHITE);
                            txtLabD.setTextColor(Color.BLACK);
                            txtLabD.setBackgroundColor(Color.WHITE);
                            txtLabE.setTextColor(Color.BLACK);
                            txtLabE.setBackgroundColor(Color.WHITE);
                            break;
                        case "B":
                            txtLabB.setTextColor(Color.WHITE);
                            txtLabB.setBackgroundColor(Color.CYAN);
                            txtLabA.setTextColor(Color.BLACK);
                            txtLabA.setBackgroundColor(Color.WHITE);
                            txtLabC.setTextColor(Color.BLACK);
                            txtLabC.setBackgroundColor(Color.WHITE);
                            txtLabD.setTextColor(Color.BLACK);
                            txtLabD.setBackgroundColor(Color.WHITE);
                            txtLabE.setTextColor(Color.BLACK);
                            txtLabE.setBackgroundColor(Color.WHITE);
                            break;
                        case "C":
                            txtLabC.setTextColor(Color.WHITE);
                            txtLabC.setBackgroundColor(Color.CYAN);
                            txtLabB.setTextColor(Color.BLACK);
                            txtLabB.setBackgroundColor(Color.WHITE);
                            txtLabA.setTextColor(Color.BLACK);
                            txtLabA.setBackgroundColor(Color.WHITE);
                            txtLabD.setTextColor(Color.BLACK);
                            txtLabD.setBackgroundColor(Color.WHITE);
                            txtLabE.setTextColor(Color.BLACK);
                            txtLabE.setBackgroundColor(Color.WHITE);
                            break;
                        case "D":
                            txtLabD.setTextColor(Color.WHITE);
                            txtLabD.setBackgroundColor(Color.CYAN);
                            txtLabB.setTextColor(Color.BLACK);
                            txtLabB.setBackgroundColor(Color.WHITE);
                            txtLabC.setTextColor(Color.BLACK);
                            txtLabC.setBackgroundColor(Color.WHITE);
                            txtLabA.setTextColor(Color.BLACK);
                            txtLabA.setBackgroundColor(Color.WHITE);
                            txtLabE.setTextColor(Color.BLACK);
                            txtLabE.setBackgroundColor(Color.WHITE);
                            break;
                        case "E":
                            txtLabE.setTextColor(Color.WHITE);
                            txtLabE.setBackgroundColor(Color.CYAN);
                            txtLabB.setTextColor(Color.BLACK);
                            txtLabB.setBackgroundColor(Color.WHITE);
                            txtLabC.setTextColor(Color.BLACK);
                            txtLabC.setBackgroundColor(Color.WHITE);
                            txtLabD.setTextColor(Color.BLACK);
                            txtLabD.setBackgroundColor(Color.WHITE);
                            txtLabA.setTextColor(Color.BLACK);
                            txtLabA.setBackgroundColor(Color.WHITE);
                            break;
                    }

                    break;
                default:
                    Log.i("DEBUG","Holi");
                    break;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
