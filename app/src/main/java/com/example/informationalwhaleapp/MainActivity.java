package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {

    Button buttonBW;
    Button buttonTW;
    Spinner spinner = (Spinner) findViewById(R.id.options_spinner);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

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
    }

    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.options_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner

    spinner.setAdapter(adapter);

    // function to open BaleenWhalesActivity
    public void openBaleenWhalesActivity(){
        Intent intent = new Intent(this, BaleenWhalesActivity.class);
        startActivity(intent);
    }
    // function to open ToothedWhalesActivity
    public void openToothedWhalesActivity(){
        Intent intent = new Intent(this, ToothedWhalesActivity.class);
        startActivity(intent);
        //
    }
}





