package week3.day5;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "Hello Java ";
    char [] ch = s.toCharArray();
    for(int i=ch.length-1;i>=0;i--)
    {
    	System.out.println(ch[i]);
    }
	}

}
