package Lesson19.TaskCashRegister;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Paymaster {
    public Scanner scanner = new Scanner(System.in);
    private Paidable paidable;
    private ArrayList<CheckPrintable> check = new ArrayList<>(
            Arrays.asList(new CheckPrintConsole(), new CheckPrintPhone(), new CheckPrintDatabase()));


    public Paymaster(Paidable paidable) {
        this.paidable = paidable;
    }

    public void payment() throws IOException {
        int paid = paidable.executePay();
        if (paid >= MenuCashRegister.getSum())
            printCheck();
        else {
            System.out.println("Не достатньо коштів для оплати!!!");
            System.exit(0);
        }
    }

    public void printCheck() throws IOException {
        MenuCashRegister.showMenuPrintCheck();
        switch (scanner.nextInt()) {
            case 1:
                for (CheckPrintable x : check) {
                    if (x instanceof CheckPrintConsole || x instanceof CheckPrintDatabase) {
                        x.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО");
                    }
                }
                System.exit(0);
            case 2:
                for (CheckPrintable x : check) {
                    if (x instanceof CheckPrintPhone || x instanceof CheckPrintDatabase) {
                        x.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО");
                    }
                }
                System.exit(0);
            case 3:
                for (CheckPrintable x : check) x.saveCheck("ОПЛАТА ПРОЙШЛА УСПІШНО");
                System.exit(0);
        }
    }
}
