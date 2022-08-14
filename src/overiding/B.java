package overiding;

public class B extends A {
	
	public void run()
	{
		System.out.println("I am class B");
	}
	
	static void display() {
		System.out.println("I am static method A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj;
obj=new A();
obj.run();
A.display();
obj=new B();
obj.run();
A.display();
	}
}
