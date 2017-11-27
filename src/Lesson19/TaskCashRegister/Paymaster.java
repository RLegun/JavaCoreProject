package Lesson19.TaskCashRegister;

import java.io.IOException;

public class Paymaster {
    private Paidable paidable;
    private CheckPrintable printCheck;
    private CheckPrintable printCheckPhone;
    private CheckPrintable printCheckDatabase;

    public Paymaster(Paidable paidable) {
        this.paidable = paidable;
    }

    public Paymaster(CheckPrintable printCheck) {
        this.printCheck = printCheck;
        printCheckPhone = new CheckPrintPhone();
        printCheckDatabase = new CheckPrintDatabase();
    }

    public void payment() throws IOException {
        int paid = paidable.executePay();
        if (paid >= MenuCashRegister.getSum())
        MenuCashRegister.showMenuPrintCheck();
        else {
            System.out.println("Не достатньо коштів для оплати!!!");
            System.exit(0);
        }
    }

    public void printCheck() throws IOException {
        printCheck.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО:");
        printCheckDatabase.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО:");
        System.exit(0);
    }

    public void printDoubleCheck() throws IOException {
        printCheck.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО:");
        printCheckPhone.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО:");
        printCheckDatabase.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО:");
        System.exit(0);
    }
}
