package Lesson19.TaskCashRegister;

import java.util.Scanner;

public class PaidCreditCard implements Paidable {
    @Override
    public int executePay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("зняти кошти з кредитної картки -> ");
        return scanner.nextInt();
    }
}
