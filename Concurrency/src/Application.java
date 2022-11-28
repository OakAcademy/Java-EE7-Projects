//import java.util.Random;
//import java.util.concurrent.BlockingQueue;
//
//public class Application {
//	
//	private static BlockingQueue queue = new ArrayBlockingQueue<>(10);
//	
//	public static void main(String[] args) throws InterruptedException{
//		Thread producerThread = new Thread(()->{
//			produce();
//		});
//		
//		Thread consumerThread = new Thread(()->{
//			consume();
//		});
//		
//		producerThread.start();
//		consumerThread.start();
//		producerThread.join();
//		consumerThread.join();
//	}
//	
//	private static void produce(){
//		Random random = new Random();
//		while (true){
//			try{
//				queue.put(random.nextInt(100));
//			}catch (InterruptedException e){
//				
//			}
//		}
//	}
//	
//	private static void consume(){
//		
//		while(true){
//			try{
//				Thread.sleep(100);
//				Integer value = queue.take();
//				System.out.print("Received number: " + value + ", Queue size"+ queue.size());
//			}catch(InterruptedException e){
//				
//			}
//		}
//	}
//	
//}
