package TaxiService;

import java.time.LocalDate;

public class VipClient extends Client {

    public VipClient(String name, String surname, LocalDate bornDate, String numberPhone, int id) {
        super(name, surname, bornDate, numberPhone, id);
    }

    public VipClient(String name, String surname, String numberPhone, OrderStatus clientStatus) {
        super(name, surname, numberPhone, clientStatus);
    }
}
