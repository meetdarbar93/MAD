package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class p3 extends AppCompatActivity {
    Button add, sub, mul, div;
    TextView ans;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p3);

        add = (Button) findViewById(R.id.ADD);
        sub = (Button) findViewById(R.id.SUB);
        mul = (Button) findViewById(R.id.MUL);
        div = (Button) findViewById(R.id.DIV);

        ans = (TextView) findViewById(R.id.ans);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString())));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString())));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString())));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString())));
            }
        });
    }
}
