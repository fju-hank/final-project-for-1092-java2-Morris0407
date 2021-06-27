package com.fju;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        int total = 0;
       Num1 n1 =new Num1();
       Num2 n2 =new Num2();
       Num3 n3 =new Num3();
       Num4 n4 =new Num4();
       Num5 n5 =new Num5();
       Num6 n6 =new Num6();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            is = new FileInputStream("Menu.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            int value = 0;
            while ((value = br.read()) != -1) {
                char c = (char) value;

                System.out.print(c);
            }
            System.out.print("==========================");
            System.out.println(" ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null)
                is.close();
            if (isr != null)
                isr.close();
            if (br != null)
                br.close();
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
           /* for (Num number : nums) {
                System.out.print("enter your meal :");
                int num = scanner.nextInt();
                System.out.print("enter your number :");
                int num2 = scanner.nextInt();
                number.num = num;
                System.out.println(number.getName() + " " +number.getPrice()+ "*" + num2);
            }*/

            System.out.print("enter your meal :");
            int num = scanner.nextInt();
            System.out.print("enter your number :");
            int num2 = scanner.nextInt();

            if (num == 1) {
                System.out.print(n1.getName()+ " "+n1.getPrice()+"*" + num2);
                System.out.println(" ");
                total = total + (n1.getPrice() * num2);
            }
            if (num == 2) {
                System.out.print(n2.getName()+ " "+n2.getPrice()+"*" + num2);
                System.out.println(" ");
                total = total + (n2.getPrice() * num2);
            }
            if (num == 3) {
                System.out.print(n3.getName()+ " "+n3.getPrice()+"*" + num2);
                System.out.println(" ");
                total = total + (n3.getPrice() * num2);
            }
            if (num == 4) {
                System.out.print(n4.getName()+ " "+n4.getPrice()+"*" + num2);
                System.out.println(" ");
                total = total + (n4.getPrice() * num2);
            }
            if (num == 5) {
                System.out.print(n5.getName()+ " "+n5.getPrice()+"*" + num2);
                System.out.println(" ");
                total = total + (n5.getPrice() * num2);

            }
            if (num == 6) {
                System.out.print(n6.getName()+ " "+n6.getPrice()+"*" + num2);
                System.out.println(" ");
                total = total + (n6.getPrice() * num2);

            } else {
                if (num == 0) {
                    System.out.print("Total :" + total);
                    System.out.println(" ");
                }
                if (num == 88) {
                    System.out.print("Total :" + total);
                    System.out.println(" ");
                    System.out.println("bye");
                    break;
                }
            }
        }
    }
}

