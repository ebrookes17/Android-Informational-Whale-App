package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BeakedWhale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaked_whale);
        getSupportActionBar().hide();
    }
}