package Lesson20.Task_WorkWithHandlingExceptions;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public static void showMenu() {

        showMainMenu();

        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreateCircle.newCircle();
                    break;
                case 2:
                    CircleList.showArea();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Not the right choice!");
                    Menu.showMainMenu();
            }

        } while (choice != 0);
        System.exit(0);
    }

    public static void showMainMenu() {
        System.out.println("****************************************************");
        System.out.println("*                      MENU:                       *");
        System.out.println("****************************************************");
        System.out.println("* 1. ДОДАТИ КРУГ ДО СПИСКУ:                        *");
        System.out.println("* 2. РОЗРАХУВАТИ ПЛОЩУ КРУГА:                      *");
        System.out.println("* 0. вийти із меню:                                *");
        System.out.println("****************************************************");
    }

    public static void showArea() {
        System.out.println("****************************************************");
        System.out.println("*                      AREA:                       *");
        System.out.println("****************************************************");
        System.out.println("* 1. розрахувати площу першого круга:              *");
        System.out.println("* 2. розрахувати площу другого круга:              *");
        System.out.println("****************************************************");
    }
}
