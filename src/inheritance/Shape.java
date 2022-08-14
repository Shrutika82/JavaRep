package inheritance;

public class Shape extends Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Shape obj=new Shape();
	System.out.println("---------Mulitlevel inheritance-------");
	System.out.println("      Color->Rectangle->Shape        ");
	
	
	obj.display();
	
	new Circle().display();
	
	//same method name 
	}

}
