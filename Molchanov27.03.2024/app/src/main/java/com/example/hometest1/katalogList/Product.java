package com.example.hometest1.katalogList;

public class Product {
    //Автор: Молчанов Кирилл Вадимович (Конкурсант). Дата создания:27.03.2024
    private final String name;
    private int count;
    private final String unit;

    Product(String name, String unit){
        this.name = name;
        this.count=0;
        this.unit = unit;
    }
    public String getUnit() {
        return this.unit;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public String getName(){
        return this.name;
    }
}
