package week3.day5;

public class Mobile {
	public void sendMsg() {
	 System.out.println("Send msg to my friend");

	}
	public void makeCall() {
		System.out.println("Calling to my Friend");

	}
	public void saveContact() {
    System.out.println("Save the priya name in the Contact");
	}

	public static void main(String[] args) {
    
    Mobile mobile = new Mobile();
    mobile.sendMsg();
    mobile.saveContact();
    mobile.makeCall();
   

	}

}
