package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 08.03.2017.
 */
public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter some value");
        long value = scanner.nextLong();
        int j = 0;
        int count = 0;

        for (long i = value; i >= 1; i /= 10) {
            long value1 = i % 10;
            //System.out.print(value1 + " " );
           if(i % 2 == 0){
                j = 1;
           }
           else {
               j = 0;
           }
            count = count + j;
        }
        System.out.println();
        System.out.println(count);


    }
}
