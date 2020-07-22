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

public class volume extends AppCompatActivity {
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
        Text.setText("Volume Converter");
//Alt+0179 =³ power
        String[] arrayspinner = new String[]{"Cubic Metre m³","Cubic Centimetre cm³","CUBIC Milimetre mm³","Litre l","Millilitre ml"};
        ArrayAdapter<String> volume = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arrayspinner);
        volume.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        inputspinner.setAdapter(volume);
        outputspinner.setAdapter(volume);
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
            // Cubic metre to cubic metre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" m³");
            }
        }

        if (from == 0 && to == 1){
            // Cubic metre to cubic Centimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" cm³");
            }
        }

        if (from == 0 && to == 2){
            // Cubic metre to cubic Millimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000000;
                outputvalue.setText(result +" mm³");
            }
        }

        if (from == 0 && to == 3){
            // Cubic metre to  Litre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" l");
            }
        }

        if (from == 0 && to == 4){
            // Cubic metre to  Millilitre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" ml");
            }
        }


        if (from == 1 && to == 0){
            // Cubic Centimetre to cubic metre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000000;
                outputvalue.setText(result +" m³");
            }
        }

        if (from == 1 && to == 1){
            // Cubic Centimetre to cubic Centimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" cm³");
            }
        }

        if (from == 1 && to == 2){
            // Cubic Centimetre to cubic Millimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" mm³");
            }
        }

        if (from == 1 && to == 3){
            // Cubic Centimetre to  Litre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000;
                outputvalue.setText(result +" l");
            }
        }

        if (from == 1 && to == 4){
            // Cubic Centimetre to  Millilitre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" ml");
            }
        }


        if (from == 2 && to == 0){
            // Cubic Millimetre to cubic metre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000000000;
                outputvalue.setText(result +" m³");
            }
        }

        if (from == 2 && to == 1){
            // Cubic Millimetre to cubic Centimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000;
                outputvalue.setText(result +" cm³");
            }
        }

        if (from == 2 && to == 2){
            // Cubic Millimetre to cubic Millimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" ml");
            }
        }

        if (from == 2 && to == 3){
            // Cubic Millimetre to  Litre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" l");
            }
        }

        if (from == 2 && to == 4){
            // Cubic Millimetre to  Millilitre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000;
                outputvalue.setText(result +" ml");
            }
        }


        if (from == 3 && to == 0){
            // Litre to cubic metre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000;
                outputvalue.setText(result +" m³");
            }
        }

        if (from == 3 && to == 1){
            //Litre to cubic Centimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" cm³");
            }
        }

        if (from == 3 && to == 2){
            // Litre to cubic Millimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000000;
                outputvalue.setText(result +" mm³");
            }
        }

        if (from == 3 && to == 3){
            //Litre to  Litre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" l");
            }
        }

        if (from == 3 && to == 4){
            // Litre to  Millilitre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" ml");
            }
        }



        if (from == 4 && to == 0){
            // Millilitre to cubic metre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000000;
                outputvalue.setText(result +" m³");
            }
        }

        if (from == 4 && to == 1){
            // Millilitre to cubic Centimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" cm³");
            }
        }

        if (from == 4 && to == 2){
            // Millilitre to cubic Millimetre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" mm³");
            }
        }

        if (from == 4 && to == 3){
            // Millilitre to  Litre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000;
                outputvalue.setText(result +" l");
            }
        }

        if (from == 4 && to == 4){
            // Millilitre to  Millilitre
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" ml");
            }
        }








    }


}