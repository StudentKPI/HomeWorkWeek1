package week2day2;

import week2day1.Utils;

import java.util.Scanner;

/**
 * Created by Василь on 05.03.2017.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter \"lines\" of new matrix");
        int lines = scanner.nextInt();
        System.out.println("Please enter \"rows\" of new matrix");
        int rows = scanner.nextInt();

        System.out.println("Please enter min value for generation");
        int min = scanner.nextInt();
        System.out.println("Please enter max value for generation");
        int max = scanner.nextInt();

        int[][] result = Utils.genMatrix(lines, rows, min, max);

        Utils.printMatrix(result);


    }

}


