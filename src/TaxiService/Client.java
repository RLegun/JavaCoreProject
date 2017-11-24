package TaxiService;

import Lesson17.CallBack;
import Lesson17.NewCallBack;

import java.time.LocalDate;

public class Client extends Person implements NewCallBack {
    private int id;
    private OrderStatus clientStatus;
    private int payment = 5;
    private int distance;

    public Client( int distance) {
        super();
        this.distance = distance;
    }

    public Client(String name, String surname, LocalDate bornDate, String numberPhone, int id) {
        super(name, surname, bornDate, numberPhone);
        this.id = id;
    }

    public Client(String name, String surname, String numberPhone, OrderStatus clientStatus) {
        super(name, surname, numberPhone);
        this.id = ClientList.getClients().size() + 1;
        this.clientStatus = clientStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(OrderStatus clientStatus) {
        this.clientStatus = clientStatus;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payments) {
        payment = payments;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void calculatePayment() {
        payment = payment * distance;
        System.out.println("\n**********************************");
        System.out.println("ВАРТІСТЬ ПРОЇЗДУ СКЛАДАЄ: "+payment+" грн.");
        System.out.println("**********************************");
    }

    public void calculatePayment(int percent) {
        payment = (payment * distance)+(payment * distance*percent/100);
        System.out.println("\n**********************************");
        System.out.println("ВАРТІСТЬ ПРОЇЗДУ СКЛАДАЄ: "+payment+" грн.");
        System.out.println("**********************************");
    }

    @Override
    public void showMassage() {
        System.out.println("Обєкт типу клієнт");

    }

    @Override
    public double calculateFare() {
        return 0;
    }

    @Override
    public String toString() {
        return "Клієнт{" +
                "id='" + getId() + '\'' +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", numberPhone='" + getNumberPhone() +
                ", status='" + getClientStatus() + '}';

    }
}
