package Lesson07;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random random = new Random();

        int row = 5;
        int col = 5;
        int numberOfColumn=0;
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(9);
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==0){
                    if (numberOfColumn<(j+1)){
                        numberOfColumn=j+1;
                    }
                }
            }
        }
        System.out.println("Номер стовпчика, в якому розташований перший з права елемент рівний нулю = "+numberOfColumn);
    }
}
