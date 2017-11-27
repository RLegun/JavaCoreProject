package Lesson19.TaskCashRegister;

public class CreateCheck {
    public static Paymaster createCheck() {
        Paymaster check = new Paymaster(new CheckPrintConsole());
        return check;
    }

    public static Paymaster createCheckPhone() {
        Paymaster check = new Paymaster(new CheckPrintPhone());
        return check;
    }
}
