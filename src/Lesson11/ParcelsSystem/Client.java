package Lesson11.ParcelsSystem;

import java.time.LocalDate;

public class Client {
    private String name;
    private String surname;
    private LocalDate bornDate;
    private String status;

    public Client() {
        name = "name";
        surname = "surname";
        bornDate = LocalDate.of(1990,1,1);
        status = "status";
    }

    public Client(String name, String surname, LocalDate bornDate, String status) {
        this.name = name;
        this.surname = surname;
        this.bornDate = bornDate;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornDate=" + bornDate +
                ", status='" + status + '\'' +
                '}';
    }
}
