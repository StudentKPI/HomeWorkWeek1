package week1day2;

import java.util.Scanner;

/**
 * Created by Василь on 26.02.2017.
 */
public class Tasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some values");
        int value = scanner.nextInt();
        boolean result = chekEven(value);
        System.out.println(value + " is even " + result);

    }
    public static boolean chekEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean create(String text){
        if(text.length() > 10){
            System.out.println("length 10+");
            return true;
        }
        else{
            System.out.println("<10");
            return false;
        }
    }

}