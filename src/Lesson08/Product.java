package Lesson08;

import Lesson10.ExtaScanner;

import java.time.LocalDate;
import java.util.Scanner;

public class Product {
    private static int nextID = 1;
    private int id;
    private String name;
    private int price;
    private LocalDate production;

    public Product(){
        setId();
        name = "no name";
        price = 1;
        production = LocalDate.now();
    }

    public Product(int id, String name, int price, LocalDate production){
        this.id = id;
        this.name=name;
        this.price= price;
        this.production= production;
    }

    public Product(String name, int price, LocalDate production) {
        setId();
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public int getId(){
        return id;
    }
    public void setId(int arg){
        if(arg >0) id = arg;
        else id = 0;
    }

    public void setId(){
       this.id = nextID;
       nextID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        this.name  = ExtaScanner.getText("Введіть назву продукту: ");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrice() {
        this.price = ExtaScanner.getInteger("Введіть вартість продукту: ");
    }

    public LocalDate getProduction() {
        return production;
    }

    public void setProduction(LocalDate production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", production=" + production +
                '}';
    }
}
