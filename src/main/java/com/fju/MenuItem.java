package com.fju;

public class MenuItem {
    String id;
    String name;
    int price1;
    int price2;
    public MenuItem (){
        super();
    }

    public  MenuItem (String id ,String name,int price1,int price2){
        this.id = id;
        this.name =name;
        this.price1=price1;
        this.price2 =price2;

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
    public int getPrice2(){
        return price2;
    }



}


