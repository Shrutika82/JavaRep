package overiding;

public class Demo1 extends Demo {

	public void display()
	{
		int a=3;
		System.out.println(a);
	//	System.out.println(super.a);
		
	}
	public static void main(String[] args) {
	
		Demo1 obj=new Demo1();
		obj.display();
	}

}
 