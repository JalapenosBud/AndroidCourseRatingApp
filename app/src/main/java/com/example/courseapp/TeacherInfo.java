package com.example.courseapp;

import android.os.Parcel;
import android.os.Parcelable;

public class TeacherInfo implements Parcelable {

    public String teacher_name;

    TeacherInfo(){}

    void createTeacher(String teacher_name)
    {
        this.teacher_name = teacher_name;

    }

    protected TeacherInfo(Parcel in) {
        teacher_name = in.readString();
    }

    public static final Creator<TeacherInfo> CREATOR = new Creator<TeacherInfo>() {
        @Override
        public TeacherInfo createFromParcel(Parcel in) {
            return new TeacherInfo(in);
        }

        @Override
        public TeacherInfo[] newArray(int size) {
            return new TeacherInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(teacher_name);
    }

    @Override
    public String toString() {
        return teacher_name;
    }
}
