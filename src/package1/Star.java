package package1;
import java.util.*;

public class Star {

	void printStar(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Star obj=new Star();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int x=sc.nextInt();
		
		obj.printStar(x);
		sc.close();
		
		
	}
}
