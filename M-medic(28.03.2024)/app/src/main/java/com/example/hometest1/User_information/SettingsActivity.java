package com.example.hometest1.User_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hometest1.Activity5;
import com.example.hometest1.MenuActivity;
import com.example.hometest1.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
    public void goMenu (View v){
        Intent intent = new Intent(this, MenuActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
    public void goGlav (View v){
        Intent intent = new Intent(this, Activity5.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
}