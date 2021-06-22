package com.fju;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        int total = 0;

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
            System.out.print("enter your meal :");
            int num = scanner.nextInt();
            System.out.print("enter your number :");
            int num2 = scanner.nextInt();

            if (num == 1) {
                System.out.print("1.black peper noodle  55*" + num2);
                System.out.println(" ");
                total = total + (55 * num2);
            }
            if (num == 2) {
                System.out.print("2.kong bao chicken noodle  60*" + num2);
                total = total + (60 * num2);
            }
            if (num == 3) {
                System.out.print("3.omelette with ham  35*" + num2);
                total = total + (35 * num2);
            }
            if (num == 4) {
                System.out.print("4.fried chicken burger  60*" + num2);
                total = total + (60 * num2);
            }
            if (num == 5) {
                System.out.print("5.milktea    30*" + num2);
                total = total + (30 * num2);

            }
            if (num == 6) {
                System.out.print("6.blacktea   25*" + num2);
                total = total + (25 * num2);

            }
            else {
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

