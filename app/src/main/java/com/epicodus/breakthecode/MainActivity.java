package com.epicodus.breakthecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //tells our activity where to find the layour we're rendering
        //R class represents res folder
        setContentView(R.layout.activity_main);
    }
}
