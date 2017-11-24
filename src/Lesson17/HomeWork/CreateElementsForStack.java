package Lesson17.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class CreateElementsForStack {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int enterElement(){
        System.out.print("Введіть елемент --> ");
        int element = scanner.nextInt();
        return element;
    }

    public static int randomElement(){
        int element = random.nextInt(100);
        return element;
    }
}
