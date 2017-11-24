package Lesson17.HomeWork;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public static void showMenu() {

        showStackMenu();

        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreateNewStack.createStack().createNewStack();
                    break;
                case 2:
                    CreateNewStack.createStack().createNewStack();
                    break;
                case 3:
                    StackList.getStackLists().get(StackList.getId()).push(CreateElementsForStack.enterElement());
                    break;
                case 4:
                    StackList.getStackLists().get(StackList.getId()).push(CreateElementsForStack.randomElement());
                    break;
                case 5:
                    StackList.getStackLists().get(StackList.getId()).pop();
                    break;
                case 6:
                    StackList.getStackLists().get(StackList.getId()).showStack();
                    break;
                case 7:
                    StackList.getStackLists().get(StackList.newId()).showStack();
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
        System.out.println("* 1. СТВОРИТИ НОВИЙ СТЕК: (implements MyStack)     *");
        System.out.println("* 2. СТВОРИТИ НОВИЙ СТЕК: (implements RandomStack) *");
        System.out.println("* 3. ДОДАТИ ЕЛЕМЕНТ ДО СТЕКУ: (ваш елемент)        *");
        System.out.println("* 4. ДОДАТИ ЕЛЕМЕНТ ДО СТЕКУ: (random)             *");
        System.out.println("* 5. ВИТЯГТИ ЕЛЕМЕНТ ІЗ СТЕКУ:                     *");
        System.out.println("* 6. ПОКАЗАТИ ЕЛЕМЕНТИ СТЕКУ:                      *");
        System.out.println("* 7. УПРАВЛІННЯ СТЕКАМИ: (по номеру стека)         *");
        System.out.println("* 0. ВИЙТИ ІЗ МЕНЮ:                                *");
        System.out.println("****************************************************");
    }

    public static int getChoice() {
        return choice;
    }
}
