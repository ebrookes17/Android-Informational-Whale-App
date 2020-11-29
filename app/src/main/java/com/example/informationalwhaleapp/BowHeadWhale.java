package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BowHeadWhale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bow_head_whale);
        getSupportActionBar().hide();
    }
}