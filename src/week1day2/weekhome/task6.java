package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 03.03.2017.
 */
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value1 = scanner.nextInt();
        System.out.println("Pleas enter some value");
        int value2 = scanner.nextInt();
        int suma = value1 + value2;
        if(suma >= 11 && suma <= 19){
            System.out.println(suma);
        }
        else {
            System.out.println("Error");
        }
    }
}
