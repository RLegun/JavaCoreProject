package Lesson25_NewPostSystem;

public class PostBox extends Box {
    private int weight;
    private int price;

    public PostBox(int height, int width, int weight, int price) {
        super(height, width);
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
