import static java.lang.Thread.sleep;

public class Thread_Part2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Producer implements Runnable {

    Shop shop;

    Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                shop.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    Shop shop;

    Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            shop.get();
        }
    }
}

class Shop {
    private int product = 0;

    synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("get interrupted");
            }
        }
        product--;
        System.out.println("consumer bought 1 product");
        System.out.println("products available: " + product);
        notify();
    }

    synchronized void put() throws InterruptedException {
        while (product >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("get interrupted");
            }
        }
        sleep(300);
        product++;
        System.out.println("producer made 1 product");
        System.out.println("products available: " + product);
        notify();

    }
}