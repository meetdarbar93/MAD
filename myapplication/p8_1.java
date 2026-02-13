package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class p8_1 extends AppCompatActivity {
    EditText et1;
    TextView tv1, tv2, tv3, tv4;
    Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p8_1);

        et1 = (EditText) findViewById(R.id.et_8_1);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        btn = (Button) findViewById(R.id.p8_click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et1.getText().toString().trim();
                String arr[] = str.split("\\s+");

                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                if(str.equals(""))
                    Toast.makeText(p8_1.this, "Enter name", Toast.LENGTH_SHORT).show();
                
                if (arr.length == 1)
                    tv1.setText(arr[0]);
                
                else if(arr.length == 2) {
                    tv1.setText(arr[0]);
                    tv2.setText(arr[1]);
                }
                
                else if(arr.length == 3){
                    tv1.setText(arr[0]);
                    tv2.setText(arr[1]);
                    tv3.setText(arr[2]);
                }
                
                else if(arr.length == 4) {
                    tv1.setText(arr[0]);
                    tv2.setText(arr[1]);
                    tv3.setText(arr[2]);
                    tv4.setText(arr[3]);
                }
                
                else if (arr.length>4) {
                    Toast.makeText(p8_1.this, "Invalid name", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}
