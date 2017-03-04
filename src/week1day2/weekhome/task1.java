package week1day2.weekhome;

import java.util.Scanner;

/**
 * Created by Василь on 02.03.2017.
 */
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some time");
        int time = scanner.nextInt();
        hashCode(time);
    }

    public static int hashCode(int time) {
        if(time > 0 && time < 24) {
            if(time >= 9 && time <= 18){
                System.out.println("Я на работе");

            }
            else{
                System.out.println("Я отдыхаю");

            }
        }
            else{
                System.out.println("Не коректий час");

            }
             return 0;
    }
}
