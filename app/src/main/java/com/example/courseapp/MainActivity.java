package com.example.courseapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
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


    public static String teacher_name = "";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.choose_a_teacher);

        Button button_faisal = (Button) findViewById(R.id.button_faisal);
        Button button_oskar = (Button) findViewById(R.id.button_oskar);
        Button button_david= (Button) findViewById(R.id.button_david);

        RadioGroup radioGroup = null;

        LinearLayout teacher_buttons_layout = findViewById(R.id.teacher_buttons_layout);

        TeacherInfo ti = new TeacherInfo();

        button_faisal.setOnClickListener((view -> {
            teacher_buttons_layout.setEnabled(false);
            teacher_buttons_layout.setVisibility(View.INVISIBLE);
            teacher_name = button_faisal.getText().toString();


            Intent intent = new Intent(this, CourseActivity.class);

            ti.createTeacher(button_faisal.getText().toString());
            intent.putExtra("teacher",ti);

            startActivity(intent);

        }));

        button_oskar.setOnClickListener((view -> {
            teacher_buttons_layout.setEnabled(false);
            teacher_buttons_layout.setVisibility(View.INVISIBLE);
            teacher_name = button_oskar.getText().toString();

            Intent intent = new Intent(this, CourseActivity.class);
            ti.createTeacher(button_oskar.getText().toString());
            intent.putExtra("teacher",ti);

            startActivity(intent);
        }));

        button_david.setOnClickListener((view -> {
            teacher_buttons_layout.setEnabled(false);
            teacher_buttons_layout.setVisibility(View.INVISIBLE);
            teacher_name = button_david.getText().toString();

            Intent intent = new Intent(this, CourseActivity.class);
            ti.createTeacher(button_david.getText().toString());
            intent.putExtra("teacher",ti);

            startActivity(intent);
        }));

    }
}
