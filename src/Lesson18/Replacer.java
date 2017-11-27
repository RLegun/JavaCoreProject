package Lesson18;

import Lesson16.InfoList;

import java.io.IOException;

public class Replacer {
     private IRead iRead;
     private IShow iShow;
     private IWrite iWrite;

    public Replacer(IRead iRead, IShow iShow, Writer writer) {
        this.iRead = iRead;
        this.iShow = iShow;
        this.iWrite = writer;
    }

    public void replace() throws IOException {
        String tempText = iRead.getInformation();
        tempText = tempText.replace("0","9");
        iShow.showInformation(tempText);
    }

    public void fileReader() throws IOException {
        String infoFromFile = iRead.getInformation();
        iShow.showInformation(infoFromFile);
    }

    public void fileWriter() throws IOException {
        String listTempText = iRead.getInformation();
        iWrite.putInfoIntoFile(listTempText);
    }
}
