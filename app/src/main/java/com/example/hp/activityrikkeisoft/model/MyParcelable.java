package com.example.hp.activityrikkeisoft.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hp on 9/27/2017.
 */

public class MyParcelable implements Parcelable {
    private String mName;
    private String mCountry;
    private String mDateOfBirth;
    private String mSex;
    private String mClass;
    private String mCourse;

    public MyParcelable(String name, String country, String dateOfBirth, String sex, String classes, String course) {
        mName = name;
        mCountry = country;
        mDateOfBirth = dateOfBirth;
        mSex = sex;
        mClass = classes;
        mCourse = course;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmDateOfBirth() {
        return mDateOfBirth;
    }

    public void setmDateOfBirth(String mDateOfBirth) {
        this.mDateOfBirth = mDateOfBirth;
    }

    public String getmSex() {
        return mSex;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public String getmClass() {
        return mClass;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public String getmCourse() {
        return mCourse;
    }

    public void setmCourse(String mCourse) {
        this.mCourse = mCourse;
    }

    public static Creator<MyParcelable> getCREATOR() {
        return CREATOR;
    }

    protected MyParcelable(Parcel in) {
        mName=in.readString();
        mCountry=in.readString();
        mDateOfBirth=in.readString();
        mSex=in.readString();
        mClass=in.readString();
        mCourse=in.readString();
    }

    public static final Creator<MyParcelable> CREATOR = new Creator<MyParcelable>() {
        @Override
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        @Override
        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeString(mCountry);
        parcel.writeString(mDateOfBirth);
        parcel.writeString(mSex);
        parcel.writeString(mClass);
        parcel.writeString(mCourse);
    }
}
