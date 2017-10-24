package Lesson07;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int row = 5;
        int col = 5;
        double[][] arr = new double[row][col];

        System.out.print("Введіть значення а: ");
        int a = scanner.nextInt();

        System.out.print("Введіть значення b: ");
        int b = scanner.nextInt();

        System.out.println("---------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(9);
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % a != 0 && arr[i][j] % b != 0) {
                    System.out.println("рядок номер: " + (i + 1) + " складається з елементів не кратним введеним числам!");
                    break;
                } else if (j == arr[i].length - 1) {
                    if (arr[i][j] % a == 0)
                        System.out.println(">>>>>рядок номер: " + (i + 1) + " складається з елементів, кратних числу " + a);
                    if (arr[i][j] % b == 0)
                        System.out.println(">>>>>рядок номер: " + (i + 1) + " складається з елементів, кратних числу " + b);
                }
            }
        }
    }
}
