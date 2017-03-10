package Week2Home;

import java.util.Scanner;

/**
 * Created by Василь on 10.03.2017.
 */
public class task16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = scanner.nextLine();
        System.out.println("Enter letter");
        char letter = scanner.findInLine(".").charAt(0);
        String[] word = text.split(" ");
        int countletter = 0;

        for (int i = 0; i < word.length ; i++) {
            for (char element : word[i].toCharArray()){
                if (element == letter) countletter++;
            }
        }
        System.out.println("Кількість букв " + letter + " в рядку " + countletter);

    }
}
