import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//public class Application {
//	public static void main(String[]args){
//		Runner runner1 = new Runner();
//		Runner runner2 = new Runner();
//////		runner1.start();
//////		runner2.start();
////		
////		runner1.run();
////		runner2.run();
//		
//		Thread thread1 = new Thread(new Runner(){
//		@Override
//		public void run(){
//			System.out.println("Hello");
//		}
//	});
//		
////		Thread thread2 = new Thread(new Runner());
//			
//		thread1.start();
////		thread2.start();
//	}
//	
//	public static void main(String[]args) throws InterruptedException{
//		
//		Processor processor = new Processor();
//		processor.start();
//		Thread.sleep(10000);
//		processor.shutdown();
//	}
//	
//	private int count = 0;
//	public static void main(String[]args){
//		Application application = new Application();
//		application.doCount();
//		
//	}
//	
//	public synchronized void increment(){
//		count++;
//	}
//	
//	private void doCount(){
//		Thread thread1 = new Thread(new Runnable(){
//			@Override
//			public void run(){
//				for(int i = 0; i <10000; i++){
//					increment();
//				}
//			}
//		});
//		Thread thread2= new Thread(new Runnable(){
//			@Override
//			public void run(){
//				for(int i = 0; i <10000; i++){
//					increment();
//				}
//			}
//		});
//		
//		thread1.start();
//		thread2.start();
//		
//		try{
//			thread1.join();
//			thread2.join();
//		}catch(InterruptedException e) {
//			
//		}
//		System.out.println("Counter: " + count);
//	}
//	
//}

public class Application {
	
	public static void main(String[] args){
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i =1; i <=5; i++){
			executorService.submit(new Processor(i));
		}
		
		executorService.shutdown();
		System.out.println("All tasks added!");
		try{
			executorService.awaitTermination(1, TimeUnit.DAYS);
		}catch(InterruptedException e){
		
		}
		
		System.out.println("All tasks completed!");
	}	
}
















