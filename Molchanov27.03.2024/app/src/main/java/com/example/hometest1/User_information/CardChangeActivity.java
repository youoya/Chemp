package com.example.hometest1.User_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hometest1.Activity5;
import com.example.hometest1.Creating_an_account.Activity3;
import com.example.hometest1.MenuActivity;
import com.example.hometest1.R;

public class CardChangeActivity extends AppCompatActivity {

    String[] countries = { "Клиент1 20.03.2003", "Клиент2 20.03.2003", "Клиент3 20.03.2003", "Клиент4 20.03.2003", "Клиент5 20.03.2003"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_change);

        // получаем элемент ListView
        ListView countriesList = findViewById(R.id.countriesList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    }
    public void goMenu (View v){
        Intent intent = new Intent(this, MenuActivity.class);/* Объъект intent будет перенаправлять из this(текущая activity) в MenuActivity*/
        startActivity(intent);
    }
    public void goCardCreate (View v){
        Intent intent = new Intent(this, Activity4.class);/* Объъект intent будет перенаправлять из this(текущая activity) в CardCreate*/
        startActivity(intent);
    }
    public void goGlav (View v){
        Intent intent = new Intent(this, Activity5.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*/
        startActivity(intent);
    }

}