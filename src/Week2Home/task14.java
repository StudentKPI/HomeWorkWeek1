package Week2Home;

import week2day1.Utils;

/**
 * Created by Василь on 10.03.2017.
 */
public class task14 {

    public static void main(String[] args) {

        int[][] matrix = Utils.genMatrix(5, 5, -10, 10);
        Utils.printMatrix(matrix);

        int max = 0;
        int min = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }

        }


        System.out.println("Max matrix = " + max);
        System.out.println("Min matrix = " + min);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j] == max){
                    matrix[i][j] = min;
                    break;
                }
                if(matrix[i][j] == min){
                    matrix[i][j] = max;
                }
            }

        }

        Utils.printMatrix(matrix);

    }


}
