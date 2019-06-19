package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,abs,mul,div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.txt1);
        num2 = (EditText)findViewById(R.id.txt2);
        add = (Button) findViewById(R.id.btn1);
        abs = (Button) findViewById(R.id.btn2);
        mul = (Button)findViewById(R.id.btn3);
        div =(Button)findViewById(R.id.btn4);
        result = (TextView) findViewById(R.id.finalre);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double x = Double.parseDouble(num1.getText().toString());
                Double y = Double.parseDouble(num2.getText().toString());
                Double sum=x+y;
                result.setText(sum.toString());
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double x = Double.parseDouble(num1.getText().toString());
                Double y = Double.parseDouble(num2.getText().toString());
                Double sum=x-y;
                result.setText(sum.toString());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double x = Double.parseDouble(num1.getText().toString());
                Double y = Double.parseDouble(num2.getText().toString());
                Double sum=x*y;
                result.setText(sum.toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double x = Double.parseDouble(num1.getText().toString());
                Double y = Double.parseDouble(num2.getText().toString());
                Double sum=x/y;
                result.setText(sum.toString());
            }
        });
    }
}
