package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 03.03.2017.
 */
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some value");
        double value1 = scanner.nextDouble();
        System.out.println("Pleas enter some value");
        double value2 = scanner.nextDouble();
        boolean result = trueFalse(value1, value2);
        System.out.println(result);

    }


   public static boolean trueFalse(double value1, double value2){
        if(value1 % value2 == 0){
            double chastka = value1 / value2;
            System.out.println(chastka);
            return true;
        }
        if(value2 % value1 == 0){
           double chastka = value2 / value1;
            System.out.println(chastka);
            return true;
        }
        return false;
    }
}

