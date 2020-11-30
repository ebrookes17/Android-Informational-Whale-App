package com.example.informationalwhaleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Objects;

public class GreyWhale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grey_whale);
        // hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}