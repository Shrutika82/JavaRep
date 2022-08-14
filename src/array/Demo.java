package array;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,2,3,4,5};// array declaration and definition
		for(int j=0;j<5;j++)
		{
			System.out.println(b[j]);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many numbers u want to store in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter nos");
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		
		System.out.println("Nos is array are");
		for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ,");
		}
		sc.close();

		
		
		
		
		
		
//		city[0]="Pune";
//		
//		System.out.println(city[0]);
//		
//char ch[]=new char[3];
//ch[0]='a';
//ch[1]='b';
//System.out.println(ch[0]);
//
//int a[]=new int[3];
//
//a[0]=2;
//a[1]=3;
//System.out.println(a[0]);
//
//for(int i=0;i<=2;i++) {
//	System.out.println(ch[i]);
//}


	


	}

}
