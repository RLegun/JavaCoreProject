package Lesson18;

import java.util.Scanner;

public class Reader implements IRead {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInformation() {
        System.out.print("Enter the text for replace: ");
        return scanner.next();
    }
}
