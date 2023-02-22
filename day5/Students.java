package week3.day5;

public class Students {
	public void getStudentsInfo(int x) {
    System.out.println("Student Id is " +x);		
     }
	public void getStudentsInfo(String name,int y) {
		System.out.println("Student Name is " +name);
		System.out.println("Student ID is " +y);
}
	public void getStudentsInfo(String email , String phonenumber ) {
		System.out.println("Student Email ID is " +email);
		System.out.println("Students Pnone Number " +phonenumber);

	}

	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentsInfo(1001);
		info.getStudentsInfo("Priya", 1001);
		info.getStudentsInfo("priya93.raj", "9876543222");

	}

}
