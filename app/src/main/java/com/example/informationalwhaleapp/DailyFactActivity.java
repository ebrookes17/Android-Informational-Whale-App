package com.example.informationalwhaleapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

public class DailyFactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whalefact);
        // hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}