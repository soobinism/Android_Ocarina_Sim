package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt;
    Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);           // Initializing text field and button
        buttonA = findViewById(R.id.buttonA);

        buttonA.setOnClickListener(this);
    }

    // Hit CTRL + i and needed methods are created for you?
    @Override
    public void onClick(View v) {
        // If buttonA is clicked, will display that buttonA was clicked
        if (v.getId() == R.id.buttonA){
            txt.setText("You clicked Button A");
        }
    }
}