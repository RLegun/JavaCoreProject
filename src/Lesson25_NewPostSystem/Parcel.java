package Lesson25_NewPostSystem;

public class Parcel extends PostBox {
    private String deliveryInformation;

    public Parcel(int height, int width, int weight, int price, String deliveryInformation) {
        super(height, width, weight, price);
        this.deliveryInformation = deliveryInformation;
    }

    public String getDeliveryInformation() {
        return deliveryInformation;
    }
}
