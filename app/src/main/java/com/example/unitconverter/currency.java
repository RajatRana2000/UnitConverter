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

public class currency extends AppCompatActivity {
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
        Text.setText("Currency Converter");

        String[] arrayspinner = new String[]{" Indian Rupee INR","United States Dollar USD","Chinese Yuan CNY","Euro EUR","Russian Ruble RUB"};
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
            //Rupee to Rupee
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result+" INR");
            }
        }

        if (from == 0 && to == 1){
            //Rupee to Us Dollar
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.013;
                outputvalue.setText(result+" USD");
            }
        }

        if (from == 0 && to == 2){
            //Rupee to Yuan
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.093 ;
                outputvalue.setText(result +" CNY");
            }
        }

        if (from == 0 && to == 3){
            //Rupee to Euro
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.012;
                outputvalue.setText(result +" EUR");
            }
        }

        if (from == 0 && to == 4){
            //Rupee to Ruble
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.95;
                outputvalue.setText(result +" RUB");
            }
        }

        if (from == 1 && to == 0){
            //USD to Rupee
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*74.64;
                outputvalue.setText(result+" INR" );
            }
        }

        if (from == 1 && to == 1){
            //USD to Us Dollar
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result+" USD");
            }
        }

        if (from == 1 && to == 2){
            //USD to Yuan
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*6.97;
                outputvalue.setText(result +" CNR");
            }
        }

        if (from == 1 && to == 3){
            //USD to Euro
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.87;
                outputvalue.setText(result +" Eur");
            }
        }

        if (from == 1 && to == 4){
            //USD to Ruble
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*70.73;
                outputvalue.setText(result +" RUB");
            }
        }

        if (from == 2 && to == 0){
            //Yuan to Rupee
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*10.70;
                outputvalue.setText(result+" INR");
            }
        }

        if (from == 2 && to == 1){
            //Yuan to Us Dollar
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.14;
                outputvalue.setText(result+" USD");
            }
        }

        if (from == 2 && to == 2){
            //Yuan to Yuan
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" CNR");
            }
        }

        if (from == 2 && to == 3){
            //Yuan to Euro
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.12;
                outputvalue.setText(result +" EUR");
            }
        }

        if (from == 2 && to == 4){
            //Yuan to Ruble
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*10.14;
                outputvalue.setText(result +" RUB");
            }
        }

        if (from == 3 && to == 0){
            //Euro to Rupee
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*86.15;
                outputvalue.setText(result+" INR");
            }
        }

        if (from == 3 && to == 1){
            //Euro to Us Dollar
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1.15;
                outputvalue.setText(result+" USD");
            }
        }

        if (from == 3 && to == 2){
            //Euro to Yuan
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*8.04;
                outputvalue.setText(result +" CNR");
            }
        }

        if (from == 3 && to == 3){
            //Euro to Euro
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" EUR");
            }
        }

        if (from == 3 && to == 4){
            //Euro to Ruble
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*81.63;
                outputvalue.setText(result +" RUB");
            }
        }

        if (from == 4 && to == 0){
            //Ruble to Rupee
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1.06;
                outputvalue.setText(result+" INR");
            }
        }

        if (from == 4 && to == 1){
            //Ruble to Us Dollar
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.014;
                outputvalue.setText(result+" USD");
            }
        }

        if (from == 4 && to == 2){
            //Ruble to Yuan
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.099;
                outputvalue.setText(result +" CNR");
            }
        }

        if (from == 4 && to == 3){
            //Rupee to Euro
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*0.012;
                outputvalue.setText(result +" EUR");
            }
        }

        if (from == 4 && to == 4){
            //Rupee to Ruble
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" RUB");
            }
        }



    }


}