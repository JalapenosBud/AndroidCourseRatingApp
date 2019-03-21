package com.example.courseapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstFragment extends Fragment{

    public static ArrayList<RadioButton> radioButtons = new ArrayList<>();
    TextView tv;
    public static RadioGroup radioGroup;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        radioGroup = getView().findViewById(R.id.radioGroup);

        if(radioGroup != null) {
            int count = radioGroup.getChildCount();

            View b1 = radioGroup.getChildAt(0);
            if(b1 instanceof RadioButton)
            {
                ((RadioButton) b1).setText("" + QuestionnareRating.A.rating);
            }

            View b2 = radioGroup.getChildAt(1);
            if(b2 instanceof RadioButton)
            {
                ((RadioButton) b2).setText("" + QuestionnareRating.B.rating);
            }

            View b3 = radioGroup.getChildAt(2);
            if(b3 instanceof RadioButton)
            {
                ((RadioButton) b3).setText("" + QuestionnareRating.C.rating);
            }

            View b4 = radioGroup.getChildAt(3);
            if(b4 instanceof RadioButton)
            {
                ((RadioButton) b4).setText("" + QuestionnareRating.D.rating);
            }

            View b5 = radioGroup.getChildAt(4);
            if(b5 instanceof RadioButton)
            {
                ((RadioButton) b5).setText("" + QuestionnareRating.E.rating);
            }

            View b6 = radioGroup.getChildAt(5);
            if(b6 instanceof RadioButton)
            {
                ((RadioButton) b6).setText("" + QuestionnareRating.F.rating);
            }

            View b7 = radioGroup.getChildAt(6);
            if(b7 instanceof RadioButton)
            {
                ((RadioButton) b7).setText("" + QuestionnareRating.G.rate);
            }

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    View o = group.findViewById(checkedId);
                    if(o instanceof RadioButton)
                    {
                        Log.d("hi", ((RadioButton) o).getText().toString() + ", " + tv.getText().toString());
                        QuestionnaireInfo.QRs.add(
                                new QuestionnaireInfo(((RadioButton) o).getText().toString(),
                                tv.getText().toString(),MainActivity.teacher_name));
                    }
                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);

        tv = (TextView) v.findViewById(R.id.question_box);
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
