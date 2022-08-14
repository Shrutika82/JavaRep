package package1;

public class Swap {
	
	public void swap() {
		int a=3;
		int b=4;
		a=a+b; //7
		b=a-b; //3
		a=a-b; //4
		System.out.println("Value of a->"+a);
		System.out.println("Value of b->"+b);
	}
	
	public void swap1()
	{
		int a=2;
		int b=3;
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Swap obj=new Swap();
obj.swap();
obj.swap1();
	}

}
