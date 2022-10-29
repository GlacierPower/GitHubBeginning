public class ThirdTask {
    public static void main(String[] args) {
        System.out.println("The third task:");
        SecondRunnable secondRunnable = new SecondRunnable();
        Thread thread = new Thread(secondRunnable);
        thread.start();
        Thread secThread = new Thread(secondRunnable);
        secThread.start();
    }
}
class SecondRunnable implements Runnable {
    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.print(count + " ");
        }
    }
}
