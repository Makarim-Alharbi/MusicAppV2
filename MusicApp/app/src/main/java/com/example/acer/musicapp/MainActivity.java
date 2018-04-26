package com.example.acer.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this will link MainActivity with activity_main.xml layout file.
        setContentView(R.layout.activity_main);
        //find the view of Classic to use it.
        TextView classic = findViewById(R.id.Classic);
        //set a click listener on Classic view.
        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open Classic class.
                Intent ClassicIntent = new Intent(MainActivity.this, Classic.class);
                //start Classic
                startActivity(ClassicIntent);
            }
        });
        //find the view of HipHop to use it.
        TextView hiphop = findViewById(R.id.HipHop);
        //set a click listener on HipHop view.
        hiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open HipHop class.
                Intent HipHopIntent = new Intent(MainActivity.this, HipHop.class);
                //start HipHop
                startActivity(HipHopIntent);
            }
        });
        //find the view of Jazz to use it.
        TextView jazz = findViewById(R.id.Jazz);
        //set a click listener on Jazz view.
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open Jazz class.
                Intent JazzIntent = new Intent(MainActivity.this, Jazz.class);

                startActivity(JazzIntent);
            }
        });
        //find the view of Rock to use it.
        TextView rock = findViewById(R.id.Rock);
        //set a click listener on Rock view.
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open Rock class.
                Intent RockIntent = new Intent(MainActivity.this, Rock.class);
                //start Rock
                startActivity(RockIntent);
            }
        });
    }
}
