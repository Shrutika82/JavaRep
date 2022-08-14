package array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many String u want to store in array");
		int n=sc.nextInt();
		String a[]=new String[n];
		
		System.out.println("Enter String");
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.next();
		}
		
		System.out.println("String in array are");
		for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ,");
		}
		sc.close();


	}

}
