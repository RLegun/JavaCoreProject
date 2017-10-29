package Lesson11;

import com.sun.deploy.util.SessionState;

import java.time.LocalDate;

public class Human {
    private String name;
    private String surname;
    private LocalDate bornDate;

    public Human() {
        this.name = "name";
        this.surname = "surname";
        this.bornDate = LocalDate.now();
    }

    public Human(String name, String surname, LocalDate bornDate) {
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
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornDate=" + bornDate +
                '}';
    }
}
