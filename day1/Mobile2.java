package week1.day1;

public class Mobile2 {
	
	boolean isFullcharged;
	int mobilecost;
	
	
	public void makeCall() {
		System.out.println("Make Call");
		
	}
	public void sendMsg() {
		System.out.println("Send Message");
		
	}
	public static void main(String[] args) {
		Mobile2 mob2= new Mobile2() ;
		System.out.println("This is my mobile");
		
		mob2.makeCall();
		mob2.sendMsg();
	}


}
