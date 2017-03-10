package Week2Home;

import week2day1.Utils;

import java.util.Scanner;

/**
 * Created by Василь on 09.03.2017.
 */
public class task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter \"lines\" of new matrix");
        int lines = scanner.nextInt();
        System.out.println("Please enter \"rows\" of new matrix");
        int rows = scanner.nextInt();

        int[][] matrix = Utils.genMatrix(lines, rows, 0, 10);

        Utils.printMatrix(matrix);

        out:
        for (int i = 0; i < matrix.length; i++) {
            in:
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 5){
                    System.out.println("i: " + i + " j: " + j);
                    break out;
                }
            }

        }


    }
}
