package examples;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
//		System.out.println("Number:-");
//		int num1=sc.nextInt();
	//System.out.println(num1);
		sc.close();
		
		int num;
		
		for(int i=1;i<=100;i++) {
			int count=0;
			
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
				if(count==2) {
					System.out.print(i+",");
				}
			
			
		}
		
	
}
}
