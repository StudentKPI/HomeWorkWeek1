package week2day2;

import week2day1.Utils;

/**
 * Created by Василь on 05.03.2017.
 */
public class task3 {
    public static void main(String[] args) {

      int[][] matrix =  Utils.genMatrix(10,8,0,5);
      Utils.printMatrix(matrix);

       out:
       for (int i = 0; i < matrix.length; i++) {
           in:
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    System.out.println("i: " + i + " j: " + j);
                    break out;
                }

            }

        }
    }
}
