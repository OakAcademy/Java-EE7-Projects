package concurrency;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        final Processor processor = new Processor();
        Thread producerThread = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}


