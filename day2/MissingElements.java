package week1.day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		int sum = 0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		int sum1=0;
		for(int j=1;j<=8;j++)
		{
			sum1 =sum1+j;
		}
		System.out.println("Missing Elements are "+(sum -sum1));
	}

}
