package week3.day5;

public class BankInfo {
	public void saving() {
		
   System.out.println("Message - Saving");
	}
	public void fixed() {
		System.out.println("Mesage -fixed");

	}
	public void deposit() {
		System.out.println("Message - Deposit");

	}

	public static void main(String[] args) {
		BankInfo obj = new BankInfo();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
