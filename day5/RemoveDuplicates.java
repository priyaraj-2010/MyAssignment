package week3.day5;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "Hello Everyone Welcome to Java";
		String newString = "";
		for(int i =0;i<s.length();i++)
		{
			for(int j=0;j<newString.length();j++)
			{
				if(s.charAt(i)==newString.charAt(j));
				{
				  newString = newString+s.charAt(i);
				}
			}
		}
		System.out.println(newString);
		

	}

}
