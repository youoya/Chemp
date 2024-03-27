package com.example.hometest1.katalogList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.hometest1.Activity5;
import com.example.hometest1.MenuActivity;
import com.example.hometest1.R;
import com.example.hometest1.shop.Activity6;

import java.util.ArrayList;

public class KatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Аспирин", "упак."));
        products.add(new Product("Dr.Mom", "упак."));
        products.add(new Product("Ингалипт", "упак."));
        products.add(new Product("Зеленка", "упак."));
        products.add(new Product("Номидес", "упак."));
        ListView productList = findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item, products);
        productList.setAdapter(adapter);
    }
    public void goMenu (View v){
        Intent intent = new Intent(this, MenuActivity.class);//* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*
        startActivity(intent);
    }
    public void goShop1 (View v){
        Intent intent = new Intent(this, Activity6.class);//* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*
        startActivity(intent);
    }
    public void goMenu1 (View v){
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
    public void goGlav (View v){
        Intent intent = new Intent(this, Activity5.class);/* Объъект intent будет перенаправлять из this(текущая activity) в Activity5*/
        startActivity(intent);
    }
}