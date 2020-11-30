package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Objects;

public class BeakedWhale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaked_whale);
        // hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}