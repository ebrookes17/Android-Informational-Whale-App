package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button buttonBW;
    Button buttonTW;
    Button buttonFct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        // button to open BaleenWhalesActivity
        buttonBW = (Button) findViewById(R.id.buttonBaleenWhales);
        buttonBW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaleenWhalesActivity();
            }
        });
        // button to open ToothedWhalesActivity
        buttonTW = (Button) findViewById(R.id.buttonToothedWhales);
        buttonTW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToothedWhalesActivity();
            }
        });
        //button for daily whale fact
        buttonFct = (Button) findViewById(R.id.buttonfact);
        buttonFct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDailyWhaleFactActivity();
            }
        });
    }
    // function to open BaleenWhalesActivity
    public void openBaleenWhalesActivity() {
        Intent intent = new Intent(this, BaleenWhalesActivity.class);
        startActivity(intent);
    }
    // function to open ToothedWhalesActivity
    public void openToothedWhalesActivity() {
        Intent intent = new Intent(this, ToothedWhalesActivity.class);
        startActivity(intent);
        //
    }
    public void openDailyWhaleFactActivity() {
        Intent intent = new Intent(this, DailyFactActivity.class);
        startActivity(intent);
        //
    }
}



