package week1day1;

/**
 * Created by Василь on 25.02.2017.
 */
public class Intro {
    public static void main(String[] args) {
        String text1 = "yaron";
        String text2 = "yaron lfg";
        String name = index(text1,text2);
        System.out.println(name);
    }

    public static String index(String text1, String text2) {
        return text1 + text2;
    }
}