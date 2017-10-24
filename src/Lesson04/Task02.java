package Lesson04;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        int sum = 0;

        System.out.print("Введіть значення а: ");
        a = input.nextInt();
        System.out.print("Введіть значення b: ");
        b = input.nextInt();

        int i = a;
        while (i <= b) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Сумма всіх парних чисел від " + a + " до " + b + " = " + sum);
    }
}
