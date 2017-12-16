package Lesson25_NewPostSystem;

public class PostOffice <T extends Box> {
    private T[] postBoxes;

    public PostOffice(T[] postBoxes) {
        this.postBoxes = postBoxes;
    }

    public T[] getPostBoxes() {
        return postBoxes;
    }
}
