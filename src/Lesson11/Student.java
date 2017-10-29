package Lesson11;

import java.time.LocalDate;

public class Student extends Human {
    private int ticketNumber;
    private String group;

    public Student(){
        super();
        ticketNumber = 0;
        group = "noGroup";
    }

    public Student(String name, String surname, LocalDate bornDate,
                   int ticketNumber, String group) {
        super(name, surname, bornDate);
        this.ticketNumber = ticketNumber;
        this.group = group;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ticketNumber=" + ticketNumber +
                ", group='" + group + '\'' +
                '}';
    }
}
