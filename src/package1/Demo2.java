package package1;
import java.util.Scanner;

public class Demo2 {
	
	int a;
	int b;
	
	Demo2(int x,int y)
	{
		a=x;
		b=y;
		int c=a+b;
		System.out.println("Parameterized Constructor is called---"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1");
		int l=sc.nextInt();
		System.out.println("Enter no2");
		int m=sc.nextInt();
		
		Demo2 obj=new Demo2(l,m);
		
		obj.print();
		sc.close();
	}
	
	public void print() {
		System.out.println("------------");
	}
}
