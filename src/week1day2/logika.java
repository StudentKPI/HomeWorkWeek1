package week1day2;

import java.util.Scanner;

/**
 * Created by Василь on 26.02.2017.
 */
public class logika {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter some text");
        String text = scanner.nextLine();
        System.out.println("Pleas enter some word");
        String word = scanner.nextLine();
       chekText(text, word);
       // System.out.println(x + " is even " + result);

    }
    public static void chekText(String text, String word){
        if(text.contains(word) && word.length() > 5){
            System.out.println("good word found");
        }
        else {
            System.out.println("bad!");
        }
    }




    public static void chekValue(int x) {
        if (x <= 100 && x >= 10 && x % 2 == 0) {
            System.out.println(x + " is <=100 and >=10 is even");
        } else {
            System.out.println("Error");
        }
    }
}


