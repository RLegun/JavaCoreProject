package Lesson10;

import java.util.Scanner;

public class ExtaScanner {
    private static  Scanner scanner = new Scanner(System.in);

    public static  String getText(String message){
        System.out.print(message);
        return scanner.next();
    }

    public static  int getInteger(String message){
        System.out.print(message);
        return scanner.nextInt();
    }



}
