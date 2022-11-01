public class HomeWork_Thread_Part2 {
    public static void main(String[] args) {

        Apple apple = new Apple();
        AppleINC appleINC = new AppleINC(apple);
        Customer customer = new Customer(apple);
        new Thread(appleINC).start();
        new Thread(customer).start();

    }
}

class Apple {
    private int iPhone = 0;

    synchronized void produced() {
        while (iPhone >= 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Get interrupted");
            }
        }
        iPhone++;
        System.out.println("Apple produced one iPhone");
        System.out.println("iPhones available: " + iPhone);
        notify();

    }
    synchronized void bought() {
        while (iPhone == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Get interrupted");
            }
        }
        iPhone--;
        System.out.println("Customer bought one iPhone");
        System.out.println("iPhones available: " + iPhone);
        notify();


    }
    synchronized void boughtAndTrowAway() {
        while (iPhone <= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Get interrupted");
            }
        }
        bought();
        iPhone--;
        System.out.println("Throw away one iPhone");
        System.out.println("iPhones available: " + iPhone);
        notify();

    }




}

class AppleINC implements Runnable {
    Apple apple;

    AppleINC(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            apple.produced();
        }

    }
}

class Customer implements Runnable {
    Apple apple;

    Customer(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            apple.boughtAndTrowAway();
        }

    }
}

