public class SynchronizedExamples {

    private static int a = 0;
    static final Object object = new Object();

    public static void main(String[] args) throws InterruptedException {



        Thread thread1 = new Thread(() -> {
            incrementA("thread1");
        });

        Thread thread2 = new Thread(() -> {

            incrementA("thread2");
        });

        Thread thread3 = new Thread(() -> {
            incrementA("thread3");

        });

        Thread thread4 = new Thread(() -> {
            incrementA("thread4");

        });

        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        System.out.println(a);

    }


    public static  void incrementA(String name) {
        System.out.println(name + "a = " + a);
        for (int i = 0; i < 10000; i++) {
            a++;
        }

    }
}
