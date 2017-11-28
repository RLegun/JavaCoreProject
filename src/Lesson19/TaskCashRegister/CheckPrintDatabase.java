package Lesson19.TaskCashRegister;

import Lesson18.MenuReplacer;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CheckPrintDatabase implements CheckPrintable {
    @Override
    public void saveCheck(String text) throws IOException {
        double sum = MenuCashRegister.getSum();
        LocalDate date = LocalDate.now();
        FileWriter writer = new FileWriter("C:\\Users\\Роман\\Desktop\\database.txt");
        writer.write("---------------------------------------------------" + System.getProperty("line.separator"));
        writer.write("            < ЧЕК ОПЛАТИ > ||database||            " + System.getProperty("line.separator"));
        writer.write("---------------------------------------------------" + System.getProperty("line.separator"));
        writer.write("  "+text+"                                         " + System.getProperty("line.separator"));
        writer.write("  СУМА ОПЛАТИ: " + sum+"                           " + System.getProperty("line.separator"));
        writer.write("  "+date+"                                         " + System.getProperty("line.separator"));
        writer.write("---------------------------------------------------" + System.getProperty("line.separator"));


        writer.close();
    }
}
