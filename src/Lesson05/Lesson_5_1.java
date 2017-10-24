package Lesson05;

import java.util.Random;
import java.util.Scanner;

public class Lesson_5_1 {
    public static void main(String[] args) {
        do {
            showMenu();

            int choice = userChoice();
            openMenu(choice);
            break;
        } while (true);
    }

    public static void showMenu() {
        System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=");
        System.out.println("1 - гра вгадай число");
        System.out.println("2 - середнє арифметичне");
        System.out.println("3 - сума парних чисел");
        System.out.println("0 - вихід з програми");
        System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=");
    }

    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Виберіть пункт меню: ");
        int menuNumber = input.nextInt();
        return menuNumber;
    }

    public static void openMenu(int choice) {
        if (choice >= 0 && choice < 5) {
            switch (choice) {
                case 1:
                    game();
                    break;
                case 2:
                    theArithmeticMean();
                    break;
                case 3:
                    sumNumbers();
                    break;
                case 0:
                    System.out.println("\nВи вийшли з програми!!!");
                    System.exit(0);
            }
        }else System.out.println("Виберіть правильний пункт меню!!!");
    }

    public static void game(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int programChoice = random.nextInt(5) + 1;
        int userChoice;
        int counter = 1;

        System.out.println("Давайте зіграєм! Я загадала число від 1 до 5 вгадайте яке!");
        System.out.print("Введіть свій варіант -> ");
        userChoice = input.nextInt();

        if (userChoice>0 && userChoice<6){
            while (userChoice!=programChoice){

                if (userChoice<programChoice) System.out.print("Спробуйте ше раз, моє число більше вашого ->");
                if (userChoice>programChoice) System.out.print("Спробуйте ше раз, моє число менше вашого->");

                userChoice = input.nextInt();
                counter++;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            switch (counter){
                case 1:
                    System.out.println("Неймовірно, ви вгадали з першого разу!!!");
                    break;
                case 2:
                    System.out.println("Доволі хороший результат, ви вгадали з другого разу!");
                    break;
                case 3:
                    System.out.println("Не погано, ви вгадали з третього разу!");
                    break;
                case 4:
                    System.out.println("Могло б бути краще, ви вгадали з четвертого разу!");
                    break;
                case 5:
                    System.out.println("Поганий результат, ви вгадали тільки з п'ятого разу!");
                    break;
            }
        }else System.out.println("Ви мабуть не зрозуміши, загадане число має бути від 1 до 5!!!");
    }

    public static void theArithmeticMean() {

        Scanner input = new Scanner(System.in);

        int start;
        int end;
        int counter = 0;
        double result = 0;

        System.out.print("Введіть початкове число: ");
        start = input.nextInt();

        System.out.print("Введіть кінцеве число: ");
        end = input.nextInt();

        for (int i = start; i <= end; i++) {
            result += i;
            counter++;
        }
        result /= counter;
        System.out.println("Середнє арифметичне всіх цілих чисел від " + start + " до " + end + " = " + result);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void sumNumbers() {
        Scanner input = new Scanner(System.in);

        int a, b;
        int sum = 0;

        System.out.print("Введіть перше число: ");
        a = input.nextInt();
        System.out.print("Введіть друге число: ");
        b = input.nextInt();

        int i = a;
        while (i <= b) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Сумма всіх парних чисел від " + a + " до " + b + " = " + sum);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

}
