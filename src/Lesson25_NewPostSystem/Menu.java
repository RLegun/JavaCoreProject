package Lesson25_NewPostSystem;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static int choice;

    public static void showMenu() {

        showPostOfficeMenu();

        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreatePostBox.createPostBox();
                    break;
                case 2:
                    GetInformation.getBoxInformation(CreatePostBox.getBoxPostOffice());
                    break;
                case 3:
                    GetInformation.getPostBoxInformation(CreatePostBox.getBoxPostOffice());
                    break;
                case 4:
                    GetInformation.getParcelInformation(CreatePostBox.getBoxPostOffice());
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

    public static void showPostOfficeMenu() {
        System.out.println("****************************************************");
        System.out.println("*                  < STACK MENU >                  *");
        System.out.println("****************************************************");
        System.out.println("* 1. Вибрати посилку                               *");
        System.out.println("* 2. Дізнатись параметри коробки                   *");
        System.out.println("* 3. Дізнатись параметри поштової коробки          *");
        System.out.println("* 4. Дізнатись параметри посилки                   *");
        System.out.println("* 0. Вийти                                         *");
        System.out.println("****************************************************");
    }
}
