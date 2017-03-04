package week2day1;

/**
 * Created by Василь on 04.03.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] mas = new int[5];
        int[] mas1 = {1, 6, 6, 6};
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int) (Math.random()*20);
            System.out.print(mas[i] + " ");
        }
        int counter = 0;
        while (counter != mas.length){
            mas[counter] = (int) (Math.random()*20);
            System.out.print(mas[counter] + " ");
            counter++;
        }
    }
}
