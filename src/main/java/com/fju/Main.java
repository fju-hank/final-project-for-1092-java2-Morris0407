package com.fju;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try{
            is = new FileInputStream("Menu.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            int value=0;
            while((value = br.read()) != -1)
            {
                char c = (char)value;

                System.out.print(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(is!=null)
                is.close();
            if(isr!=null)
                isr.close();
            if(br!=null)
                br.close();
        }

    }
}