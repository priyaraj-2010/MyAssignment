package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] a1 = {1,2,8,4,9,7};
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<a1.length;j++)
			  {
				  if(a[i]==a1[j])
				  {
					  System.out.println("Intersection of two arrays are : "+a[i]);
				  }
			  }
		  }

	}

}
