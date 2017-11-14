package TaxiService;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateNewClient {
    public static Client newClient(){
        Scanner scanner = new Scanner(System.in);

        Client client = new Client("name", "surname",
                "00000", OrderStatus.WAITING);

        System.out.print("Введіть імя -> ");
        String name = scanner.next();
        client.setName(name);

        System.out.print("Введіть фамілію -> ");
        String surname = scanner.next();
        client.setSurname(surname);

        System.out.print("Введіть номер вашого телефону -> ");
        String phoneNumber = scanner.next();
        client.setNumberPhone(phoneNumber);

        client.setClientStatus(OrderStatus.WAITING);

        ClientList.setClients(client);

        System.out.println("Ваше замовлення прийняте...");
        System.out.println("Номер вашого замовлення: "+client.getId());

        return client;
    }
}
