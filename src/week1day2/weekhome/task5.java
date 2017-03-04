package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 03.03.2017.
 */
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value1 = scanner.nextInt();
        System.out.println("Pleas enter some value");
        int value2 = scanner.nextInt();
        if(value1 > value2){
            int value3 = value1 - value2;
            System.out.println(value3);
        }
        else {
           int value3 = value1 + value2;
            System.out.println(value3);
        }
    }
}
