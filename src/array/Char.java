package array;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String");
	
		char a[]=sc.next().toCharArray();
		
		System.out.println("Characters in String are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
					
			sc.close();		
					
					
					
		
	}

}
