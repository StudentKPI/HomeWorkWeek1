package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 03.03.2017.
 */
public class dva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value = scanner.nextInt();
        String bin = decToBin(value);
      //  int bin1 = binToDec(bin);
        System.out.println(bin);
      //  System.out.println(bin1);
        //int[] mas = new int[value + 1];
       /* String rezult = " ";
        for (int i = value; i >= 1; i /= 2) {
            rezult += i % 2;
           // mas[i] = i % 2;
           // System.out.print(mas[i]);
        }
        rezult = new StringBuilder(rezult).reverse().toString();
        System.out.println(rezult);*/
    }

    public static String decToBin(int value) {
        String rezult = " ";
        for (int i = value; i >= 1; i /= 2) {
            rezult += i % 2;
            // mas[i] = i % 2;
            // System.out.print(mas[i]);
        }
        rezult = new StringBuilder(rezult).reverse().toString();
        return rezult;
    }



}


