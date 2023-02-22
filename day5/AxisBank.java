package week3.day5;

public class AxisBank extends BankInfo {
	public void deposit(int x,int y) {
		System.out.println(x+y);

	}

	public static void main(String[] args) {
		
     AxisBank obj1 = new AxisBank();
     obj1.deposit(500,100);
	}

}
