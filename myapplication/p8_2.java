package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class p8_2 extends AppCompatActivity {
    ToggleButton tb;
    ImageButton b;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p8_2);

        b = (ImageButton)   findViewById(R.id.p8_btn);
        tb = (ToggleButton) findViewById(R.id.p8_tgl);
        iv = (ImageView) findViewById(R.id.p8iv);
        
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tb.isChecked()){
                    Toast.makeText(p8_2.this, "access is off", Toast.LENGTH_SHORT).show();
                }else{
                    iv.setImageResource(R.drawable.ic_launcher_background);
                    Toast.makeText(p8_2.this, "Image set successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
