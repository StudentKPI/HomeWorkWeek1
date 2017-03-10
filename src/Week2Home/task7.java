package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 08.03.2017.
 */
public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter min value");
        int min = scanner.nextInt();
        System.out.println("Please enter max value");
        int max = scanner.nextInt();
        int suma = 0;

        for (int i = min; i <= max; i++) {
            if(i % 2 == 1){
                suma = suma + i;
            }

        }
        System.out.println("Suma = " + suma);

    }
}
