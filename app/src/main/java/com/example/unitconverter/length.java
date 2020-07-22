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

public class length extends AppCompatActivity {
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
        Text.setText("Length Converter");


        String[] arrayspinner = new String[]{"Kilometre km","Metre m","Centimetre cm","Milimetre mm","Foot ft","Inch in"};
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
        //double i;

        if (from == 0 && to == 0){
            // km to km
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" km");
            }
        }

        if (from == 0 && to == 1){
            //km to m
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" m");
            }
        }

        if (from == 0 && to == 2){
            //km to cm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*100000;
                outputvalue.setText(result +" cm");
            }
        }

        if (from == 0 && to == 3){
            //km to mm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" mm");
            }
        }

        if (from == 0 && to == 4){
           //km to ft
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*3280.8399;
                outputvalue.setText(result +" ft");
            }
        }

        if (from == 0 && to == 5){
            //km to in
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*39370.0787;
                outputvalue.setText(result +" in");
            }
        }


        if (from == 1 && to == 0){
           //m to km
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.001;
                outputvalue.setText(result +" km");
            }
        }

        if (from == 1 && to == 1){
            // m to m
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" m");
            }
        }

        if (from == 1 && to == 2){
            // m to cm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*100;
                outputvalue.setText(result +" cm");
            }
        }

        if (from == 1 && to == 3){
            // m to mm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" mm");
            }
        }

        if (from == 1 && to == 4){
            // m to ft
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*3.2808399;
                outputvalue.setText(result +" ft");
            }
        }

        if (from == 1 && to == 5){
            // m to in
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*39.3700787;
                outputvalue.setText(result +" in");
            }
        }


        if (from == 2 && to == 0){
            // cm to km
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.00001;
                outputvalue.setText(result +" km");
            }
        }

        if (from == 2 && to == 1){
            // cm to m
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.01;
                outputvalue.setText(result +" m");
            }
        }

        if (from == 2 && to == 2){
            // cm to cm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" cm");
            }
        }

        if (from == 2 && to == 3){
            // cm to mm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*10;
                outputvalue.setText(result +" mm");
            }
        }

        if (from == 2 && to == 4){
            // cm to ft
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.032808399;
                outputvalue.setText(result +" ft");
            }
        }

        if (from == 2 && to == 5){
            // cm to in
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.393700787;
                outputvalue.setText(result +" in");
            }
        }



        if (from == 3 && to == 0){
            // mm to km
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.000001;
                //outputvalue.setPrecision(4);
                outputvalue.setText(result +" km");
            }
        }

        if (from == 3 && to == 1){
            // mm to m
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.001;
                outputvalue.setText(result +" m");
            }
        }

        if (from == 3 && to == 2){
            // mm to cm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.1;
                outputvalue.setText(result +" cm");
            }
        }

        if (from == 3 && to == 3){
            // mm to mm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" mm");
            }
        }

        if (from == 3 && to == 4){
            // mm to ft
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.0032808399;
                outputvalue.setText(result +" ft");
            }
        }

        if (from == 3 && to == 5){
            // mm to in
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.0393700787;
                outputvalue.setText(result +" in");
            }
        }



        if (from == 4 && to == 0){
            // ft to km
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.000304799999536704;
                //outputvalue.setPrecision(4);
                outputvalue.setText(result +" km");
            }
        }

        if (from == 4 && to == 1){
            // ft to m
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.304799999536704;
                outputvalue.setText(result +" m");
            }
        }

        if (from == 4 && to == 2){
            // ft to cm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*30.4799999536704;
                outputvalue.setText(result +" cm");
            }
        }

        if (from == 4 && to == 3){
            // ft to mm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*304.799999536704;
                outputvalue.setText(result +" mm");
            }
        }

        if (from == 4 && to == 4){
            // ft to ft
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" ft");
            }
        }

        if (from == 4 && to == 5){
            // ft to in
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*11.9999999695200000186048;
                outputvalue.setText(result +" in");
            }
        }




        if (from == 5 && to == 0){
            // in to km
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.000025400000025908;
                //outputvalue.setPrecision(4);
                outputvalue.setText(result +" km");
            }
        }

        if (from == 5 && to == 1){
            // in to m
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.025400000025908;
                outputvalue.setText(result +" m");
            }
        }

        if (from == 5 && to == 2){
            // in to cm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*2.5400000025908;
                outputvalue.setText(result +" cm");
            }
        }

        if (from == 5 && to == 3){
            // in to mm
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*25.400000025908;
                outputvalue.setText(result +" mm");
            }
        }

        if (from == 5 && to == 4){
            // in to ft
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.083333333450000001292;
                outputvalue.setText(result +" ft");
            }
        }

        if (from == 5 && to == 5){
            // in to in
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" in");
            }
        }





    }


}