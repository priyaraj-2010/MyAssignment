package week3.day5;

public class Automation extends MultipleLanguage  implements TestTool,Language  {
	public void python() {
		System.out.println("Welcome to Python");
	}
  public void ruby() {
	System.out.println("Welcome to Ruby");
}
  public void java() {
	System.out.println("Welcome to Java");
}
  public void selenium() {
	System.out.println("Welcome to Selenium");

}
	public static void main(String[] args) {
		Automation a = new Automation();
		a.python();
		a.java();
		a.ruby();
		a.selenium();
	}
	public void Java() {
		// TODO Auto-generated method stub
		
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		
	}

}
