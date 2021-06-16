package com.fju;

public class MenuItem {
    String id;
    String name;
    int price1;

    public  MenuItem(String id, String name, int price1){
        this.id = id;
        this.name =name;
        this.price1=price1;

    }



    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public int getPrice1(){
        return price1;
    }




}


