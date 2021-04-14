package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);
    }

    public void switchPage(View view){

        //If user presses button

        if (view.getId() == R.id.switchButton2){
            //Switch View
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}