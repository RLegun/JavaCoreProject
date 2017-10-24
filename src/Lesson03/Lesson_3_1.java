package Lesson03;

import java.util.Scanner;

public class Lesson_3_1 {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);
        String name ;
        String sourname ;

        System.out.print("введыть ваше імя: ");
        name=inpunt.next();
        System.out.print("введыть ваше призвище: ");
        sourname=inpunt.next();

        System.out.println("hi "+name+" "+sourname);

    }
}
