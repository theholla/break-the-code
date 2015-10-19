package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.epicodus.breakthecode.R;

public class EnrollActivity extends AppCompatActivity {

    // getSimpleName() instead of hard coding name lets you refactor rename!
    public static final String TAG = EnrollActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        //debugging tool that speaks to the user:
        //Toast.makeText(this, "Enroll activity works!!", Toast.LENGTH_LONG).show();

        //debugging tool to write to console:
        //to find in console, filter by log level (returns at and below level) or search

        Log.d(TAG, "We're logging from the Enroll Activity OnCreate() method");

    }
}
