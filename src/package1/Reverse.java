package package1;

public class Reverse {

	static void rev()
	{
		String str="Shrutika";
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
			
		}System.out.print("Reverse word-> "+rev);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev();

	}

}
