package Lesson18;

public class CreateReplacer {

    public static Replacer createReplacer(){
        Replacer replacer = new Replacer(new Reader(),new Shower(),new Writer());
        return replacer;
    }

    public static Replacer createReplacerReaderFromFile(){
        Replacer replacer = new Replacer(new ReaderFromFile(),new ShowInfoFromFile(),new Writer());
        return replacer;
    }

    public static Replacer createReplacerReaderFromConsole(){
        Replacer replacer = new Replacer(new ReaderFromConsole(),new ShowInfoFromFile(),new Writer());
        return replacer;
    }
}
