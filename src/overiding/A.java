package overiding;

public class A {
	
	public void run()
	{//final int a=2;
	//a=a+2;
	//System.out.println(a);
		System.out.println("I am class A");
	}
	/*public static void main(String args[])
	{
		A obj=new A();
		obj.run();
	}*/

	
	static void display() {
		System.out.println("I am static method A");
	} 
}
