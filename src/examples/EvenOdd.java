package examples;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" ->Number is even");
		}
		else
		{
			System.out.println(n+" ->Number is odd");
		}
		
		
		
		sc.close();

	}

}
