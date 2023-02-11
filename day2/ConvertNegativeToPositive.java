package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		int n =-40;
				if(n<0)
		{
			
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is positive");
		}
		if(n<0) {
			n = n *(-1);
			System.out.println("Positive Number" +n);
			}
		else
		{
			System.out.println("Negative Number" +n);
		}

	}

}
