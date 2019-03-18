package com.example.courseapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int pos) {
        switch(pos) {

            case 0: return FirstFragment.newInstance("Rate the revelancy of the subject from 1 to 100");
            case 1: return FirstFragment.newInstance("Rate the teacher's overall performance from 1 to 100");
            case 2: return FirstFragment.newInstance("Rate the teacher's preparation from 1 to 100");
            case 3: return FirstFragment.newInstance("Rate the teacher's feedback from 1 to 100, ");
            case 4: return FirstFragment.newInstance("Rate the teacher's examp1es from 1 to 100");
            case 5: return FirstFragment.newInstance("Rate your job opportunities from 1 to 100");
            default: return FirstFragment.newInstance("ThirdFragment, Default");
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}