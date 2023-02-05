package week1.day1;

public class Mobile {
public void sendSms() {
	String mobileModel = "Android";
	float mobileWeight =14.4f;
	System.out.println("Oppo");
}
public void makeCall() {
	boolean fullCharged = true;
	int mobileCost = 10000;
System.out.println("Calling my Friend");
}

public static void main(String[] args) {
		Mobile type = new Mobile();
		type.sendSms();
		type.makeCall();
		System.out.println("This is my Mobile");

	}

}
