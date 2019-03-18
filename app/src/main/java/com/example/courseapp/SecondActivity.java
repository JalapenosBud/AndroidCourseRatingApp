package com.example.courseapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.submit_layout);

        Button submit_button = (Button)findViewById(R.id.button_submit);

        submit_button.setOnClickListener((view -> {

        }));
    }
}
