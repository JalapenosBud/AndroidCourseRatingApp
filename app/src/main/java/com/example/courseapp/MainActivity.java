package com.example.courseapp;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_a_teacher);

        ViewPager pager = (ViewPager) findViewById(R.id.container);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }


}
