package Lesson23_Generics.Task23_GenerikClass;

import Lesson23_Generics.Task23_MusicLibrary.Singer;
import com.sun.xml.internal.ws.util.StreamUtils;

public class Runner {
    public static void main(String[] args) {
         Integer[] bubbleSort = {9,4,7,10,8,5,3,2,6,1};
         Double[] bubbleSort2 = {9.0,4.0,7.0,10.0,8.0,5.0,3.0,2.0,6.0,1.0};

        Statistic<Integer> statistic = new Statistic<>(bubbleSort);
        Statistic<Double> statistic2 = new Statistic<>(bubbleSort2);
        System.out.println("Середнє арифметичне 1 = "+statistic.average());
        System.out.println("Середнє арифметичне 2 = "+statistic2.average());

        System.out.println(statistic.isSameAverage(statistic2));
    }


}
