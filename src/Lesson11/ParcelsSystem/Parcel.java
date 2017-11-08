package Lesson11.ParcelsSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Parcel extends MailBox {
    private int id;
    private ArrayList<Client> clients;
    private Location currentLocation;
    private MailStatus status;

    public Parcel() {
        super();
        id = -1;
        clients = new ArrayList<>();
        currentLocation = currentLocation;
        status = status;
    }

    public Parcel( ArrayList<Client> clients, MailStatus status) {
        this.clients = clients;
        this.status = status;
    }

    public Parcel(double height, double width, double depth, double weight, double price,
                  int id, ArrayList<Client> clients, Location currentLocation, MailStatus status) {
        super(height, width, depth, weight, price);
        this.id = id;
        this.clients = clients;
        this.currentLocation = currentLocation;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setClients(Client client) {
        clients.add(client);
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public MailStatus getStatus() {
        return status;
    }

    public void setStatus(MailStatus status) {
        this.status = status;
    }

    @Override
    public void getInfo() {
        System.out.println("Клієнтами посилки є:");
        System.out.println(clients);
        System.out.println("Статус посилки є:");
        System.out.println(status);
        System.out.println("--------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", clients=" + clients +
                ", currentLocation=" + currentLocation +
                ", status=" + status +
                '}';
    }
}
