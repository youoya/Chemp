package com.example.hometest1.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hometest1.Activity5;
import com.example.hometest1.MenuActivity;
import com.example.hometest1.R;
import com.example.hometest1.shop.Activity6;

public class DecorationActivity extends AppCompatActivity {
    String[] cities = {"Благовещенск", "Свободный", "Серышево", "Белогорск", "Хабаровск", "Владивосток","Ленина","50 лет Октября","Пушкина","Театральная","Мостовая","1","2","3","4","5","199",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoration);
        // Получаем ссылку на элемент AutoCompleteTextView в разметке
        MultiAutoCompleteTextView autoCompleteTextView = findViewById(R.id.autocomplete);
        // Создаем адаптер для автозаполнения элемента MultiAutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, cities);
        autoCompleteTextView.setAdapter(adapter);
        // установка запятой в качестве разделителя
        autoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }


    public void goBack (View v){
        Intent intent = new Intent(this, Activity6.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*/
        startActivity(intent);
    }

    public void Kurier(View v)//Метод отвечающий за изменение кнопоки
    {
        Button button = findViewById(R.id.button9);
        Button button1 = findViewById(R.id.button10);
        TextView textView =findViewById(R.id.Adress);
        textView.setText("Адрес дома");
        button1.setBackgroundColor(Color.BLUE);
        button.setBackgroundColor(Color.GRAY);
    }

    public void Samovivoz(View v)//Метод отвечающий за изменение кнопоки
    {
        Button button = findViewById(R.id.button9);
        Button button1 = findViewById(R.id.button10);
        TextView textView =findViewById(R.id.Adress);
        textView.setText("Адрес магазина");
        button.setBackgroundColor(Color.BLUE);
        button1.setBackgroundColor(Color.GRAY);
    }
    public void Phizikal(View v){
        EditText editText = findViewById(R.id.CardView);
            editText.setVisibility(View.INVISIBLE); // Делаем EditText невидимым

    }
    public void Priloz(View v){
        EditText editText = findViewById(R.id.CardView);
            editText.setVisibility(View.VISIBLE); // Делаем EditText невидимым

    }
    public void Oformit(View v)
    {
        Intent intent = new Intent(this, Activity5.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*/
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Заказ оформлен", Toast.LENGTH_SHORT);       //Создаем toast-сообщение с параметром отображения длиной в 2 секунды
        toast.show(); // Отображаем toast-сообщение
    }
    public void goMenu (View v){
        Intent intent = new Intent(this, MenuActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
}