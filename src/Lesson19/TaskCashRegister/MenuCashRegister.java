package Lesson19.TaskCashRegister;

import java.io.IOException;
import java.util.Scanner;

import static Lesson17.HomeWork.CreateElementsForStack.random;

public class MenuCashRegister {
    private static Scanner scanner = new Scanner(System.in);
    private static double sum = random.nextInt(500);
    private static int choice;
    public static double getSum() {
        return sum;
    }

    public static void showMenu() throws IOException {

        showMenuPayment();

        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreatePayment.createPaymentCash().payment();
                    break;
                case 2:
                    CreatePayment.createPaymentCreditCard().payment();
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

    public static void showMenuPayment() {
        System.out.println("****************************************************");
        System.out.println("*                   CashRegister:                  *");
        System.out.println("****************************************************");
        System.out.println("   СУМА ДО ОПЛАТИ СКЛАДАЄ "+sum+" ГРН.              ");
        System.out.println("****************************************************");
        System.out.println("* 1. розрахувати клієнта готівкою:                 *");
        System.out.println("* 2. розрахувати клієнта кридитною карткою:        *");
        System.out.println("* 0. вийти із системи:                             *");
        System.out.println("****************************************************");
    }

    public static void showMenuPrintCheck() {
        System.out.println("****************************************************");
        System.out.println("*                   CashRegister:                  *");
        System.out.println("****************************************************");
        System.out.println("   ОПЛАЧЕНО: "+sum+" ГРН.                           ");
        System.out.println("****************************************************");
        System.out.println("* 1. роздрукувати чек:                             *");
        System.out.println("* 2. відправити чек на телефон:                    *");
        System.out.println("* 3. роздрукувати та відправити на телефон:        *");
        System.out.println("* 0. вийти із системи:                             *");
        System.out.println("****************************************************");
    }
}
