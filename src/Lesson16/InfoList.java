package Lesson16;

import java.util.ArrayList;

public class InfoList {
    private static ArrayList<ArrayList<String>> infoLists = new ArrayList<>();
    private static ArrayList<ArrayList<String>> labelInfoLists = new ArrayList<>();

    public static ArrayList<ArrayList<String>> getInfoLists() {
        return infoLists;
    }

    public static void setInfoLists(ArrayList<String> text) {
        infoLists.add(text);
    }

    public static void showInfo() {
        ArrayList<String> first = infoLists.get(0);
        for (String item:first) System.out.println(item);
    }

    public static void showLabel(){
        ArrayList<String> first = infoLists.get(0);
        labelInfoLists.add(first);
        for (ArrayList<String> item:labelInfoLists) System.out.println(item);
    }
}
