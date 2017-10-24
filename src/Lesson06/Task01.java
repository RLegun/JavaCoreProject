package Lesson06;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random random = new Random();

        int arrSize = 10;
        int arr[] = new int[arrSize];
        int numberOfItems = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[(arr.length-1)]) {
                numberOfItems++;
            }
        }*/

        for (int element : arr)
            if (element != arr[(arr.length - 1)]) numberOfItems++;


        System.out.println("Кількість елементів відмінних від останнього елементу масиву = " + numberOfItems);
    }
}
