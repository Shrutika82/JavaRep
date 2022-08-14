
package examples;

import java.util.Scanner;

public class Palimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter String");
//		String str=sc.nextLine();
////		StringBuffer sb=new StringBuffer(str);
////		
////		sb.reverse();
////		String rev=sb.toString();
////
////		System.out.println("Reverse String is ->"+rev);
////		
////		if(str.equals(rev)) {
////			System.out.println("The String is Palindrome");
////		}
////		else {
////			System.out.println("The String is not Palindrome");
////		}
////		
////		sc.close();
//		
//		String rev="";
//		int no=str.length();
//		for(int i=(no-1);i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
//		if(str.toLowerCase().equals(rev.toLowerCase())) {
//			System.out.println("The String is Palindrome");
//		}
//		else {
//			System.out.println("The String is not Palindrome");
//		}
//		
//		sc.close();
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		int x;
		int y=no;
		int temp=0;
		
		while(no>0) {
			x=no%10;
			temp=temp*10+x;
			no=no/10;
		}
		if(temp==y) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Plaindrome");
		}
		
		sc.close();
	
	
	
	
	
	
	}

	

}
