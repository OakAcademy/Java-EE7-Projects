package concurrency;
import java.util.Scanner;

public class Processor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread is running...");
            wait();
            System.out.println("Producer in progress...");
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Consumer thread is running...");
            System.out.print("Press 'Enter' to continue: ");
            scanner.nextLine();
            System.out.println("Consumer in progress...");
            notify();
            Thread.sleep(5000);
            System.out.println("Consumer continued for 5 more seconds");
        }
    }
}
