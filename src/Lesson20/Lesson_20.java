package Lesson20;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lesson_20 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        submain();
    }

    public static void submain() {

        do {
            try {
                System.out.println("Введіть змінну x: ");
                int x = scanner.nextInt();
                if (x > 100) throw new LegunException("Завелике число");

                int result = random.nextInt(100) / x;
                System.out.println(result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Ділення на ноль");
            } catch (InputMismatchException ie) {
                System.out.println("Не допустимий символ");
                scanner.nextLine();
            } catch (LegunException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

}
