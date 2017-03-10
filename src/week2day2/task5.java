package week2day2;

import java.util.Scanner;

/**
 * Created by Василь on 05.03.2017.
 */
public class task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("1. Say \"Hello\"");
            System.out.println("2. Say \"HI\"");
            System.out.println("3. Say \"Aloha\"");
            System.out.println("4. Say \"Hallo\"");
            System.out.println("5. Say \"Bonjure\"");
            System.out.println("6. Say Exit");
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    sayHello(getName(scanner));
                    break;
                case "2":
                    sayHI(getName(scanner));
                    break;
                case "3":
                    sayAloha(getName(scanner));
                    break;
                case "4":
                    sayHallo(getName(scanner));
                    break;
                case "5":
                    sayBonjure(getName(scanner));
                    break;
                case "6":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Wrong choose");

            }
        }


    }

    public static String getName(Scanner scanner){
        System.out.println("Please enter name");
        return scanner.nextLine();
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public static void sayHI(String name){
        System.out.println("HI " + name);
    }

    public static void sayAloha(String name){
        System.out.println("Aloha " + name);
    }

    public static void sayHallo(String name){
        System.out.println("Hallo " + name);
    }

    public static void sayBonjure(String name){
        System.out.println("Bonjure " + name);
    }
}
