package Lesson11.ParcelsSystem;

import java.time.LocalDate;

public class Client {
    private String name;
    private String surname;
    private LocalDate bornDate;

    public Client() {
        name = "name";
        this.surname = "surname";
        this.bornDate = LocalDate.of(1990,1,1);
    }

    public Client(String name, String surname, LocalDate bornDate) {
        this.name = name;
        this.surname = surname;
        this.bornDate = bornDate;
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

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornDate=" + bornDate +
                '}';
    }
}
