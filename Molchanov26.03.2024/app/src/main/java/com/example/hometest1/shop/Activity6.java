package com.example.hometest1.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hometest1.R;

import java.util.ArrayList;
import java.util.Collections;

public class Activity6 extends AppCompatActivity {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:26.03.2024
    ArrayList<String> users = new ArrayList<String>();
    ArrayList<String> selectedUsers = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    ListView usersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);


        Collections.addAll(users, "Аспирин", "Dr.Mom", "Ингалипт", "Зеленка","Номидес","Ибупрофен","Ринорус");// добавляем начальные элементы

        usersList = findViewById(R.id.usersList);// получаем элемент ListView

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, users);// создаем адаптер

        usersList.setAdapter(adapter);// устанавливаем для списка адаптер


        usersList.setOnItemClickListener(new AdapterView.OnItemClickListener(){// обработка установки и снятия отметки в списке
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {

                String user = adapter.getItem(position);// получаем нажатый элемент
                if(usersList.isItemChecked(position))
                    selectedUsers.add(user);
                else
                    selectedUsers.remove(user);
            }
        });
    }

    public void add(View view){

        EditText userName = findViewById(R.id.userName);
        String user = userName.getText().toString();
        if(!user.isEmpty()){
            adapter.add(user);
            userName.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){

        for(int i=0; i< selectedUsers.size();i++){// получаем и удаляем выделенные элементы
            adapter.remove(selectedUsers.get(i));
        }

        usersList.clearChoices();// снимаем все ранее установленные отметки

        selectedUsers.clear();// очищаем массив выбраных объектов

        adapter.notifyDataSetChanged();
    }
    public  void pay(View v){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Недостаточно средств", Toast.LENGTH_SHORT);       //Создаем toast-сообщение с параметром отображения длиной в 2 секунды
        toast.show(); // Отображаем toast-сообщение
    }
}