package Lesson06;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random random = new Random();

        int resultsMatches[] = new int[20];
        int rand;
        int win = 0;
        int draw = 0;

        for (int i = 0; i < resultsMatches.length; i++) {
            rand = random.nextInt(4);
            if (rand!=2){
                resultsMatches[i] = rand;
            }
        }

        for (int i = 0; i < resultsMatches.length; i++) {
            if (resultsMatches[i]==1) draw++;
            if (resultsMatches[i]==3) win++;
        }

        System.out.println("Із 20 матчів команда перемогла "+win+" рази, та зіграла в нічию "+draw+" разів.");
    }
}
