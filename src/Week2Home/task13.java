package Week2Home;

import week2day1.Utils;

/**
 * Created by Василь on 10.03.2017.
 */
public class task13 {
    public static void main(String[] args) {
        int size = 10;
        int maxValue = 10;

       double arr[] = generateArray(size, maxValue);
       printArray(arr);

       double suma = 0;

        for (int i = 0; i < arr.length ; i++) {
            suma = suma + arr[i];

        }
        double sarf = suma / size;
        System.out.println("Середнє арефметичне =" + sarf);

    }

    public static double[] generateArray(int size, int maxValue) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (Math.random() * maxValue);
        }
        return arr;
    }

    public static void printArray(double[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i != arr.length - 1) ? arr[i] + ", " : arr[i] + "]";
           /* if(i != arr.length - 1) {
                result += arr[i] + ", ";
            }else {
                result += arr[i] + "]";
            }
        }*/
        }
        System.out.println(result);
    }

}
