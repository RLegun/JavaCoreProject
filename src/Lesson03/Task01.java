package Lesson03;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       double number01, number02, number03;

       System.out.print("Введіть перше число: ");
       number01 = input.nextDouble();
       System.out.print("Введіть друге число: ");
       number02 = input.nextDouble();
       System.out.print("Введіть третє число: ");
       number03 = input.nextDouble();

       if (number01 < 1 || number01 > 3){
           number01 /=10;
           System.out.println("Перше число = "+number01);
       }else System.out.println("Перше число = "+number01);

       if (number02 < 0 || number02 > 3){
           number02 /=10;
           System.out.println("Друге число = "+number02);
        }else System.out.println("Друге число = "+number02);

        if (number03 < 0 || number03 > 3){
           number03 /=10;
            System.out.println("Третє число = "+number03);
        }else System.out.println("Третє число = "+number03);
    }
}
