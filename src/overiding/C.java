package overiding;

public class C {

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
