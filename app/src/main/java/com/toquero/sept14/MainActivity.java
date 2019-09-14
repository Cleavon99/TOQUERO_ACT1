package com.toquero.sept14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("SEPT9ACT", "onCreate() has executed.......");
    }
      protected void displayPortals(View v) {
        Intent i = new Intent(MainActivity.this, MainActivityTwo.class);
        startActivity(i);
    }

}

