
package package1;
import java.util.Scanner;

class Number {
	void print() {
	System.out.println("hi");
	Scanner var=new Scanner(System.in);
	System.out.print("Enter no");
	int no=var.nextInt();
	if(no>4)
		System.out.println("No is greater than 4");
	else
		System.out.println("No is less than 4");

	var.close();
	}
}

public class Fclass {

	public static void main(String[] args) {
		
Number obj=new Number();
obj.print();
	}

}
