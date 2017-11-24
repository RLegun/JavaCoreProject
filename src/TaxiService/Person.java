package TaxiService;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate bornDate;
    private String numberPhone;

    public Person() {
        name = "name";
        surname = "surname";
        bornDate = LocalDate.now();
        numberPhone = "numberPhone";
    }

    public Person(String name, String surname,LocalDate bornDate, String numberPhone) {
        this.name = name;
        this.surname = surname;
        this.bornDate = bornDate;
        this.numberPhone = numberPhone;
    }

    public Person(String name, String surname, String numberPhone) {
        this.name = name;
        this.surname = surname;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public abstract void calculatePayment();
    public abstract void calculatePayment(int percent);

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornDate=" + bornDate +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
