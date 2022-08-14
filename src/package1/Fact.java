package package1;
import java.util.*;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter no ");
int x=sc.nextInt();
int fact=1;
for(int i=1;i<=x;i++)
{
	fact=fact*i;
}
System.out.println("Factorial of no "+x+"! is "+fact);

sc.close();
	}

}
