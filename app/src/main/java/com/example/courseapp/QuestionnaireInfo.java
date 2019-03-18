package com.example.courseapp;

import android.os.Parcel;
import android.os.Parcelable;

public class QuestionnaireInfo implements Parcelable {

    public String[] teacher_names = {"Faisal","Oskar", "David"};


    protected QuestionnaireInfo(Parcel in) {
        teacher_names = in.createStringArray();
    }

    public static final Creator<QuestionnaireInfo> CREATOR = new Creator<QuestionnaireInfo>() {
        @Override
        public QuestionnaireInfo createFromParcel(Parcel in) {
            return new QuestionnaireInfo(in);
        }

        @Override
        public QuestionnaireInfo[] newArray(int size) {
            return new QuestionnaireInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(teacher_names);
    }
}
