package Lesson07;

import java.util.Random;

public class Lesson_7_2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int row = 10;
        int column = 5;
        double[][] opadu = new double[row][column];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <column ; j++) {
                opadu[i][j] = rnd.nextInt(20)+10;
            }
        }

        for (double[] rows: opadu){
            for (double value: rows){
                System.out.print("\t"+value);
            }
            System.out.println();
        }

    }
}
