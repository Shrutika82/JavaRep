package array;

import java.util.*;

public class Twoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of row");
		int n=sc.nextInt();
		
		System.out.println("Enter no of column");
		int m=sc.nextInt();
		
		//int a[][]=new int[n][m];
		String a[][]=new String[n][m];
		System.out.println("\n");
		
		System.out.println("Enter Values in matrix");
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<m;j++)
			{
				System.out.print("Enter value of "+"("+i+","+j+")");
				a[i][j]=sc.next();
			}
		}
		System.out.println("\n");
		System.out.println("**** M a t r i x****");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}System.out.println();
		}
		
		//System.out.println(a[0][1]);
		sc.close();
	}
	

}
