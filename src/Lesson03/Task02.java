package Lesson03;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number01, number02, number03;
        double  maxValue;

        System.out.print("Введіть перше число: ");
        number01 = input.nextDouble();
        System.out.print("Введіть друге число: ");
        number02 = input.nextDouble();
        System.out.print("Введіть третє число: ");
        number03 = input.nextDouble();

        if (number01 > 0){
            number01 = Math.pow(number01,2);
        }

        if (number02 > 0){
            number02 = Math.pow(number02,2);
        }

        if (number03 > 0){
            number03 = Math.pow(number03,2);
        }


        maxValue = number01;

        if (maxValue<number02){
            maxValue = number02;
        }
        if (maxValue<number03) maxValue = number03;

        System.out.println("Max value = "+maxValue);


       /* if (number01 > number02 && number01 > number03){
            System.out.println("Найбільше перше число: "+number01);
        } else if (number02 > number01 && number02 > number03){
            System.out.println("Найбільше друге число: "+number02);
        } else System.out.println("Найбільше третє число: "+number03);
        */




    }
}
