package Lesson07;

import java.util.Arrays;

public class Lesson_7_1 {
    public static void main(String[] args) {

        int[] anotherArray = {5,10,9,6};

        int[] someArray = anotherArray;
        int[] thirdArray = Arrays.copyOf(someArray,someArray.length);

        someArray[2]=8;


        for (String line: args){
            System.out.println(line);
        }

        Arrays.sort(anotherArray);
        for (int number:anotherArray) System.out.println(number);


    }
}
