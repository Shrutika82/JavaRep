package package1;

public class Pract {

	public static  void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of two nos -> "+c);
		
	}
	
	public void mult() {
		int a=2;
		int b=3;
		int c= a*b;
		System.out.println("Multiplication of two nos -> "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// STATIC METHOD
		add();	//static method within the class
		Pract1.sub(); //static method of same package but another class
	
		// NON STATIC METHOD
		Pract obj= new Pract();
		obj.mult();//non static method within class
		
		Pract1 obj1= new Pract1();
		obj1.div();// non static method of same package but another class
	
	
	}
	

}
