package Lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader implements IRead {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInformationFromConsole() {
        System.out.print("Enter the text: ");
        return scanner.next();
    }

    @Override
    public ArrayList<String> getInfoFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> text = new ArrayList<>();
        String str = "end";
        System.out.println("Enter the text:");

        while (true) {
            String string = reader.readLine();
            if (string.equals(str))
                break;
            text.add(string);
        }
        return text;
    }

    @Override
    public ArrayList<String> getInfoFromFile() throws IOException {
        ArrayList<String> text = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the path --> ");
        String path = scanner.next();
        File f = new File(path);
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File "+f.getName()+"? y/n");
        name = br.readLine();
        if(name.equals("y"))
            while ((line = fin.readLine()) != null) {
                text.add(line);
            }
        return text;
    }
}
