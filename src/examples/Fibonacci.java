package examples;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=1;
		int num2=1;
		//int num=0;
		
		System.out.print(num1+" "+num2);
		
		for(int i=2;i<=5;i++) {
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num2);
		}
	}

}
