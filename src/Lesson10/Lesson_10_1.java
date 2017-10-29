package Lesson10;

import Lesson08.Product;

import java.time.LocalDate;

public class Lesson_10_1 {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        products[0] = new Product("Beer", 15, LocalDate.now());
        products[1] = new Product("Fish", 10, LocalDate.now());
        products[2] = new Product("Milk", 16, LocalDate.now());


        Product pr1 = new Product();

        pr1.setName();
        pr1.setPrice();

        products[3] = pr1;


        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }


    }

    public static void addProduct(Product[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] == null) {
                someArray[i] = new Product();
            }
        }
    }
}
