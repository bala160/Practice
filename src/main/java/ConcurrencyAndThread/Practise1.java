package ConcurrencyAndThread;

public class Practise1 {

    public static void main(String[] args) {
        System.out.println("Main Thread start executing");
        Thread thread1 = new Thread1("thread1");
        thread1.setDaemon(true);
        thread1.start();
        System.out.println("Main Thread stop executing");
    }
}


