package Lesson18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer implements IWrite {
    @Override
    public void putInfoIntoFile(ArrayList text) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Роман\\Desktop\\write.txt");
        for(Object string:text){
            writer.write(string + System.getProperty("line.separator"));
        }
        writer.close();
        MenuReplacer.showReplacerMenu();
        System.out.println("saved...");
    }
}
