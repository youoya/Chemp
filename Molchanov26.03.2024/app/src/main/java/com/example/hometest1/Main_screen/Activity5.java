package com.example.hometest1.Main_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.hometest1.shop.Activity6;
import com.example.hometest1.R;

public class Activity5 extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024
    String [] modeMenu = {"Главная","Поиск","Каталог анализов","Акции и новости","Настройки"};//Создаем массив со значениями разделов приложения
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);


        TextView selection = findViewById(R.id.selection); /*Объявляем в коде объект selection типа TextView из xml файла activity_5.xml*/
        Spinner spinner = findViewById(R.id.spinner);   /*Объявляем в коде объект spinner типа spinner из xml файла activity_5.xml*/
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,modeMenu);/*Создаем адаптер ArrayAdapter*/
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); /*Определяем разметку для использования при выборе элемента*/
        spinner.setAdapter(adapter);/*Приминяем адптер к элементу spinner*/

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String  item = (String)parent.getItemAtPosition(position);/*Получаем выбранный элемент*/
                selection.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }
    public void goShop(View v){
        Intent intent = new Intent(this, Activity6.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity6*/
        startActivity(intent);
    }
}