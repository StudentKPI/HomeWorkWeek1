package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 02.03.2017.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value1 = scanner.nextInt();
        System.out.println("Pleas enter some value");
        int value2 = scanner.nextInt();
        System.out.println("Pleas enter some value");
        int value3 = scanner.nextInt();
        MaxMin(value1, value2, value3);
    }

    public static int MaxMin(int value1, int value2, int value3) {
        if(value1 > value2) {
            int Max = Math.max(value1, value3);
            int Min = Math.min(value2, value3);
            System.out.println("Найбільше число " + Max);
            System.out.println("Найменше число " + Min);
        }else {
          int Max = Math.max(value2, value3);
          int Min = Math.min(value1, value3) ;
            System.out.println("Найбільше число " + Max);
            System.out.println("Найменше число " + Min);
        }
        return 0;
    }
}
