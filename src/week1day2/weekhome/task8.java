package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 03.03.2017.
 */
public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value1 = scanner.nextInt();
        System.out.println("Pleas enter some value");
        int value2 = scanner.nextInt();
        boolean result = trueFalse(value1, value2);
        System.out.println(value1 + "  " + value2 + " - " + result);
    }

    public static boolean trueFalse(int value1, int value2){
        if(value1 % 10 == value2 % 10){
            return true;
        }
        else {
            return false;
        }
    }
}
