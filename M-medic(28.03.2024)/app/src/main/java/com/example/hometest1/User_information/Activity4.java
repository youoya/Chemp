package com.example.hometest1.User_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hometest1.Activity5;
import com.example.hometest1.R;

public class Activity4 extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void SkipCardCreate (View v){/*Создаем публичный void метод отвечающий за переход на следующую Activity и отображение toast-сообщения*/
        Intent intent = new Intent(this, Activity5.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*/
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Не забудьте заполнить карту позже", Toast.LENGTH_SHORT);   //Создаем toast-сообщение с параметром отображения длиной в 2 секунды
        toast.show(); // Отображаем toast-сообщение
    }
    public void SaveCard (View v){/*Создаем публичный void метод отвечающий за переход на следующую Activity и отображение toast-сообщения*/
        Intent intent = new Intent(this,Activity5.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*/
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ваша информция сохранена", Toast.LENGTH_SHORT);    //Создаем toast-сообщение с параметром отображения длиной в 2 секунды
        toast.show(); // Отображаем toast-сообщение
    }
}