package Lesson11;

import java.time.LocalDate;

public class PamentStudent extends Student {
    private int payment;

    public PamentStudent(){
        payment = 5000;
    }

    public PamentStudent(String name, String surname, LocalDate bornDate,
                         int ticketNumber, String group, int payment) {
        super(name, surname, bornDate, ticketNumber, group);
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PamentStudent{" +
                "payment=" + payment +
                '}';
    }
}
