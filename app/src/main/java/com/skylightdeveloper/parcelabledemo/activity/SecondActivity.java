package com.skylightdeveloper.parcelabledemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.skylightdeveloper.parcelabledemo.R;
import com.skylightdeveloper.parcelabledemo.model.Student;

/**
 * Created by Akash Wangalwar on 16-10-2016.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity_layout);

        TextView textView = (TextView) findViewById(R.id.tv_id);

        Student student = (Student) getIntent().getParcelableExtra("data");

        String studentData = student.getmName() + "\n" + student.getmRollNumber() + "\n" +
                student.getmAddress();
        textView.setText(studentData);
    }
}
