package com.example.eventhandlingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    Button minusB;
    Button plusB;
    TextView increament;
    TextView displaynum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minusB = (Button)findViewById(R.id.minusbutton);
        plusB = (Button)findViewById(R.id.plusbutton);
        increament = (TextView)findViewById(R.id.textdisplay);
        displaynum = (TextView)findViewById(R.id.numdisplay);
        displaynum.setText("*"+counter+"*");

        minusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                counter--;
                increament.setText("MINUS BUTTON CLICKED");
                displaynum.setText("*"+counter+"*");

            }
        });

        plusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                increament.setText("PLUS BUTTON CLICKED");
                displaynum.setText("*"+counter+"*");

            }
        });

    }
}
