package Week2Home;

import week2day1.Utils;

import java.util.Scanner;

/**
 * Created by Василь on 09.03.2017.
 */
public class task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter text");
        String text1 = scanner.nextLine();

            String[] word = text1.split(" ");
            System.out.println(word[2]);
            char one = word[2].charAt(0);
        System.out.println("Перша буква третього слова в тексті - " + one);

    }
}
