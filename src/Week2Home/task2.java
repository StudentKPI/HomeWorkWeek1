package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 08.03.2017.
 */
public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter some value");
        int value = scanner.nextInt();

        int rezult = 1;

        for (int i = value; i >= 1; i /= 10) {
            int value1 = i % 10;
            System.out.print(value1 + " " );
            rezult = rezult * value1;

        }
        System.out.println();
        System.out.println(rezult);
    }
}
