//
//class Processor extends Thread {
//	
//	private boolean running = true;
//	@Override
//	public void run(){
//		while (running){
//			System.out.println("Hello");
//		}
//	}
//	
//	public void shutdown(){
//		this.running = false;
//	}
//}


class Processor implements Runnable{
	
	private int id;
	
	public Processor(int id){
		this.id = id;
	}
	
	@Override
	public void run(){
		System.out.println("Starting: "+id);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			
		}
		System.out.println("Completed: "+id);
	}
}