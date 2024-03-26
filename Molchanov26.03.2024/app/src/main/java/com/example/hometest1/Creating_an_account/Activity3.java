package com.example.hometest1.Creating_an_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hometest1.User_information.Activity4;
import com.example.hometest1.R;

public class Activity3 extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void goBack2(View v){/*Создаем публичный void метод отвечающий за переход на MainActivity*/
        Intent intent = new Intent(this, MainActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MainActivity*/
        startActivity(intent);
    }
    public void skipPasswordCreate (View v){ /*Создаем публичный void метод отвечающий за переход на следкующую activity*/
        Intent intent = new Intent(this, Activity4.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity4*/
        startActivity(intent);
    }
    public void  passwordCreate(View v){
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пароль сохранен", Toast.LENGTH_SHORT);       //Создаем toast-сообщение с параметром отображения длиной в 2 секунды
        toast.show(); // Отображаем toast-сообщение

    }
}