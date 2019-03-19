package com.example.courseapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    public static ArrayList<RadioButton> radioButtons = new ArrayList<>();

    public static RadioGroup radioGroup;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        radioGroup = getView().findViewById(R.id.radioGroup);



        if(radioGroup != null)
        {

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if(radioGroup != null) {
                        int count = radioGroup.getChildCount();

                            View o = radioGroup.getChildAt(checkedId);
                            if(o instanceof RadioButton)
                            {
                                radioButtons.add((RadioButton)o);
                            }

                    }

                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);

        TextView tv = (TextView) v.findViewById(R.id.question_box);
        tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static FirstFragment newInstance(String text) {

        FirstFragment f = new FirstFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}
