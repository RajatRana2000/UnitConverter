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

public class time extends AppCompatActivity {
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
        Text.setText("Time Converter");
        String[] arrayspinner = new String[]{"Year y","Week wk","Day d","Hour h","Minute min","Second s","Millisecond ms"};
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

        {
            if (from == 0 && to == 0) {
                // y to y
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 1;
                    outputvalue.setText(result + " y");
                }
            }


            if (from == 0 && to == 1) {
                // y to wk
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 52.1428571;
                    outputvalue.setText(result + " wk");
                }
            }

            if (from == 0 && to == 2) {
                // y to d
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 365;
                    outputvalue.setText(result + " d");
                }
            }

            if (from == 0 && to == 3) {
                // y to h
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 8760;
                    outputvalue.setText(result + " h");
                }
            }

            if (from == 0 && to == 4) {
                // y to min
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 525600;
                    outputvalue.setText(result + " min");
                }
            }

            if (from == 0 && to == 5) {
                // y to s
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 31536000;
                    outputvalue.setText(result + " s");
                }
            }

            if (from == 0 && to == 6) {
                // y to ms
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 31536000000l;
                    outputvalue.setText(result + " ms");
                }
            }

        }

        {
            if (from == 1 && to == 0) {
                // wk to y
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value / 0.0191781;
                    outputvalue.setText(result + " y");
                }
            }


            if (from == 1 && to == 1) {
                // wk to wk
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 1;
                    outputvalue.setText(result + " wk");
                }
            }

            if (from == 1 && to == 2) {
                // wk to d
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 7;
                    outputvalue.setText(result + " d");
                }
            }

            if (from == 1 && to == 3) {
                // wk to h
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 168;
                    outputvalue.setText(result + " h");
                }
            }

            if (from == 1 && to == 4) {
                // wk to min
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 10080;
                    outputvalue.setText(result + " min");
                }
            }

            if (from == 1 && to == 5) {
                // wk to s
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 604800;
                    outputvalue.setText(result + " s");
                }
            }

            if (from == 1 && to == 6) {
                // wk to ms
                if (entervalue.getText().toString().equals("")) {
                    outputvalue.setText("0");
                } else {
                    double value = Double.parseDouble(entervalue.getText().toString());
                    result = value * 604800000;
                    outputvalue.setText(result + " ms");
                }
            }


        }


        if (from == 2 && to == 0){
            // d to y
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/365;
                outputvalue.setText(result +" y");
            }
        }

        if (from == 2 && to == 1){
            // d to wk
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/7;
                outputvalue.setText(result +" wk");
            }
        }

        if (from == 2 && to == 2){
            // d to d
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" d");
            }
        }

        if (from == 2 && to == 3){
            // d to h
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*24;
                outputvalue.setText(result +" h");
            }
        }

        if (from == 2 && to == 4){
            // d to min
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1440;
                outputvalue.setText(result +" min");
            }
        }

        if (from == 2 && to == 5){
            // d to s
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*86400;
                outputvalue.setText(result +" s");
            }
        }

        if (from == 2 && to == 6){
            // d to ms
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*86400000;
                outputvalue.setText(result +" ms");
            }
        }


        if (from == 3 && to == 0){
            // h to y
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/8760;
                outputvalue.setText(result +" y");
            }
        }

        if (from == 3 && to == 1){
            // h to wk
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/168;
                outputvalue.setText(result +" wk");
            }
        }

        if (from == 3 && to == 2){
            // h to d
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/24;
                outputvalue.setText(result +" d");
            }
        }

        if (from == 3 && to == 3){
            // h to h
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" h");
            }
        }

        if (from == 3 && to == 4){
            // h to min
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*60;
                outputvalue.setText(result +" min");
            }
        }

        if (from == 3 && to == 5){
            // h to s
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*3600;
                outputvalue.setText(result +" s");
            }
        }

        if (from == 3 && to == 6){
            // h to ms
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*3600000;
                outputvalue.setText(result +" ms");
            }
        }



        if (from == 4 && to == 0){
            // min to y
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/525600;
                outputvalue.setText(result +" y");
            }
        }

        if (from == 4 && to == 1){
            // min to wk
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/10080;
                outputvalue.setText(result +" wk");
            }
        }

        if (from == 4 && to == 2){
            // min to d
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1440;
                outputvalue.setText(result +" d");
            }
        }

        if (from == 4 && to == 3){
            // min to h
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/60;
                outputvalue.setText(result +" h");
            }
        }

        if (from == 4 && to == 4){
            // min to min
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" min");
            }
        }

        if (from == 4 && to == 5){
            // min to s
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*60;
                outputvalue.setText(result +" s");
            }
        }

        if (from == 4 && to == 6){
            // min to ms
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*60000;
                outputvalue.setText(result +" ms");
            }
        }


        if (from == 5 && to == 0){
            // s to y
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/31540000;
                outputvalue.setText(result +" y");
            }
        }

        if (from == 5 && to == 1){
            // s to wk
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/604800;
                outputvalue.setText(result +" wk");
            }
        }

        if (from == 5 && to == 2){
            // s to d
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/86400;
                outputvalue.setText(result +" d");
            }
        }

        if (from == 5 && to == 3){
            // s to h
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/3600;
                outputvalue.setText(result +" h");
            }
        }

        if (from == 5 && to == 4){
            // s to min
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/60;
                outputvalue.setText(result +" min");
            }
        }

        if (from == 5 && to == 5){
            // s to s
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" s");
            }
        }

        if (from == 5 && to == 6){
            // s to ms
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1000;
                outputvalue.setText(result +" ms");
            }
        }


        if (from == 6 && to == 0){
            // ms to y
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/365000000;
                outputvalue.setText(result +" y");
            }
        }

        if (from == 6 && to == 1){
            // ms to wk
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/604800000;
                outputvalue.setText(result +" wk");
            }
        }

        if (from == 6 && to == 2){
            // ms to d
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/86400000;
                outputvalue.setText(result +" d");
            }
        }

        if (from == 6 && to == 3){
            // ms to h
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/3600000;
                outputvalue.setText(result +" h");
            }
        }

        if (from == 6 && to == 4){
            // ms to min
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/60000;
                outputvalue.setText(result +" min");
            }
        }

        if (from == 6 && to == 5){
            // ms to s
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value/1000;
                outputvalue.setText(result +" s");
            }
        }

        if (from == 6 && to == 6){
            // ms to ms
            if (entervalue.getText().toString().equals("")){
                outputvalue.setText("0");
            }else {
                double value = Double.parseDouble(entervalue.getText().toString());
                result=value*1;
                outputvalue.setText(result +" ms");
            }
        }






    }


}