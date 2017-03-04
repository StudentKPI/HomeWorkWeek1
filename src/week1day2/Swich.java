package week1day2;

import java.util.Scanner;

/**
 * Created by Василь on 26.02.2017.
 */
public class Swich {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter first value");
        int value1 = scanner.nextInt();
        System.out.println("Pleas enter second value");
        int value2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pleas enter operation type");
        String operation = scanner.nextLine();

        float result = doOperationBySwitch(value1, value2, operation);
        System.out.println(value1 + operation + value2 + "=" + result);
    }


    public static float doOperationBySwitch(float x, float y, String operation) {

        float result = 0;

        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
