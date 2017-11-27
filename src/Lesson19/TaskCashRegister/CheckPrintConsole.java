package Lesson19.TaskCashRegister;

import java.time.LocalDate;

public class CheckPrintConsole implements CheckPrintable {
    @Override
    public void saveCheck(String text) {
        double sum = MenuCashRegister.getSum();
        LocalDate date = LocalDate.now();
        System.out.println("--------------------------------------------------");
        System.out.println("           < РОЗДРУКОВАНИЙ ЧЕК ОПЛАТИ >           ");
        System.out.println("--------------------------------------------------");
        System.out.println(" "+text+"                                         ");
        System.out.println(" СУМА ОПЛАТИ: " + sum+"                           ");
        System.out.println(" "+date+"                                         ");
        System.out.println("--------------------------------------------------");
    }
}
