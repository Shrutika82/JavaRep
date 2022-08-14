package examples;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
	
		int a[]= {2,5,8,1,4};
		System.out.println("The Greater no in array->"+greaterno(a,5));

	}

	private static int greaterno(int[] a, int total) {
		// TODO Auto-generated method stub
		
		Arrays.sort(a);
		return a[total-1];
	}

}
