package TaxiService;

import java.util.Scanner;

public class Fare {
    private static Scanner scanner = new Scanner(System.in);

    public static void calculateFare() {
        Person clientFare;
        Client client = new Client(0);
        VipClient vipClient = new VipClient(0);

        System.out.print("Введіть відстань маршруту --> ");
        int distance = scanner.nextInt();
        client.setDistance(distance);
        vipClient.setDistance(distance);

        System.out.print("Якщо маєте карточку на знижку нажміть: '1', якщо ні: '2' --> ");
        int choiceSale = scanner.nextInt();
        System.out.print("За перевезення домашніх тварин плюс від 15% до 20% від суми: є тварини нажміть:" +
                " '1', якщо ні: '2' --> ");
        int choiceAnimals = scanner.nextInt();

        if (choiceSale == 1) {
            clientFare = vipClient;
            if (choiceAnimals == 1) {
                clientFare.calculatePayment(15);
            } else if (choiceAnimals == 2)
                clientFare.calculatePayment();
        } else if (choiceSale == 2) {
            clientFare = client;
            if (choiceAnimals == 1) {
                clientFare.calculatePayment(20);
            } else if (choiceAnimals == 2)
                clientFare.calculatePayment();
        } else System.out.println("Ви десь помилились з вибором!!!");
    }
}
