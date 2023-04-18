package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     TextView output;
     EditText EnterNum;
     Button miles;
     Button meters;
     Button kilometers;
     Button centimeter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal2);
        miles = findViewById(R.id.miles);
        meters = findViewById(R.id.meters);
        kilometers = findViewById(R.id.kilometer);
        centimeter = findViewById(R.id.centimeter);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meters = (number * 1000 );
                output.setText("Value in meters : "+ meters);
            }
        });
        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float centimeter = (number * 100 );
                output.setText("Value in centimeter :" + centimeter);
            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float km = (number / 1000 );
                output.setText("Value in kilometer : " + km);
            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double miles = (number / 1.609 );
                output.setText("Value in miles : " + miles);
            }
        });
    }
}