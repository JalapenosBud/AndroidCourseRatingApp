package com.example.courseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class CourseActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.course_layout);


        ViewPager pager = (ViewPager) findViewById(R.id.container);
        Button android_button = (Button)findViewById(R.id.button_android);
        Button back_button = (Button)findViewById(R.id.course_back);
        Button course_submit = (Button)findViewById(R.id.course_submit);
        LinearLayout course_buttons = (LinearLayout)findViewById(R.id.course_buttons_layout);
        TextView tv = (TextView)findViewById(R.id.question_box);


        Intent intent = getIntent();



        android_button.setOnClickListener((view -> {
            course_buttons.setVisibility(View.INVISIBLE);
            tv.setText("");
            pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        }));


        back_button.setOnClickListener((view -> {
            course_buttons.setVisibility(View.VISIBLE);
            pager.setAdapter(null);
            tv.setText("Select a course to rate");
        }));

        course_submit.setOnClickListener((view -> {

            if(FirstFragment.radioGroup != null) {
                int count = FirstFragment.radioGroup.getChildCount();

                for (int i = 0; i < count; i++) {
                    View o = FirstFragment.radioGroup.getChildAt(i);
                    if(o instanceof RadioButton)
                    {
                        FirstFragment.radioButtons.add((RadioButton)o);
                    }
                }
            }


            for(RadioButton rb : FirstFragment.radioButtons)
            {
                if(!rb.isChecked())
                {
                    Log.d("hi"," you're missing: " + rb.toString());
                }
            }
        }));



    }
}
