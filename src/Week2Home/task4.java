package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 08.03.2017.
 */
public class task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter some value");
        long value = scanner.nextLong();
        long count = 1;
        long max = 0;
        for (long i = value; i >= 1; i /= 10) {
            long value1 = i % 10;
            //System.out.print(value1 + " " );
            if(value1 > count){
                max =  value1;
                count = value1;
            }
            else {
                max = count;
            }
        }
        System.out.println(max);
    }
}
