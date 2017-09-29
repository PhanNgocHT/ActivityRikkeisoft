package com.example.hp.activityrikkeisoft.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.activityrikkeisoft.R;
import com.example.hp.activityrikkeisoft.model.MyParcelable;

public class StudentActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String PARCELABLE = "my_parcelable";

    private TextView tvName;
    private EditText etCountry, etDateOfBirth, etSex, etClass, etCourse;
    private Button btnOk;
    private MyParcelable myParcelable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        initView();
        initData();
    }

    private void initData() {
        Intent intent=getIntent();
        String name=intent.getStringExtra(MainActivity.TEXT_NAME);
        tvName.setText(name);
    }

    private void initView() {
        tvName= (TextView) findViewById(R.id.tv_name);
        etCountry= (EditText) findViewById(R.id.et_country);
        etDateOfBirth= (EditText) findViewById(R.id.et_date_of_birth);
        etSex= (EditText) findViewById(R.id.et_sex);
        etClass= (EditText) findViewById(R.id.et_class);
        etCourse= (EditText) findViewById(R.id.et_course);
        btnOk= (Button) findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name=tvName.getText().toString();
        String country=etCountry.getText().toString();
        String dateOfBirth=etCountry.getText().toString();
        String sex=etSex.getText().toString();
        String classes=etClass.getText().toString();
        String course=etCourse.getText().toString();

        if (country.isEmpty()||dateOfBirth.isEmpty()||sex.isEmpty()||classes.isEmpty()||course.isEmpty()) {
            Toast.makeText(this, R.string.inform, Toast.LENGTH_SHORT).show();
            return;
        }
        myParcelable=new MyParcelable(name, country, dateOfBirth, sex, classes, course);
        Intent intent=new Intent(this, StudentInforActivity.class);
        intent.putExtra(PARCELABLE, myParcelable);
        startActivity(intent);

    }
}
