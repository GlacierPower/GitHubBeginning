package com.zhenya_flower.exception;

public class Exception {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("Lada Vesta");
        lada.setSpeed(180.0);
        lada.setPrice(1455645.0);
        try {
            lada.startEngine();
        } catch (EngineWasNotStartedException e) {
            e.getMessage();
        }
        Car opel = new Car("Opel Astra", 180.0, 356584445.0);
        try {
            opel.startEngine();
        } catch (EngineWasNotStartedException e) {
            e.getMessage();
        }
        Car mercedes = new Car("Mercedes Benz G-класс (Gelendwagen )",240.0,54884198.10);
        try {
            mercedes.startEngine();
        }catch (EngineWasNotStartedException e){
            e.getMessage();
        }

    }
}

class EngineWasNotStartedException extends java.lang.Exception {
    public EngineWasNotStartedException(String message) {
        System.out.println(message);
    }
}

class Car {
    String model;
    Double speed;
    Double price;

    public Car(String model, Double speed, Double price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public Car() {

    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    void startEngine() throws EngineWasNotStartedException {
        int randomNumber = (int) (Math.random() * 20);
        if ((randomNumber % 2) == 0) {
            throw new EngineWasNotStartedException(model + "'s engine wasn't started");
        } else {
            System.out.println(model + " is ready to trip ");
        }
    }
}