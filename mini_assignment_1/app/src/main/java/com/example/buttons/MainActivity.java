package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchPage(View view){

        //If user presses button

        if (view.getId() == R.id.switchButton){
            //Switch View
            Intent intent = new Intent(this, SecondPage.class);
            startActivity(intent);
        }

    }
}