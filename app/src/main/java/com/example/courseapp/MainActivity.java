package com.example.courseapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {



    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.choose_a_teacher);

       // Button submit_button = (Button)findViewById(R.id.submit_button);


        Button button_faisal = (Button) findViewById(R.id.button_faisal);
        Button button_oskar = (Button) findViewById(R.id.button_oskar);
        Button button_david= (Button) findViewById(R.id.button_david);


        RadioGroup radioGroup = null;

        LinearLayout teacher_buttons_layout = findViewById(R.id.teacher_buttons_layout);

        button_faisal.setOnClickListener((view -> {
            teacher_buttons_layout.setEnabled(false);
            teacher_buttons_layout.setVisibility(View.INVISIBLE);

            Intent intent = new Intent(this, CourseActivity.class);

            startActivity(intent);

            //setContentView(R.layout.course_layout);
            //pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        }));

        button_oskar.setOnClickListener((view -> {
            //pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        }));

        button_david.setOnClickListener((view -> {
            //pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        }));

    }
}
