package Lesson19.TaskCashRegister;

public class CreatePayment {
    public static Paymaster createPaymentCash() {
        Paymaster payment = new Paymaster(new PaidCash());
        return payment;
    }

    public static Paymaster createPaymentCreditCard() {
        Paymaster payment = new Paymaster(new PaidCreditCard());
        return payment;
    }
}
