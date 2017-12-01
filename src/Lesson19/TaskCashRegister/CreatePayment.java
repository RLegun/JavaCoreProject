package Lesson19.TaskCashRegister;

public class CreatePayment {
    public static void createPaymentCash() {
        Paymaster payment = new Paymaster(new PaidCash());
        payment.payment();
    }

    public static void createPaymentCreditCard() {
        Paymaster payment = new Paymaster(new PaidCreditCard());
        payment.payment();
    }
}
