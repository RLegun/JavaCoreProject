package TaxiService;

import java.time.LocalDate;

public class VipClient extends Client {

    private final int sale = 10;

    public VipClient(String name, String surname, LocalDate bornDate, String numberPhone, int id) {
        super(name, surname, bornDate, numberPhone, id);
    }

    public VipClient(String name, String surname, String numberPhone, OrderStatus clientStatus) {
        super(name, surname, numberPhone, clientStatus);
    }

    public VipClient(int distance) {
        super(distance);
    }

    public final void calculatePayment() {
        int payment;
        payment =(getPayment()*getDistance())-(getPayment()*getDistance()*sale/100);
        System.out.println("\n**********************************");
        System.out.println("ВАРТІСТЬ ПРОЇЗДУ СКЛАДАЄ: "+payment+" грн.");
        System.out.println("**********************************");
    }

    public final void calculatePayment(int percent) {
        int payment;
        payment =(getPayment()*getDistance())-(getPayment()*getDistance()*sale/100)+
                (getPayment() * getDistance()*percent/100);
        System.out.println("\n**********************************");
        System.out.println("ВАРТІСТЬ ПРОЇЗДУ СКЛАДАЄ: "+payment+" грн.");
        System.out.println("**********************************");
    }

    @Override
    public String toString() {
        return "VipClient{" +
                "sale=" + sale +
                '}';
    }
}
