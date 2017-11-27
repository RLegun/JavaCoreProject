package Lesson19.TaskCashRegister;

import java.util.Scanner;

public class PaidCash implements Paidable {

    @Override
    public int executePay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("внесіть готівку -> ");
        return scanner.nextInt();
    }
}
