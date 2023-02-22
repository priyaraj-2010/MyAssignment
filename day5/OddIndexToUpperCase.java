package week3.day5;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String name="Testleaf Company";
		name = name.toUpperCase();
		char[] ch = name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String lower = name.toLowerCase();
		}
		System.out.println(new String(ch));
	}

}
