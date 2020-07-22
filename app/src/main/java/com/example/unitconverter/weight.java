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

public class weight extends AppCompatActivity {
    private Spinner inputspinner,outputspinner;
    private EditText entervalue;
    private TextView outputvalue;
    public TextView Text;

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
        Text.setText("Weight Converter");

        String[] arrayspinner = new String[]{"Kilogram kg","Gram g","Milligram mg","Tonne t","Pound lb","Carat ct"};
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
            //kg to kg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" kg");
            }
        }

        if (from == 0 && to == 1){
            // kg to g
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" g");
            }
        }

        if (from == 0 && to == 2){
            // kg to mg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" mg");
            }
        }

        if (from == 0 && to == 3){
            //kg to t
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.001;
                outputvalue.setText(result +" t");
            }
        }

        if (from == 0 && to == 4){
            // kg to lb
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*2.2046226;
                outputvalue.setText(result +" lb");
            }
        }

        if (from == 0 && to == 5){
            // kg to ct
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*5000;
                outputvalue.setText(result +" ct");
            }
        }


        if (from == 1 && to == 0){
            //g to kg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.001;
                outputvalue.setText(result +" kg");
            }
        }

        if (from == 1 && to == 1){
            // g to g
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" g");
            }
        }

        if (from == 1 && to == 2){
            // g to mg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" mg");
            }
        }

        if (from == 1 && to == 3){
            //g to t
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.000001;
                outputvalue.setText(result +" t");
            }
        }

        if (from == 1 && to == 4){
            // g to lb
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.0022046226;
                outputvalue.setText(result +" lb");
            }
        }

        if (from == 1 && to == 5){
            // g to ct
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*5;
                outputvalue.setText(result +" ct");
            }
        }


        if (from == 2 && to == 0){
            //mg to kg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.000001;
                outputvalue.setText(result +" kg");
            }
        }

        if (from == 2 && to == 1){
            // mg to g
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.001;
                outputvalue.setText(result +" g");
            }
        }

        if (from == 2 && to == 2){
            // mg to mg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" mg");
            }
        }

        if (from == 2 && to == 3){
            //mg to t
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.0000000001;
                outputvalue.setText(result +" t");
            }
        }

        if (from == 2 && to == 4){
            // mg to lb
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.0000022046226;
                outputvalue.setText(result +" lb");
            }
        }

        if (from == 2 && to == 5){
            // mg to ct
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.005;
                outputvalue.setText(result +" ct");
            }
        }

        if (from == 3 && to == 0){
            // t to kg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" kg");
            }
        }

        if (from == 3 && to == 1){
            // t to g
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" g");
            }
        }

        if (from == 3 && to == 2){
            // t to mg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000000;
                outputvalue.setText(result +" mg");
            }
        }

        if (from == 3 && to == 3){
            // t to t
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" t");
            }
        }

        if (from == 3 && to == 4){
            // t to lb
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*2204.6226;
                outputvalue.setText(result +" lb");
            }
        }

        if (from == 3 && to == 5){
            // t to ct
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*5000000;
                outputvalue.setText(result +" ct");
            }
        }


        if (from == 4 && to == 0){
            // lb to kg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.453592374495299;
                outputvalue.setText(result +" kg");
            }
        }

        if (from == 4 && to == 1){
            // lb to g
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*453.592374495299;
                outputvalue.setText(result +" g");
            }
        }

        if (from == 4 && to == 2){
            // lb to mg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*453592.374495299;
                outputvalue.setText(result +" mg");
            }
        }

        if (from == 4 && to == 3){
            //lb to t
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.000453592374495299;
                outputvalue.setText(result +" t");
            }
        }

        if (from == 4 && to == 4){
            // lb to lb
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" lb");
            }
        }

        if (from == 4 && to == 5){
            // lb to ct
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*2267.961872476495;
                outputvalue.setText(result +" ct");
            }
        }


        if (from == 5 && to == 0){
            // ct to kg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.0002;
                outputvalue.setText(result +" kg");
            }
        }

        if (from == 5 && to == 1){
            // ct to g
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.2;
                outputvalue.setText(result +" g");
            }
        }

        if (from == 5 && to == 2){
            // ct to mg
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*200;
                outputvalue.setText(result +" mg");
            }
        }

        if (from == 5 && to == 3){
            // ct to t
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.00000002;
                outputvalue.setText(result +" t");
            }
        }

        if (from == 5 && to == 4){
            // ct to lb
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.00044092452;
                outputvalue.setText(result +" lb");
            }
        }

        if (from == 5 && to == 5){
            // ct to ct
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" ct");
            }
        }





    }


}