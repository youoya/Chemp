package com.example.hometest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hometest1.Activity5;
import com.example.hometest1.katalogList.KatalogActivity;
import com.example.hometest1.shop.AkciiActivity;
import com.example.hometest1.User_information.CardChangeActivity;
import com.example.hometest1.R;
import com.example.hometest1.shop.Activity6;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void goMain (View v){
        Intent intent = new Intent(this, Activity5.class);//* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*
        startActivity(intent);
    }
    public void goAkcii (View v){
        Intent intent = new Intent(this, AkciiActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в AkciiActivity*/
        startActivity(intent);
    }
    public void goShop(View v){
        Intent intent = new Intent(this, Activity6.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity6*/
        startActivity(intent);
    }
    public void goCardChange(View v){
        Intent intent = new Intent(this, CardChangeActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity6*/
        startActivity(intent);
    }
    public  void goKatelog(View v){
        Intent intent = new Intent(this, KatalogActivity.class);
        startActivity(intent);
    }
    public void goSettings (View v){
        Intent intent = new Intent(this, SettingsActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
}