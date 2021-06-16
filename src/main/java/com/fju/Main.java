package com.fju;


import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem > menu =  new ArrayList<>( );
        try {
            BufferedReader br = new BufferedReader(new FileReader("Menu.txt"));
            String line = br.readLine();
            while (line != null){
                String[] tks = line.split(",");
            MenuItem item = new MenuItem(tks[0],tks[1],Integer.parseInt(tks[2]));
            line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.println(item.getId() + " " + item.getName());
        }
    }
}