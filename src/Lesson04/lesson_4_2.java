package Lesson04;

import java.util.Scanner;

/*
Знайти суму всіх цілих чисел від 150 до 300.

 */
public class lesson_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int dob = 1;
        int start = 150;
        int end = 300;

        System.out.print("Введіть початкове значення ");
        start = input.nextInt();
        System.out.print("Введіть кінцеве значення ");
        end = input.nextInt();

        for (int i = start; i <end ; i++) {
            sum +=i;
        }
        System.out.println("сума від "+start+" до "+end+" = "+sum);

        int i = start;
        while(i<end){
            dob*=i;
            i++;
        }
        System.out.println("добуток від "+start+" до "+end+" = "+dob);
    }




}
