package Lesson23_Generics;

import Lesson22.GameMonopoly.Game;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Simple <String> simple = new Simple<>("some text");
        simple.showType();

        Simple<Game> simleGame = new Simple<>(new Game());
        simleGame.showType();

        Simple<Integer> simpleInt = new Simple<Integer>(4);

        //simpleInt = simple;
        Game g1 = new Game();
        Game g2 = g1;


        ArrayList<Game> games = new ArrayList<>();

    }
}
