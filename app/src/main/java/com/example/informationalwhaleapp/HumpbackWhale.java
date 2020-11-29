package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HumpbackWhale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humpback_whale);
        getSupportActionBar().hide();
    }
}