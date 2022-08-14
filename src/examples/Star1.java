package examples;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=3;i++)
		{
//			for(int m=3;m>i;m--)
//			{
//				System.out.print(" ");
//			}
			for(int j=1;j<=7;j++)
				{
				
				if(j<(i*2)+2) 
				{
					System.out.print("*");
				
				}
				
			}System.out.println();
		}
		for(int i=1;i<=7;i++)
		{
		
			for(int j=1;j<=7;j++)
				{
				
				if(j<i) 
				{
					System.out.print("*");
				
				}
				
			}System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
		
			for(int j=1;j<=7;j++)
				{
				
				if(j>i) 
				{
					System.out.print("*");
				
				}
				
			}System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=4;i++)
		{
		
			for(int j=1;j<=4;j++)
				{
				
				if(j<=i && j==1 || i==4 && j<=i) 
				{
					System.out.print("*");
				
				}
				
				
			}System.out.println();
		}
	}

}
