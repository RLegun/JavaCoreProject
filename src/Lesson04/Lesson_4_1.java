package Lesson04;

import java.util.Scanner;

public class Lesson_4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayNumber;

        System.out.print("Введіть номер дня: ");
        dayNumber = input.nextInt();

        if (dayNumber == 1) {
            System.out.println("День " + dayNumber + "-понеділок");
        } else if (dayNumber == 2) {
            System.out.println("День " + dayNumber + "-вівторок");
        } else if (dayNumber == 3) {
            System.out.println("День " + dayNumber + "-середа");
        } else if (dayNumber == 4) {
            System.out.println("День " + dayNumber + "-четвер");
        } else if (dayNumber == 5) {
            System.out.println("День " + dayNumber + "-Пятниця");
        } else if (dayNumber == 6) {
            System.out.println("День " + dayNumber + "-субота");
        } else if (dayNumber == 7) {
            System.out.println("День " + dayNumber + "-неділя");
        } else {
            System.out.println("Такого дня не існує");
        }


        switch (dayNumber) {
            case 1:
                System.out.println("День " + dayNumber + "-понеділок");
                break;
            case 2:
                System.out.println("День " + dayNumber + "-вівторок");
                break;
            case 3:
                System.out.println("День " + dayNumber + "-середа");
                break;
            case 4:
                System.out.println("День " + dayNumber + "-четвер");
                break;
            case 5:
                System.out.println("День " + dayNumber + "-Пятниця");
                break;
            case 6:
                System.out.println("День " + dayNumber + "-субота");
                break;
            case 7:
                System.out.println("День " + dayNumber + "-неділя");
                break;
            default:
                System.out.println("Такого дня не існує");
        }

    }
}
