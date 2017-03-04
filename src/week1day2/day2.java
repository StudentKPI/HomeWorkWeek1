package week1day2;

import java.util.Scanner;

/**
 * Created by Василь on 26.02.2017.
 */
public class day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter name for say hello");
        String name =scanner.nextLine();
        sayHello(name);
    }

    public static void sayHello(String name) {
        String firstVelue = "Hello";
        if(name.length()==0){
            System.out.println("Error.Wrong name");
        }else{
            System.out.println(firstVelue + name);
        }
    }
}

