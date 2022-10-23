package com.zhenya_flower.homework_lesson10_collections;


import java.util.Objects;
import java.util.Scanner;


public class Product extends Shops{
    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private String price;


    public Product(String id, String  name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sc=" + sc +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(sc, product.sc) && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sc, name, price, id);
    }
}



