package Lesson08;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private int price;
    private LocalDate production;

    public Product(){
        id = 1;
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

    public int getId(){
        return id;
    }
    public void setId(int arg){
        if(arg >0) id = arg;
        else id = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getProduction() {
        return production;
    }

    public void setProduction(LocalDate production) {
        this.production = production;
    }
}
