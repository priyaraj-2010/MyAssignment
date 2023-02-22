package week3.day5;

public class SmartPhone extends AndroidPhone{
	public void connectWhatsApp() {
		// TODO Auto-generated method stub
    System.out.println("Connect to WhatsApp");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SmartPhone smart = new SmartPhone();
  smart.connectWhatsApp();
  smart.makeCall();
  smart.sendMsg();
  smart.saveContact();
  smart.takeVideo();
  
	}

}
