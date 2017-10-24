package Lesson06;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int arrMarch[] = new int[31];
        int numberOfDays = 0;

        System.out.print("Введіть значення s: ");
        int s = input.nextInt();

        for (int i = 0; i < arrMarch.length; i++) {
            arrMarch[i] = random.nextInt(300);
        }

        for (int i = 0; i < arrMarch.length; i++) {
            if (arrMarch[i] > s) {
                numberOfDays++;
            }
        }
        System.out.println("Кількість днів, в яких вартість проданих товарів перевищує значення s = " + numberOfDays);
    }
}
