package Lesson20.Task_WorkWithHandlingExceptions;

import java.util.Scanner;

public class CircleList {
    private static Scanner scanner = new Scanner(System.in);
    private static Circle[] circles = new Circle[2];
    private static int i = 0;

    public static void setCircles(Circle boy) {
        try {
            circles[i++] = boy;
        } catch (ArrayIndexOutOfBoundsException e) {
            Menu.showMainMenu();
            System.out.println("Список вже заповнений!!!");
        }
    }

    public static void showArea() {
        Menu.showArea();
        try {
            switch (scanner.nextInt()) {
                case 1:
                    circles[0].calculateArea();
                    break;
                case 2:
                    circles[1].calculateArea();
                    break;
                default:
                    System.out.println("Not the right choice!");
            }
        } catch (NullPointerException e) {
            Menu.showMainMenu();
            System.out.println("Такий круг не існує!!!");
        }
    }
}
