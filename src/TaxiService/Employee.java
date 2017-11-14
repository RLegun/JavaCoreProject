package TaxiService;

import java.time.LocalDate;

public class Employee extends Person {

    public Employee(String name, String surname, LocalDate bornDate, String numberPhone) {
        super(name, surname, bornDate, numberPhone);
    }

    public Employee() {

    }
}
