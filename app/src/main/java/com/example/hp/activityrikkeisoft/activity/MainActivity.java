package com.example.hp.activityrikkeisoft.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.activityrikkeisoft.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TEXT_NAME = "text_name";
    private EditText etName;
    private Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        etName= (EditText) findViewById(R.id.et_name);
        btnOk= (Button) findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name=etName.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(this, R.string.inform, Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent=new Intent(this, StudentActivity.class);
        intent.putExtra(TEXT_NAME, name);
        startActivity(intent);
    }
}
