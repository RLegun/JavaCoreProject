package Lesson04;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = 50;
        int b;
        int counter = 0;
        double result = 0;

        System.out.print("Введіть число: ");
        b = input.nextInt();

        if (b >= 50) {
            for (int i = start; i <= b; i++) {
                result += i;
                counter += 1;
            }
            result /= counter;
            System.out.println("Середнє арифметичне всіх цілих чисел від " + start + " до " + b + " = " + result);
        } else System.out.println("Ваше число менше 50!");
    }
}
