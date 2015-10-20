package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.breakthecode.R;

import org.w3c.dom.Text;

public class EnrollActivity extends AppCompatActivity {
    private EditText mEmailText, mNameText;
    private Button mEnrollButton;
    private TextView mThankYouMessage, mNameLabel;


    // getSimpleName() instead of hard coding name lets you refactor rename!
    public static final String TAG = EnrollActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        mEmailText = (EditText) findViewById(R.id.emailText);
        mNameText = (EditText) findViewById(R.id.enrollNameLabel);
        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mThankYouMessage = (TextView) findViewById(R.id.thankYouMessage);
        mNameLabel = (TextView) findViewById(R.id.nameLabel);

        //debugging tool that speaks to the user:
        //Toast.makeText(this, "Enroll activity works!!", Toast.LENGTH_LONG).show();

        //debugging tool to write to console:
        //to find in console, filter by log level (returns at and below level) or search

        Log.d(TAG, "We're logging from the Enroll Activity OnCreate() method");

        mEnrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameText.getText().toString();
                String email = mEmailText.getText().toString();
                String message = String.format("Hey %s, we're glad you decided to enroll at Epicodus! We'll send an email to %s shortly.", name, email);

                mThankYouMessage.setText(message);
                mNameLabel.setVisibility(View.INVISIBLE);
                mEmailText.setVisibility(View.INVISIBLE);
                mNameText.setVisibility(View.INVISIBLE);
                mEnrollButton.setVisibility(View.INVISIBLE);
                mThankYouMessage.setVisibility(View.VISIBLE);
            }
        });

    }
}
