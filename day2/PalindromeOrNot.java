package week1.day2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int rem = 0;
		int reverse = 0;
		for(int num=34343;num !=0;)
		{
			rem = num %10;
			reverse = reverse*10+rem;
			num=num/10;
		}
		System.out.println(reverse);
		if(rem ==reverse)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

	
}
