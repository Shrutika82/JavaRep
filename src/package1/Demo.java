package package1;

public class Demo {
	String str;
	public Demo()
	{
		 str="programming";
		System.out.println("Default Constructor is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj=new Demo();
		System.out.println("String is->"+obj.str);
		
		obj.name();
		
	}
	
	public void name()
	{
		System.out.println(str);
	}

}
