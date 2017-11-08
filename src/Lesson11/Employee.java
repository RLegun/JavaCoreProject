package Lesson11;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Human {
    int id;
    LocalDate hireDate;
    double salary;

    public Employee() {
        super();
        id = -1;
        hireDate = LocalDate.now();
        salary = 0;
    }

    public Employee(String name, String surname, LocalDate bornDate, int id, LocalDate hireDate, double salary) {
        super(name, surname, bornDate);
        this.id = id;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(int percent) {
        salary += salary * percent / 100;
    }

    public int getExperience() {
        LocalDate now = LocalDate.now();
        Period experience = Period.between(hireDate, now);
        return experience.getYears();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", expirience=" + getExperience() +
                '}';
    }
}
