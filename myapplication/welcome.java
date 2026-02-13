package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class welcome extends AppCompatActivity {
    TextView tvWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        tvWelcome = (TextView) findViewById(R.id.tvWelcome);

        String username = getIntent().getStringExtra("Username");
        tvWelcome.setText("Welcome " + username);
    }
}
