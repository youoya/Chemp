package com.example.hometest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hometest1.MenuActivity;
import com.example.hometest1.shop.AkciiActivity;
import com.example.hometest1.R;

public class Activity5 extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024
    //android:background="#c2880e"
    String [] modeMenu = {"Главная","Поиск","Каталог анализов","Акции и новости","Настройки"};//Создаем массив со значениями разделов приложения
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

    }
    public void goAkcii (View v){
        Intent intent = new Intent(this, AkciiActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в AkciiActivity*/
        startActivity(intent);
    }

    public void goMenu (View v){
        Intent intent = new Intent(this, MenuActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
    public void goMenu1 (View v){
        Intent intent = new Intent(this, MenuActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }

}