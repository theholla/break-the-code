package com.epicodus.breakthecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button mEnrollButton;
    private Button mSponsorsButton;
    private Button mNonProfitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //tells our activity where to find the layour we're rendering
        //R class represents res folder
        setContentView(R.layout.activity_main);
        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mSponsorsButton = (Button) findViewById(R.id.sponsorsButton);
        mNonProfitButton = (Button) findViewById(R.id.nonProfitButton);

        mNonProfitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NonProfitActivity.class);
                startActivity(intent);
            }
        });

        mSponsorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(intent);
            }
        });

        mEnrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(intent);
            }
        });
    }
}


