package abstrac;


public class C implements A, B
{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.diaplay();
		obj.run();
	}
	@Override
	public void diaplay() {
	System.out.println("Multiple inheritance ");
		
	}
	
public void run()
{
	B.run();
	A.run();
}

}
