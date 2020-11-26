package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToothedWhalesActivity extends AppCompatActivity {

    Button buttonGoBack;
    Button buttonBowhead;
    Button buttonOrca;
    Button buttonSperm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toothed_whales);
        getSupportActionBar().hide();

        //links button press to open method
        buttonBowhead = (Button) findViewById(R.id.buttonBeaked);
        buttonBowhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBowheadDescription();
            }
        });
    }

    // function to open MainActivity
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
      //launches bohead activity
    public void openBowheadDescription() {
        Intent intent = new Intent(this, BowheadWhale.class);
        startActivity(intent);
    }
}
