import java.util.concurrent.Exchanger;

class DukeThread extends Thread{
	
	private Exchanger<String>sillyTalk;
	
	public DukeThread(Exchanger<String>args){
		sillyTalk = args;
	}
	
	public void run(){
		String reply = null;
		try{
			reply = sillyTalk.exchange("Knock Knock!");
			System.out.println("CoffeeShop: "+ reply);
			reply = sillyTalk.exchange("Duke");
			System.out.println("CoffeeShop: "+ reply);
			reply = sillyTalk.exchange("The one who was born in this coffee shop!");
		}catch(InterruptedException e){
			System.out.println("Got interrupted during my silly talk");
		}
	}
}

class CoffeeShopThread extends Thread{
private Exchanger<String>sillyTalk;
	
	public CoffeeShopThread(Exchanger<String>args){
		sillyTalk = args;
	}
	public void run(){
		String reply = null;
		try{
			reply = sillyTalk.exchange("Who's there?");
			System.out.println("Duke: "+ reply);
			reply = sillyTalk.exchange("Duke who?");
			System.out.println("Duke: "+ reply);
			reply = sillyTalk.exchange("");
			System.out.println("Duke: " + reply);
		}catch(InterruptedException e){
			System.out.println("Got interrupted during my silly talk");
		}
	}
}

class KnockKnock{
	public static void main(String[]args){
		Exchanger<String>sillyTalk=new Exchanger<String>();
		new CoffeeShopThread(sillyTalk).start();
		new DukeThread(sillyTalk).start();
	}
}












