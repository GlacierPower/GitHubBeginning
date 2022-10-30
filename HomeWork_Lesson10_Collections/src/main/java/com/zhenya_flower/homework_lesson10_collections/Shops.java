package com.zhenya_flower.homework_lesson10_collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class Shops {
    private final HashSet<Product> products;

    public static void main(String[] args) {
        Shops Corona = new Shops();
        Corona.shopsTask();

    }

    public Shops() {
        products = new HashSet<Product>();
    }

    private void shopsTask() {
        Product aProduct;
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        String menu = "Enter a menu option:\n";

        menu += " 0: Quit.\n";
        menu += " 1: Add new product.\n";
        menu += " 2: Delete product.\n";
        menu += " 3: Edit product.\n";
        menu += " 4: Show list of products.\n";
        menu += " Your choice: ";

        do {
            System.out.print(menu);
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thanks for the visit!");
                    break;
                case 1:
                    try {
                        aProduct = getProductInfo();
                        addProduct(aProduct);
                    } catch (InputMismatchException e) {
                        System.out.println("You entered incorrect price or id.");
                    }
                    break;
                case 2:
                    deleteProduct(products);
                    break;
                case 3:
                    try {
                        aProduct = getProductInfo();
                        editProduct(aProduct);
                    } catch (InputMismatchException e) {
                        System.out.println("You entered incorrect price or id.");
                    }
                    break;
                case 4:
                    sortList();
                    break;
                default:
                    System.out.println("Invalid menu item: " + choice);
            }
        }
        while (choice != 0);
    }

    public Product getProductInfo() {

        String name;
        int id;
        int price;
        Product newProd;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextInt();
        newProd = new Product(id, name, price);
        return newProd;
    }

    public void editProduct(Product product) {
        for (Product prod : products) {
            if (prod.getId() == product.getId()) {
                products.remove(prod);
                addProduct(product);
            }
        }
    }

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public void deleteProduct(HashSet hashSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int sc = scanner.nextInt();
        for (Product prod : products) {
            if (prod.getId() == sc) {
                hashSet.remove(prod);
            }
        }
    }

    public void sortList() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        String menu = "Enter a menu option:\n";

        menu += " 0: Back.\n";
        menu += " 1: Increase sort.\n";
        menu += " 2: Decrease sort.\n";
        menu += " 3: Sort by time.\n";
        do {
            System.out.print(menu);
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    increaseSort();
                    break;
                case 2:
                    decreaseSort();
                    break;
                case 3:
                    sortByTime();
                    break;
                default:
                    System.out.println("Invalid menu item " + choice);
            }
        }
        while (choice != 0);


    }

    public void decreaseSort() {
        ArrayList<Product> decreaseSort = new ArrayList<Product>(products);
        decreaseSort.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return String.valueOf(t1.getPrice()).compareTo(String.valueOf(product.getPrice()));

            }


            @Override
            public boolean equals(Object o) {
                return false;
            }
        });
        for (Product product : decreaseSort) {
            System.out.print("Id: " + product.getId() + " Name: "
                    + product.getName() + " Price: " + product.getPrice() + "\n");
        }
        {

            {

            }
        }
    }

    public void increaseSort() {
        ArrayList<Product> increaseSort = new ArrayList<Product>(products);
        increaseSort.sort(new Comparator<Product>() {
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
        for (Product product : increaseSort) {
            System.out.print("Id: " + product.getId() + " Name: "
                    + product.getName() + " Price: " + product.getPrice() + "\n");
        }
    }

    public void sortByTime() {
        ArrayList<Product> sortByTime = new ArrayList<Product>(products);
        sortByTime.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return String.valueOf(product.getPrice()).lastIndexOf(String.valueOf(t1.getPrice()));
            }
        });
        for (Product product : sortByTime) {
            System.out.print("Id: " + product.getId() + " Name: "
                    + product.getName() + " Price: " + product.getPrice() + "\n");
        }
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








