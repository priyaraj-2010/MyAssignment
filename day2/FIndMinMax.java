package week1.day2;

import java.util.Arrays;

public class FIndMinMax {

	public static void main(String[] args) {
       int[] nums = {22,3981,-19,82,0,45,37};
       
      Arrays.sort(nums);
      System.out.println("After Sorting the element");
      for(int i =0;i<nums.length;i++)
      {
    	  System.out.println(nums[i]);
      }
       System.out.println("The MAximum Number in the array" +nums[0]);
       System.out.println("The Minimum Number in the array" +nums[6]);
      

	}

}
