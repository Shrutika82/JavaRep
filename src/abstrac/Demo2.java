package abstrac;

public class Demo2 extends Demo {

	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum->"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo2 obj=new Demo2();
obj.add(3, 4);
	}

}
