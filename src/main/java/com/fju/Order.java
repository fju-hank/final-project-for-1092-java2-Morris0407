package com.fju;

public class Order {
MenuItem item ;
int num2;

    public Order(MenuItem item, int num2) {
        this.item = item;
        this.num2 = num2;
    }

    public MenuItem getItem() {
        return item;
    }

    public void setItem(MenuItem item) {
        this.item = item;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
