//import java.util.concurrent.*;
//
//class RunningRaceStarter{
//	public static void main(String[]args) throws InterruptedException{
//		CountDownLatch counter = new CountDownLatch(5);
//		
//		new Runner(counter, "Carl");
//		new Runner(counter, "Joe");
//		new Runner(counter, "Jack");
//		
//		System.out.println("Starting the countdown ");
//		long countVal = counter.getCount();
//		while(countVal>0){
//			Thread.sleep(1000);
//			System.out.println(countVal);
//			if(countVal == 1){
//				System.out.println("Start");
//			}
//			counter.countDown();
//			countVal = counter.getCount();
//		}
//		
//		
//	}
//}
//
//class Runner extends Thread{
//	private CountDownLatch timer;
//	public Runner(CountDownLatch cdl, String name){
//		timer = cdl;
//		this.setName(name);
//		System.out.println(this.getName() + " ready and waiting for the count down to start");
//		start();
//	}
//	public void run(){
//		try {
//			timer.await();
//			
//		}catch(InterruptedException e){
//			System.err.println("Interrupted -- can't start running the race");
//		}
//		System.out.println(this.getName() + "started running");
//	}
//}
//
//
