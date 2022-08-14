package package1;

public class Child extends Mother {

	public void son()
	{
		int i=1;
		while(i<=3)
		{
			
			for(int j=1;j<=i;j++)
			{
				//System.out.print("*");
				if(i==1)System.out.print("S");
				else if(i==2)System.out.print("O ");
				else if(i==3)System.out.print("N ");
				
				
			}
			System.out.println();
			i++;
		}
	}
	static void daughter()
	{
		System.out.println("Daughters are always beautiful");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Single level inheritance");
		System.out.println();
		System.out.println("Mother Super Class Child Sub Class");
		System.out.println();
Child obj=new Child();

System.out.println("Calling non-static method of mother class by child object");
obj.mother();//

System.out.println();

System.out.println("Calling static method of mother class by child class name");
	Child.b();
	System.out.println();
	
	System.out.println("Calling non-static method of Child Class by Child obj");
	obj.son();
System.out.println();
	
	System.out.println("Calling static method of Child Class by Child name");
	Child.daughter();
	}

}
