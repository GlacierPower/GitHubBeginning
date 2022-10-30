package com.zhenya_flower.homework_lesson10_collections;


import java.util.Objects;
import java.util.Scanner;


public class Product extends Shops{
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int price;


    public Product(int id, String  name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
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
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



