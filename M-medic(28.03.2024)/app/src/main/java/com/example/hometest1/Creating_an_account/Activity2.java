package com.example.hometest1.Creating_an_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hometest1.R;

public class Activity2 extends AppCompatActivity  {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void podtverditMail(View v){ /*Создаем публичный void метод отвечающий за переход на следкующую activity*/
        Intent intent = new Intent(this, Activity3.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity3*/
        startActivity(intent);
    }
    public void goBack1(View v){ /*Создаем публичный void метод отвечающий за переход на предыдущую activity*/
        Intent intent = new Intent(this, MainActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MainActivity*/
        startActivity(intent);
    }

}