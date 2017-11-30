package Lesson19.TaskCashRegister;

import java.io.*;
import java.time.LocalDate;

public class CheckPrintDatabase implements CheckPrintable {
    @Override
    public void saveCheck(String text) throws IOException {
        double sum = MenuCashRegister.getSum();
        LocalDate date = LocalDate.now();
        File file = new File("C:\\Users\\Роман\\Desktop\\database.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(file,true));
        writer.println("---------------------------------------------------");
        writer.println("            < ЧЕК ОПЛАТИ > ||database||            ");
        writer.println("---------------------------------------------------");
        writer.println("  "+text+"                                         ");
        writer.println("  СУМА ОПЛАТИ: " + sum+"                           ");
        writer.println("  "+date+"                                         ");
        writer.println("---------------------------------------------------");
        writer.close();
    }
}
