package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.badge.BadgeUtils;

public class p11 extends AppCompatActivity {
    Button b;
    AutoCompleteTextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p11);

        b = (Button) findViewById(R.id.p11btn);
        tv = (AutoCompleteTextView) findViewById(R.id.acTv11);

        String str[] = getResources().getStringArray(R.array.data);
        ArrayAdapter<String> ad = new ArrayAdapter<>(p11.this, android.R.layout.simple_dropdown_item_1line, str);
        tv.setAdapter(ad);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(p11.this, tv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
