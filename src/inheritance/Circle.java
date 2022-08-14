package inheritance;

public class Circle {

	 Circle(){
		System.out.println("Hello");
	}
	public void display()
	
	{System.out.println("Circle class method");
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1)System.out.print("C");
				if(i==2)System.out.print("I ");
				if(i==3)System.out.print("R ");
				if(i==4)System.out.print("C ");
				if(i==5)System.out.print("L ");
				if(i==6)System.out.print("E ");
			}System.out.println();
		}
	}
	
}
