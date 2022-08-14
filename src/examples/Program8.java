package examples;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		
		sc.close();
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=row-1;i++) {
			
			for(int j=1;j<=row-1;j++) {
				if(j>=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
