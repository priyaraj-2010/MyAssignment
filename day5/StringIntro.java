package week3.day5;

public class StringIntro {

	public static void main(String[] args) {
	String  s ="Priya";
	char[] charArray = s.toCharArray();
	System.out.println(charArray);
	for(int i=charArray.length-1;i>=0;i--)
	{
		System.out.print(charArray[i]);
	}

	}

}
