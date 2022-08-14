package package1;

import java.util.Scanner;

public class Sclass {

	void EvenOdd(int no)
	{
		
		if(no%2==0)
		{
			System.out.println("Number is Even");
			
		}
		else
			System.out.println("Number is Odd");
	}

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		int y=sc.nextInt();
		
		Sclass obj=new Sclass();
				
				
			obj.EvenOdd(y);
		sc.close();
	}

}
