package com.example.hometest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:27.03.2024
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
    public void goMenu (View v){
        Intent intent = new Intent(this, MenuActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
}