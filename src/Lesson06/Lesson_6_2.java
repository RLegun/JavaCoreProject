package Lesson06;

import java.util.Random;

/*
Відомі дані про кількість опадів, які випали за кожний день лютого.
Знайти загальну кількість опадів, які випали по парних числах
місяця.
 */
public class Lesson_6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] opady = new double[4];
        double randomValue;
        double opadySum =0;
        for (int i = 0;i < opady.length;i++){
          randomValue = random.nextInt(40)+random.nextDouble();
          opady[i] = Math.round(randomValue*100.0)/100.0;
            System.out.println("["+(i+1)+"]="+opady[i]);
        }

        for (int i = 0; i < opady.length ; i++) {
            if ((i+1)%2==0){
                opadySum+=opady[i];
            }
        }
        System.out.println("кількість опадів по парних числах = "+opadySum);


    }
}
