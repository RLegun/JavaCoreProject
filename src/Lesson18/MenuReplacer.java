package Lesson18;

import java.io.IOException;
import java.util.Scanner;

public class MenuReplacer {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public static void showMenu() throws IOException {

        showReplacerMenu();

        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreateReplacer.createReplacer().fileReader();
                    break;
                case 2:
                    CreateReplacer.createReplacer().fileWriter();
                    break;
                case 3:
                    CreateReplacer.createReplacer().replace();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Not the right choice!");

            }

        } while (choice != 0);
        System.exit(0);
    }

    public static void showReplacerMenu() {
        System.out.println("****************************************************");
        System.out.println("*                  MENU REPLACER:                  *");
        System.out.println("****************************************************");
        System.out.println("* 1. ЗЧИТАТИ З ФАЙЛУ ТА ВИВЕСТИ НА ЕКРАН:          *");
        System.out.println("* 2. ЗЧИТАТИ З КОНСОЛІ ТА ЗАПИВАТИ В ФАЙЛ:         *");
        System.out.println("* 3. Replacer:                                     *");
        System.out.println("* 0. ВИЙТИ ІЗ МЕНЮ:                                *");
        System.out.println("****************************************************");
    }

    public static int getChoice() {
        return choice;
    }
}
