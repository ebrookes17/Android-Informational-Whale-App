package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Objects;

public class BaleenWhalesActivity extends AppCompatActivity {

    Button buttonBeaked;
    Button buttonGray;
    Button buttonHumpback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baleen_whales);
        // hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        buttonBeaked = (Button) findViewById(R.id.buttonBeaked);
        buttonBeaked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeakedWhaleActivity();
            }
        });

        buttonGray = (Button) findViewById(R.id.buttonGray);
        buttonGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGreyWhaleActivity();
            }
        });

        buttonHumpback = (Button) findViewById(R.id.buttonHumpback);
        buttonHumpback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHumpbackWhaleActivity();
            }
        });
    }

    public void openBeakedWhaleActivity(){
        Intent intent = new Intent(this, BeakedWhale.class);
        startActivity(intent);
    }

    public void openGreyWhaleActivity(){
        Intent intent = new Intent(this, GreyWhale.class);
        startActivity(intent);
    }

    public void openHumpbackWhaleActivity(){
        Intent intent = new Intent(this, HumpbackWhale.class);
        startActivity(intent);
    }
}
