package Lesson11;

public class ArrayResize {

    public static Subject[] getResize(Subject[] subjects) {
        Subject[] arrayResized = new Subject[subjects.length * 2];
        for (int i = 0; i < subjects.length; i++) {
            arrayResized[i] = subjects[i];
        }
        return arrayResized;
    }
}
