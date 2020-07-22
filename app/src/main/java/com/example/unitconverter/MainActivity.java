package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         CardView length = (CardView) findViewById(R.id.length);
         CardView weight= (CardView) findViewById(R.id.weight);
         final CardView currency= (CardView) findViewById(R.id.currency);
         CardView volume = (CardView) findViewById(R.id.volume);
         CardView time = (CardView) findViewById(R.id.time);
         final CardView temperature = (CardView) findViewById(R.id.temperature);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,length.class);
                startActivity(intent);

            }

        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,weight.class);
                startActivity(intent);
            }
        });

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,currency.class);
                startActivity(intent);
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,volume.class);
                startActivity(intent);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,time.class);
                startActivity(intent);

            }
        });

        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,temperature.class);
                startActivity(intent);
            }
        });

    }

}