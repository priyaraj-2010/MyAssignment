package week3.day5;

public class AndroidPhone extends Mobile {
public void takeVideo() {
	// TODO Auto-generated method stub
System.out.println("Video is good");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AndroidPhone phone = new AndroidPhone();
 phone.takeVideo();
 phone.sendMsg();
 phone.saveContact();
 phone.makeCall();
	}

}
