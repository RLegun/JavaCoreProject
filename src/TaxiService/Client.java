package TaxiService;

import java.time.LocalDate;

public class Client extends Person {
    private int id;
    private OrderStatus clientStatus;

    public Client(String name, String surname, LocalDate bornDate, String numberPhone, int id) {
        super(name, surname, bornDate, numberPhone);
        this.id = id;
    }

    public Client(String name, String surname, String numberPhone, OrderStatus clientStatus) {
        super(name, surname, numberPhone);
        this.id = ClientList.getClients().size()+1;
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

    @Override
    public String toString() {
        return "Клієнт{" +
                "id='" + getId() +'\'' +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", numberPhone='" + getNumberPhone() +
                ", status='" + getClientStatus() + '}';

    }
}
