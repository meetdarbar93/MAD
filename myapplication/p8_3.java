package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class p8_3 extends AppCompatActivity {
    Button btn;
    TextView tv;
    RadioGroup gender;
    CheckBox java, kotlin, python, typeScript;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p8_3);

        java = findViewById(R.id.java);
        kotlin = findViewById(R.id.kotlin);
        python = findViewById(R.id.python);
        typeScript = findViewById(R.id.typeScript);

        gender = findViewById(R.id.p8gender);
        btn = findViewById(R.id.p8_check);
        tv = findViewById(R.id.p8tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();

                if(java.isChecked()) result.append("Java\n");
                if(kotlin.isChecked()) result.append("kotlin\n");
                if(python.isChecked()) result.append("python\n");
                if(typeScript.isChecked()) result.append("typeScript");

                if(result.length() == 0)
                    result.append("No language selected");
                int id = gender.getCheckedRadioButtonId();
                if(id == -1) {
                    Toast.makeText(p8_3.this, "Select gender", Toast.LENGTH_SHORT).show();
                    return;
                }
                    RadioButton rb = (RadioButton) findViewById(id);
                Toast.makeText(p8_3.this, "Gender : " + rb.getText().toString(), Toast.LENGTH_SHORT).show();
                tv.setText(result.toString());

            }
        });
    }
}
