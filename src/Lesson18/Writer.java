package Lesson18;

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements IWrite {
    @Override
    public void putInfoIntoFile(String text) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Роман\\Desktop\\write.txt");
        writer.write(text + System.getProperty("line.separator"));
        writer.close();
        MenuReplacer.showReplacerMenu();
        System.out.println("saved...");
    }
}
