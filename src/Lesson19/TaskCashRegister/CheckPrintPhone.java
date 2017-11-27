package Lesson19.TaskCashRegister;

public class CheckPrintPhone implements CheckPrintable{
    @Override
    public void saveCheck(String text) {
        System.out.println("===================================");
        System.out.println("Чек відправлено на телефон клієнта!");
        System.out.println("===================================");
    }
}
