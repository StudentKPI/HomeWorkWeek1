package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 02.03.2017.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        double value = scanner.nextDouble();
        if(value >= 0 && value <= 1){
            System.out.println("Число лежить в межах від 0 до 1");
        }
        else {
            System.out.println("Число не лежить в межах від 0 до 1");
        }
    }
}
