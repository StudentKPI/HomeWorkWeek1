package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 03.03.2017.
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        int value = scanner.nextInt();
        int[] mas = new int[value + 1];
        for (int i = 1; i <= value ; i++) {
           mas[0] = 1;
           mas[i] = i;
          // System.out.println(mas[i]);
        }
        int fuct = 1;
        for (int i = 0; i < mas.length ; i++) {
            fuct = fuct * mas[i];
        }
        System.out.println(fuct);
    }
}
