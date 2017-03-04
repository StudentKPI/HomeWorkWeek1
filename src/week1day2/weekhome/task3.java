package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 02.03.2017.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value = scanner.nextInt();
        if(value % 7 == 0){
            value = value * 2;
            System.out.println(value);
        }
        else {
            System.out.println("Error");
        }
    }
}
