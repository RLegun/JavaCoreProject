package TaxiService;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {

        int choice;
        System.out.println("**************************************************");
        System.out.println("*                      MENU                      *");
        System.out.println("**************************************************");
        System.out.println("* 1. ЗАМОВИТИ ТАКСІ:                             *");
        System.out.println("* 2. ПЕРЕВІРИТИ НАЯВНІСТЬ ВІЛЬНИХ МАШИН:         *");
        System.out.println("* 3. ПЕРЕВІРИТИ СТАТУС ЗАМОВЛЕННЯ:               *");
        System.out.println("* 9. УВІЙТИ ЯК АДМІНІСТРАТОР:                    *");
        System.out.println("* 0. ВИЙТИ ІЗ СИСТЕМИ:                           *");
        System.out.println("**************************************************");
        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreateNewClient.newClient();
                    break;
                case 2:
                    TaxiDriverList.showFreeTaxi();
                    break;
                case 3:
                    ClientList.getStatusOrder();
                    break;
                case 9:
                    //TODO Replace checking passowrd
                    System.out.print("Введіть пароль --> ");
                    int password = scanner.nextInt();
                    if (password == 1111)
                        menuAdministrator();
                    else System.out.println("Невірний пароль!");
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

    public static void menuAdministrator() {
        int choice;
        System.out.println("**************************************************");
        System.out.println("*                 ADMINISTRATOR                  *");
        System.out.println("**************************************************");
        System.out.println("* 1. ЗАРЄЕСТРУВАТИ НОВОГО ТАКСИСТА:              *");
        System.out.println("* 2. ВІДПРАВИТИ МАШИНУ НА ЗАМОВНЕННЯ:            *");
        System.out.println("* 3. ПЕРЕВІРИТИ НАЯВНІСТЬ СВОБІДНИХ МАШИН:       *");
        System.out.println("* 4. ТАКСИСТИ ЯКІ В НАС ПРАЦЮЮТЬ:                *");
        System.out.println("* 5. УСІ КЛІЄНТИ НАПРОТЯЗІ ДНЯ:                  *");
        System.out.println("* 6. КЛІЄНТИ ЯКІ ОЧІКУЮТЬ ТАКСІ:                 *");
        System.out.println("* 7. УСІ ВИКОНАНІ ЗАМОВЛЕННЯ:                    *");
        System.out.println("* 8. МАШИНИ НА ВИКЛИКУ:                          *");
        System.out.println("* 9. ПОВЕРНУТИСЬ В МЕНЮ КОРИСТУВАЧА:             *");
        System.out.println("* 0. ВИЙТИ ІЗ СИСТЕМИ:                           *");
        System.out.println("**************************************************");
        do {
            System.out.print("--> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreateNewTaxiDriver.newTaxiDriver();
                    break;
                case 2:
                    CreateNewOrder.newOrder();
                    break;
                case 3:
                    TaxiDriverList.showFreeTaxi();
                    break;
                case 4:
                    TaxiDriverList.showDrivers();
                    break;
                case 5:
                    ClientList.showClients();
                    break;
                case 6:
                    ClientList.WaitingClients();
                    break;
                case 7:
                    OrderList.showOrders();
                    break;
                case 8:
                    TaxiDriverList.showReservedTaxi();
                    break;
                case 9:
                    menu();
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
}
