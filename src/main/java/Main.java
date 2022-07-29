import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Cash cash = new Cash();
        LongAdder result = new LongAdder();

        Thread thread1 = new Thread(() -> {
            result.add(cash.payments(cash.shop1));
        }, "one");

        Thread thread2 = new Thread(() -> {
            result.add(cash.payments(cash.shop2));
        }, "two");

        Thread thread3 = new Thread(() -> {
            result.add(cash.payments(cash.shop3));
        }, "tree");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Выручка трех магазинов за день: " + result.sum());
    }
}

