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
    public void setId (String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }
    public int getPrice1(){
        return price1;
    }
    public void setPrice1 (int price1){
        this.price1=price1;
    }




}


