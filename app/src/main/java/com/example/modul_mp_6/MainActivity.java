package com.example.modul_mp_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button secondButton, thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondButton= findViewById(R. id. btn_second);
                thirdButton= findViewById(R. id. btn_third);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        thirdButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view)  {
                Intent intent= new Intent( MainActivity.this, ThirdActivity.class);
                startActivity (intent);
            }
        });

    }
}