package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Objects;

public class ToothedWhalesActivity extends AppCompatActivity {

    Button buttonB;
    Button buttonO;
    Button buttonS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toothed_whales);
        // hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        // button to open BaleenWhalesActivity
        buttonS = (Button) findViewById(R.id.buttonSperm);
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpermWhaleActivity();
            }
        });
        // button to open ToothedWhalesActivity
        buttonO = (Button) findViewById(R.id.buttonOrca);
        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrcaWhaleActivity();
            }
        });

        buttonB = (Button) findViewById(R.id.buttonBowhead);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBowHeadWhaleActivity();
            }
        });
    }

    public void openBowHeadWhaleActivity(){
        Intent intent = new Intent(this, BowHeadWhale.class);
        startActivity(intent);
    }

    public void openSpermWhaleActivity(){
        Intent intent = new Intent(this, SpermWhale.class);
        startActivity(intent);
    }
    public void openOrcaWhaleActivity(){
        Intent intent = new Intent(this, OrcaWhale.class);
        startActivity(intent);
    }
}

