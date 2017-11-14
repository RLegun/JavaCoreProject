package TaxiService;

import java.time.LocalDate;

public class TaxiDriver extends Employee {
    private Car car;
    private int id;

    public TaxiDriver() {
        super();
        car = car;
        id = 0;
    }

    public TaxiDriver(String name, String surname, LocalDate bornDate, String numberPhone, Car car) {
        super(name, surname, bornDate, numberPhone);
        this.car = car;
        this.id = TaxiDriverList.getTaxiDrivers().size()+1;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Водій{" +
                "id='" + getId() +'\'' +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", bornDate=" + getBornDate() +
                ", numberPhone='" + getNumberPhone() +
                "\n"+ getCar()+
                "\n-----------------------------------------------------------------------------------------------";

    }
}
