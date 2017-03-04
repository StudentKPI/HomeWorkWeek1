package week1day2;

import java.util.Scanner;

/**
 * Created by Василь on 26.02.2017.
 */
public class day2a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter first value");
        int value1 =scanner.nextInt();
        System.out.println("Pleas enter second value");
        int value2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pleas enter operation type");
        String operation = scanner.nextLine();

        float result = doOperation(value1, value2, operation);
        System.out.println(result);
    }


    public static float doOperation (float x, float y, String operation){
        if (operation.equals("+")){
            return x + y;
        }
        if (operation.equals("-")){
            return x - y;
        }
        if (operation.equals("*")){
            return x * y;
        }
        if (operation.equals("/")){
            return x / y;
        }
        System.out.println("Error operation");
        return 0;

    }



   /* public static void sayHello(String name) {
        String firstVelue = "Hello";
        if(name.length()==0){
            System.out.println("Error.Wrong name");
        }else{
            System.out.println(firstVelue + name);
        }
    }*/
}
