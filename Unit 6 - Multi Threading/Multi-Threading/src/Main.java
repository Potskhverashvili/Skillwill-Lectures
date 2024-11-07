import java.util.concurrent.ThreadFactory;

public class Main { // Main Thread

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() ->
                System.out.println("Thread 1"));

        Thread thread2 = new Thread(() ->
                System.out.println("Thread 2"));

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        System.out.println("Main Thread");

        incrementA();
        System.out.println(a);

    }

    static int a = 5;
    public static void incrementA() {
        for (int i = 0; i < 10; i++) {
            a++;
        }
    }
}