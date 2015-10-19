package com.epicodus.breakthecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class EnrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        //debugging tool to see if something works:

        Toast.makeText(this, "Enroll activity works!!", Toast.LENGTH_LONG).show();

        /* Before the refactor:

        String message = "Enroll activity works!!";
        Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        welcomeToast.show();

        */

    }
}
