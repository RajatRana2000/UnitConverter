package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class temperature extends AppCompatActivity {
    private Spinner inputspinner,outputspinner;
    private EditText entervalue;
    private TextView outputvalue;
    private TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defaultlayout);
        UserInterface();
    }
    public void UserInterface(){

        inputspinner = findViewById(R.id.spinner_from);
        outputspinner = findViewById(R.id.spinner_to);
        entervalue = findViewById(R.id.input_value);
        outputvalue = findViewById(R.id.result);
        Text=findViewById(R.id.text);
        Text.setText("Temperature Converter");

        String[] arrayspinner = new String[]{"Celsius °C","Fahrenheit °F ","Kelvin K"};  //Alt+ 0176=°
        ArrayAdapter<String> length = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arrayspinner);
        length.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        inputspinner.setAdapter(length);
        outputspinner.setAdapter(length);
        outputspinner.setSelection(1);
        entervalue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Calculation();

            }
        });


        inputspinner.setOnItemSelectedListener(selector);
        outputspinner.setOnItemSelectedListener(selector);

    }

    private AdapterView.OnItemSelectedListener selector = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Calculation();

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
    public void Calculation(){
        int from = inputspinner.getSelectedItemPosition();  //Select the input unit
        int to  = outputspinner.getSelectedItemPosition(); //Select the desired output unit
        double result = 0.0;

        if (from == 0 && to == 0){
            // Celsius to Celsius
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" °C");
            }
        }

        if (from == 0 && to == 1){
            // Celsius to Fahrenheit
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                value=(value * 9/5 ) + 32;
                result=value;
                outputvalue.setText(result +" °F");
            }
        }

        if (from == 0 && to == 2){
            // Celsius to Kelvin
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                value=value + 273.15;
                result=value;
                outputvalue.setText(result +" K");
            }
        }

        if (from == 1 && to == 0){
            // Fahrenheit to Celsius
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                value = (value - 32) * 5/9;
                result=value;
                outputvalue.setText(result +" °C");
            }
        }

        if (from == 1 && to == 1){
            // Fahrenheit to Fahrenheit
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" °F");
            }
        }

        if (from == 1 && to == 2){
            //Fahrenheit to Kelvin
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                value= (value - 32) * 5/9 + 273.15;
                result=value;
                outputvalue.setText(result +" K");
            }
        }

        if (from == 2 && to == 0){
            // Kelvin to Celsius
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value-273.15;
                outputvalue.setText(result +" °C");
            }
        }

        if (from == 2 && to == 1){
            //Kelvin to Fahrenheit
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                value = (value - 273.15) * 9/5 + 32;
                result=value;
                outputvalue.setText(result +" °F");
            }
        }

        if (from == 2 && to == 2){
            //Kelvin to Kelvin
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" K");
            }
        }




    }


}