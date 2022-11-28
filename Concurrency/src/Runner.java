import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }
    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("Thread 1 running...");
        condition.await();
        System.out.println("Thread 1 in progress...");
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }
    public void secondThread() throws InterruptedException {
        Thread.sleep(2000);
        lock.lock();
        System.out.println("Thread 2 is running...");
        System.out.print("Press 'Enter' to continue: ");

        new Scanner(System.in).nextLine();
        condition.signal();
        System.out.println("Thread 2 in progress... ");
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }


    public void printCount() {
        System.out.println("Counter: " + count);
    }
}
