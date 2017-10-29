package Lesson11;

import java.time.LocalDate;

public class StateStudent extends Student {
    private int salary;

    public StateStudent(){
        salary = 1000;
    }

    public StateStudent(String name, String surname, LocalDate bornDate,
                        int ticketNumber, String group, int salary) {
        super(name, surname, bornDate, ticketNumber, group);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StateStudent{" +
                "salary=" + salary +
                '}';
    }
}
