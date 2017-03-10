package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 09.03.2017.
 */
public class task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Monday");
            System.out.println("2. Tuesday");
            System.out.println("3. Wednesday");
            System.out.println("4. Thursday");
            System.out.println("5. Friday");
            System.out.println("6. Saturday");
            System.out.println("7. Sunday");
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    Monday(choose);
                    break;
                case "2":
                    Tuesday(choose);
                    break;
                case "3":
                    Wednesday(choose);
                    break;
                case "4":
                    Thursday(choose);
                    break;
                case "5":
                    Friday(choose);
                    break;
                case "6":
                    Saturday(choose);
                    break;
                case "7":
                    Sunday(choose);
                    return;
                default:
                    System.out.println("Wrong choose");

            }
        }
    }


    public static void Monday(String choose) {
        System.out.println("Розклад на понеділок");
    }

    public static void Tuesday(String choose) {
        System.out.println("Розклад на вівторок");
    }

    public static void Wednesday(String choose) {
        System.out.println("Розклад на середу");
    }

    public static void Thursday(String choose) {
        System.out.println("Розклад на четвер");
    }

    public static void Friday(String choose) {
        System.out.println("Розклад на пятницю");
    }


    public static void Saturday(String choose) {
        System.out.println("Розклад на суботу");
    }

    public static void Sunday(String choose) {
        System.out.println("Розклад на неділю");
    }
}
