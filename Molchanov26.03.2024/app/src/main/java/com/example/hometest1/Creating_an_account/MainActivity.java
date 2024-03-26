package com.example.hometest1.Creating_an_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hometest1.R;

public class MainActivity extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.VvediteEmail); /*Объявляем в коде объект editText типа EditText из xml файла activity_main.xml*/
        Button button = findViewById(R.id.next1); /*Объявляем в коде объект button типа Button(кнопка) из xml файла activity_main.xml*/
        //Данные строчки будут реализовываться в будущем)
    }
    public void goActivity2(View v){    /*Создаем публичный void метод отвечающий за переход на следкующую activity и отображение toast-сообщения*/
        Intent intent = new Intent(this, Activity2.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity2*/
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Проверьте почтовый ящик", Toast.LENGTH_SHORT);       //Создаем toast-сообщение с параметром отображения длиной в 2 секунды
        toast.show(); // Отображаем toast-сообщение
    }
}