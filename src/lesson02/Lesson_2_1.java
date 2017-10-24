package lesson02;

import java.util.Scanner;

public class Lesson_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        double d;

        System.out.print("Please enter X1 = ");
        x1 = input.nextInt();
        System.out.print("Please enter X2 = ");
        x2 = input.nextInt();
        System.out.print("Please enter Y1 = ");
        y1 = input.nextInt();
        System.out.print("Please enter Y2 = ");
        y2 = input.nextInt();

        d=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));


        System.out.println("d ="+d);


    }
}
