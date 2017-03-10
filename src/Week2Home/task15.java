package Week2Home;

import week2day1.Utils;

/**
 * Created by Василь on 10.03.2017.
 */
public class task15 {

    public static void main(String[] args) {

        int[][] matrix1 = Utils.genMatrix(5, 5, 0, 10);
        int[][] matrix2 = Utils.genMatrix(5, 5, -5, 5);
        Utils.printMatrix(matrix1);
        System.out.println();
        Utils.printMatrix(matrix2);
        System.out.println();

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix2[i][j] = matrix1[i][j];

            }

        }
        Utils.printMatrix(matrix2);
    }

}
