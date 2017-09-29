package com.example.hp.activityrikkeisoft.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hp.activityrikkeisoft.R;
import com.example.hp.activityrikkeisoft.model.MyParcelable;

public class StudentInforActivity extends AppCompatActivity {
    private TextView tvName, tvCountry, tvDateOfBirth, tvSex, tvClass, tvCourse;
    private MyParcelable myParcelable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        initView();
        getDataStudent();
    }

    private void initView() {
        tvName= (TextView) findViewById(R.id.tv_name);
        tvCountry= (TextView) findViewById(R.id.tv_country);
        tvDateOfBirth= (TextView) findViewById(R.id.tv_date_of_birth);
        tvSex= (TextView) findViewById(R.id.tv_sex);
        tvClass= (TextView) findViewById(R.id.tv_class);
        tvCourse= (TextView) findViewById(R.id.tv_course);
    }


    public void getDataStudent() {
        Intent intent=getIntent();
        myParcelable=intent.getParcelableExtra(StudentActivity.PARCELABLE);
        if (myParcelable!=null) {
            tvName.setText(myParcelable.getmName());
            tvCountry.setText(myParcelable.getmCountry());
            tvDateOfBirth.setText(myParcelable.getmDateOfBirth());
            tvSex.setText(myParcelable.getmSex());
            tvClass.setText(myParcelable.getmClass());
            tvCourse.setText(myParcelable.getmCourse());
        }
    }
}
