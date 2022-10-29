package com.zhenya_flower.streamapi;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        Child bob = new Child("Bob", 12, 132);
        GrewUp grewUp = e -> new Adult(bob.name, bob.age, bob.height);
        Adult adult = (Adult) grewUp.grewUp(bob);
        System.out.println(adult.name + " " + adult.str + " in his " + (adult.age + 18) + " ,his height is " + adult.height + " sm");

        Adult ant = new Adult("Max", 33, 187);
        Adult alex = new Adult("Alex", 50, 169);
        Adult tom = new Adult("Tom", 47, 176);
        Adult ed = new Adult("Ed", 88, 201);

        Stream adultStream = Stream.of(ant, alex, tom, ed).limit(3).skip(1);
        if (alex.age > tom.age) {
            System.out.println(alex);
        } else {
            System.out.println(tom);
        }


    }

    @Override
    public String toString() {

        return super.toString();
    }
}

@FunctionalInterface
interface GrewUp<T, R> {
    R grewUp(T t);
}

class Child {
    String name;
    int age;
    int height;

    public Child(String name, int age, int height) {
        this.height = height;
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }
}

class Adult {
    String name;
    String str = "became adult";
    int age;
    int height;

    public Adult(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                        ", age: " + age +
                        ", height: " + height + " sm"
                ;
    }
}