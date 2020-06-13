package com.example.disease_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button Log_in;
    public TextView Register;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log_in = findViewById(R.id.Log_In);
        Log_in.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 intent = new Intent (MainActivity.this , MainLogin.class);
                 startActivity(intent);
             }
         });

        Register = findViewById(R.id.Register);
        Register.setOnClickListener(v -> {
            intent = new Intent (MainActivity.this , Register.class);
            startActivity(intent);
        });

        };
    }
