package week2day2;

/**
 * Created by Василь on 05.03.2017.
 */
public class StringFormat {
    public static void main(String[] args) {

        String name = "vlad";
        int age = 20;
        float height = 1.85f;
        boolean isMan = true;

        String result = String.format("Name is: %s\n" + "Age is: %d\n" + "Height is: %.2f\n" + "MAN is %b", name, age, height, isMan);
        System.out.println(result);
    }
}
