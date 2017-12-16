package Lesson24_Generics;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static int choice;

    public static void showMenu() {

        showStackMenu();

        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    NewStack.newStack();
                    break;
                case 2:
                    NewStack.pushElement();
                    break;
                case 3:
                    NewStack.popElement();
                    break;
                case 0:
                    System.out.println("Вихід...");
                    break;
                default:
                    System.out.println("Не правильний вибір!!");

            }

        } while (choice != 0);
        System.exit(0);
    }

    public static void showStackMenu() {
        System.out.println("****************************************************");
        System.out.println("*                  < STACK MENU >                  *");
        System.out.println("****************************************************");
        System.out.println("* 1. СТВОРИТИ НОВИЙ СТЕК:                          *");
        System.out.println("* 3. ДОДАТИ ЕЛЕМЕНТ ДО СТЕКУ:                      *");
        System.out.println("* 5. ВИТЯГТИ ЕЛЕМЕНТ ІЗ СТЕКУ:                     *");
        System.out.println("* 0. ВИЙТИ ІЗ МЕНЮ:                                *");
        System.out.println("****************************************************");
    }
}
