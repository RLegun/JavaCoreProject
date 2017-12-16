package Lesson25_NewPostSystem;

public class GetInformation {

    public static void getBoxInformation(PostOffice <?> object){
        for (int i = 0; i < object.getPostBoxes().length; i++) {
            System.out.println("Висота коробки: "+object.getPostBoxes()[i].getHeight());
            System.out.println("Ширина коробки: "+object.getPostBoxes()[i].getWidth());
        }
    }

    public static void getPostBoxInformation(PostOffice <? extends PostBox> object){
        for (int i = 0; i < object.getPostBoxes().length; i++) {
            System.out.println("Висота поштової коробки: "+object.getPostBoxes()[i].getHeight());
            System.out.println("Ширина поштової коробки: "+object.getPostBoxes()[i].getWidth());
            System.out.println("Вага пощтової коробки: "+object.getPostBoxes()[i].getWeight());
            System.out.println("Ціна поштової коробки: "+object.getPostBoxes()[i].getPrice());
        }
    }

    public static void getParcelInformation(PostOffice <? extends Parcel> object){
        for (int i = 0; i < object.getPostBoxes().length; i++) {
            System.out.println("Висота посилки: "+object.getPostBoxes()[i].getHeight());
            System.out.println("Ширина посилки: "+object.getPostBoxes()[i].getWidth());
            System.out.println("Вага посилки: "+object.getPostBoxes()[i].getWeight());
            System.out.println("Ціна посилки: "+object.getPostBoxes()[i].getPrice());
            System.out.println("Статус посилки: "+object.getPostBoxes()[i].getDeliveryInformation());
        }
    }
}