import static java.lang.Thread.sleep;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("The first task:");
        Thread firstThread = new Thread();
        System.out.println("The first thread");
        firstThread.start();

        Thread secondThread = new Thread();
        try {
            sleep(5000);
            System.out.println("The second thread with delay 5 sec");
        } catch (Exception e) {
        }
        secondThread.start();

    }

}





