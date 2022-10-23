package com.zhenya_flower.homework_lesson10_collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Shops {
    private final ArrayList<Product> products;

    public static void main(String[] args) {
        Shops Corona = new Shops();
        Corona.shopsTask();

    }

    public Shops() {
        products = new ArrayList<Product>();
    }

    private void shopsTask() {
        Product aProduct;
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        String menu = "Enter a menu option:\n";

        menu += " 0: Quit\n";
        menu += " 1: Add new product\n";
        menu += " 2: Delete product\n";
        menu += " 3: Increase sort\n";
        menu += " 4: Decrease sort\n";
        menu += " 5: Sort by time \n";
        menu += " 6: Show list of products\n";
        menu += "Your choice: ";

        do {
            System.out.print(menu);
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thanks! Have a great day!");
                    break;
                case 1:
                    aProduct = getProductInfo();
                    addProduct(aProduct);
                    break;
                case 2:
                    aProduct = getProductInfo();
                    deleteProduct(aProduct);
                    break;
                case 3:
                    increaseSort(products);
                    break;
                case 4:
                    decreaseSort(products);
                    break;
                case 5:
                    sortByTime(products);
                    break;
                case 6:
                    showList(products);
                    break;
                default:
                    System.out.println("Invalid menu item " + choice);
            }
        }
        while (choice != 0);
    }

    public Product getProductInfo() {
        Product newProd;
        String name;
        String id;
        String price;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id");
        id = sc.next();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter price");
        price = sc.next();
        newProd = new Product(id, name, price);
        return newProd;

    }

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }


    public void deleteProduct(Product product) {
        products.remove(product);
        }



    public void showList(List listOfProduct) {
        Iterator iterator = listOfProduct.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");

        }

    }

    public void decreaseSort(List lisOfProducts) {
        lisOfProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return String.valueOf(t1.getPrice()).compareTo(String.valueOf(product.getPrice()));

            }


            @Override
            public boolean equals(Object o) {
                return false;
            }
        });
        {
            {

            }
        }
    }

    public void increaseSort(List listOfProducts) {
        listOfProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return String.valueOf(t1.getPrice()).compareTo
                        (String.valueOf(product.getPrice())) * -1;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public Comparator<Product> reversed() {

                return Comparator.super.reversed();
            }
        });
    }

    public void sortByTime(List listOfProducts) {
        listOfProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return String.valueOf(product.getPrice()).lastIndexOf(String.valueOf(t1.getPrice()));
            }
        });
        {

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shops shops = (Shops) o;
        return products.equals(shops.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Shops{" +
                "products=" + products +
                '}';
    }
}








