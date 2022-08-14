package inheritance;

public class Car implements Vehicle {
	public void speed()
	{
		System.out.println("172 km/h");
	}
	public void model()
	{
		System.out.println("Breeza");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike obj=new Bike();
obj.speed();
obj.model();
Car obj1=new Car();
obj1.speed();
obj1.model();
	}

}
