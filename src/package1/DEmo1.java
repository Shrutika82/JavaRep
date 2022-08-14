package package1;

public class DEmo1 {
	
	String str;
	
	public DEmo1(String str1)
	{
		str=str1;
		System.out.println("Parametrized Constructor is called");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DEmo1 obj=new DEmo1("programming");
		System.out.println("String is ->"+obj.str);
		obj.print();
	}
	
	public void print()
	{
		System.out.println(str);
	}

}
