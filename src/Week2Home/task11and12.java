package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 09.03.2017.
 */
public class task11and12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter some text");
        String text = scanner.nextLine();
        Revers(text);


    }

    public static void Revers(String text){

        String[] word = text.split(" ");

        for (int i = word.length - 1; i >= 0 ; i--) {
            System.out.print(word[i] + " ");

        }

    }
}
