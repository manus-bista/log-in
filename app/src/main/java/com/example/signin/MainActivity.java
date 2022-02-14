package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstname = findViewById(R.id.fstnam);
        TextView lastname = findViewById(R.id.lstnam);
        TextView email = findViewById(R.id.email);

        RadioGroup radiobtn = (RadioGroup) findViewById(R.id.radiobtn);

        Button btn = (Button) findViewById(R.id.btn);


    }
}