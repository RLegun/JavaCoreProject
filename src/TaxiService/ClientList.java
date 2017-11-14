package TaxiService;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientList {
    private static ArrayList<Client> clients = new ArrayList<>();

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static void setClients(ArrayList<Client> clients) {
        ClientList.clients = clients;
    }

    public static void setClients(Client client) {
        clients.add(client);
    }

    public static Client getWaitingClient() {
        Client waitingClient = clients.get(0);
        for (int i = clients.size() - 1; i >= 0; i--) {
            if (clients.get(i).getClientStatus() == OrderStatus.WAITING) {
                waitingClient = clients.get(i);
            }
        }
        return waitingClient;
    }

    public static void WaitingClients() {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getClientStatus() == OrderStatus.WAITING)
                System.out.println(clients.get(i));
        }
        if (clients.get(clients.size() - 1).getClientStatus() == OrderStatus.COMPLETED)
            System.out.println("Всі клієнти розвезені по домам!");
    }

    public static void showClients() {
        for (Client item : clients) System.out.println(item);
    }

    public static void getStatusOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваш номер замовлення --> ");
        int id = scanner.nextInt();

        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                if (clients.get(i).getClientStatus() == OrderStatus.COMPLETED) {
                    System.out.println("За вами вже виїхала машина...");
                    System.out.println("Ваше таксі: " + TaxiDriverList.getTaxiDrivers().get(i).getCar());
                }else System.out.println("Ваше замовлення поки що не прийняте! Очікуйте...");
            }
        }
    }
}
