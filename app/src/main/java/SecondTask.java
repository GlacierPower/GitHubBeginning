public class SecondTask {
    public static void main(String[] args) {
        System.out.println("\nThe second task:");
        Thread thirdThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread through anonym class");
            }
        };
        thirdThread.start();

        Runnable firstRunnableThread = new Runnable() {
            @Override
            public void run() {

                System.out.println("Runnable through anonym class");
            }
        };
        Thread firstThroughRun = new Thread(firstRunnableThread);
        firstThroughRun.start();

        Thread threadThroughClass = new Thread(new ThreadClass());
        threadThroughClass.start();

        Thread secondThroughRun = new Thread(new RunnableClass());
        secondThroughRun.start();
    }
}
class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread through class");
    }
}

class RunnableClass implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread through runnable ");
    }
}
