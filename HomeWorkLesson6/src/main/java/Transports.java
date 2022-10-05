

public class Transports{
    public static void main(String[] args) {
    Bike bike = new Bike();
    bike.beep();
    bike.ride();
    Car car = new Car();
    car.beep();
    car.start();
    car.ride();
    }

}
abstract class Transport{
    abstract void ride();
    abstract  void beep();

}
class Bike extends Transport{

    @Override
    void ride() {
System.out.println("Bike is ridding");
    }

    @Override
    void beep() {
System.out.println("beeeep");
    }
}
class Car extends Transport implements IStartEngine{

    @Override
    void ride() {
System.out.println("Car is moving");
    }

    @Override
    void beep() {
        System.out.println("beeeep");
    }

    @Override
    public void start() {
        System.out.println("Engine was started");
    }
}
class Tractor extends Transport implements IStartEngine{

    @Override
    void ride() {
System.out.println("Tractor is moving");
    }

    @Override
    void beep() {
    System.out.println("beeeep");
    }

    @Override
    public void start() {
        System.out.println("Engine was started");
    }
}
interface IStartEngine{
    void start();
}
