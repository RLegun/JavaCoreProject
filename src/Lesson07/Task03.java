package Lesson07;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {

        showTitleOfTable();

        int resultsTable[][] = fillingTableOfResults();

        int resultsOfTeams[] = countResultsOfTeams(resultsTable);

        showWinnerAndOutsider(resultsOfTeams);
    }

    public static void showTitleOfTable() {
        String[] footballTeams = {"team:A", "team:B", "team:C", "team:D",
                "team:E", "team:F", "team:G", "team:H", "team:I", "team:J"};

        System.out.print("\nТУРНІРНА ТАБЛИЦЯ МАТЧІВ:");
        System.out.println("\n---------------------------------------------------------------------------------");
        for (String teams : footballTeams) System.out.print(teams + "\t");
        System.out.println("\n---------------------------------------------------------------------------------");
    }

    public static int[][] fillingTableOfResults() {
        Random random = new Random();

        int row = 5;
        int col = 10;
        int[][] resultsTable = new int[row][col];

        for (int i = 0; i < resultsTable.length; i++) {
            for (int j = 0; j < resultsTable[i].length; j++) {
                int rand = random.nextInt(4);
                if (rand != 2) resultsTable[i][j] = rand;
                System.out.print("\t" + resultsTable[i][j] + "\t");
                System.out.print("|");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------------------------------------------------");
        return resultsTable;
    }

    public static int[] countResultsOfTeams(int resultsTable[][]) {

        int resultsOfTeams[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};

        for (int i = 0; i < resultsTable.length; i++) {
            for (int j = 0; j < resultsTable[i].length; j++) {
                for (int k = 0; k < resultsTable[i].length; k++) {
                    if (j == k) resultsOfTeams[k] += resultsTable[i][j];
                }
            }
        }
        return resultsOfTeams;
    }

    public static void showWinnerAndOutsider(int resultsOfTeams[]) {
        int maxResultsOfTeams = resultsOfTeams[0];
        int minResultsOfTeams = resultsOfTeams[0];
        char label[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        for (int i = 0; i < resultsOfTeams.length; i++) {
            if (resultsOfTeams[i] > maxResultsOfTeams) maxResultsOfTeams = resultsOfTeams[i];
        }

        for (int i = 0; i < resultsOfTeams.length; i++) {
            if (maxResultsOfTeams == resultsOfTeams[i])
                System.out.println("Команда " + "'" + label[i] + "'" + " є переможець турніру з результатом "
                        + maxResultsOfTeams + " очок!");
        }
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < resultsOfTeams.length; i++) {
            if (resultsOfTeams[i] < minResultsOfTeams) minResultsOfTeams = resultsOfTeams[i];
        }

        for (int i = 0; i < resultsOfTeams.length; i++) {
            if (minResultsOfTeams == resultsOfTeams[i])
                System.out.println("Команда " + "'" + label[i] + "'" + " є аутсайдер турніру з результатом "
                        + minResultsOfTeams + " очок!");
        }
        System.out.println("--------------------------------------------------------");
    }
}
