package com.zhenya_flower;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaLast extends Parent {


    JavaLast(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Parent parent = new Parent("Anton",12);
        Parent parent1 = new Parent("Andrey", 11);
        List list = new ArrayList<>();
        list.add(parent);
        list.add(parent1);
        list.stream().map(Object::toString).forEach((n)->System.out.println(n.toString()+" "));

        Optional <Integer> optional = Optional.of(12);
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
        else{
            System.out.println("wrong");
        }

    }

}

class Parent {
    String name;
    int age;
   Parent(String name, int age){
       this.age=age;
       this.name=name;
   }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

