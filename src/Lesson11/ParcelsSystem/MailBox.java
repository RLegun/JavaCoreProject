package Lesson11.ParcelsSystem;

public class MailBox extends Box {
    private double weight;
    private double price;

    public MailBox() {
        super();
        weight = 0;
        price = 0;
    }

    public MailBox(double height, double width, double depth, double weight, double price) {
        super(height, width, depth);
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
