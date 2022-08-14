package package1;
import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char grade='A';
		//char gender='F';
		//int year=20;
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter Month");
		//String st=sc.nextLine();
		
		/* if(gender=='F')
		{
			System.out.println("The gender is "+gender);
		}
		if(grade=='A')
		{
			System.out.println("I scored above 90%");
		}
		else
		{
			System.out.println("I scored below 90%");
		} */
/*switch(year) {
case 1:System.out.println("Welcome to 1st year of Engg");
	break;
case 2:System.out.println("Welcome to 2nd year of Engg");
	break;
case 3:System.out.println("Welcome to 3rd year of Engg");
break;
	
case 4:System.out.println("Welcome to 4th year of Engg");
break;
	
default:System.out.println("Enter Valid Year");
break;
}
*/
/*switch(st) {
case "Monday":System.out.println("First day of week");
	break;
case "Tuesday":System.out.println("Second day of week");
	break;
case "Wednesday":System.out.println("Third day of week");
break;
	
case "Thursday":System.out.println("Forth day of week");
break;

case "Friday":System.out.println("Fifth day of week");
break;

case "Saturday":System.out.println("sixth day of week");
break;

case "Sunday":System.out.println("Seventh day of week");
break;
	
default:System.out.println("Enter Valid Day");
	break;
	
}*/
/*System.out.println("Enter Season");
String mn=sc.nextLine();

if(mn.equals("Summer")) {

	System.out.println("It is very hot");


	}else if(mn.equals("Rainy"))
	{
	System.out.println("It is very rainy");

	}else if(mn.equals("Winter"))
	{
	System.out.println("It is very cold");

	}else 
	{
		System.out.println("Enter Valid Season");
	}*/
		
		/*int sum=0;
		int i=1;
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of 1st 10 natural numbers is ->"+sum);
*//*
		int i=1;
		System.out.println("****Table of 2****");
		while(i<=10)
		{
			int x=2*i;
			System.out.println("2X"+i+"="+x);
			i++;
		}
		
		*/
		/*
		
		for(int i=1;i<=10;i++)
		{
			int x=2*i;
			System.out.println("2X"+i+"="+x);
		}
		
		*/
		int i=1;
		do {
			int x=2*i;
			System.out.println("2X"+i+"="+x);
			i++;
		}
		while(i<=10);
		
	sc.close();
	}

}
