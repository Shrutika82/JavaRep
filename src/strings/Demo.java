package strings;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Shrutika";
		String str1="shrutika";
		
		System.out.println(str.length());//returns length of string returns integer
		
		System.out.println(str.charAt(3));//s->0,h->1,r->2,u->3 returns character
		
		System.out.println(str.equals(str1));//while comparing it checks case of string returns boolean
		
		System.out.println(str.toLowerCase());//it converts string to lower case returns string
		
		System.out.println(str.toUpperCase());//it converts string to upper case returns string
		
		System.out.println(str.equalsIgnoreCase(str1));//while comparing it doesnot check cases returns boolean
		
		System.out.println(str.contains("rut"));//it checks the sequence in the string if that sequence is true then it will return true ot it will return false
		
		System.out.println(str.isEmpty());//if string is empty it will return true ot it will return false
		
		System.out.println(str.endsWith("s"));//checks whether enter character ends string or not if yes retruns true case also matters
		
		System.out.println(str.startsWith("s"));//checks start of string character returns boolean case matters
		
		System.out.println(str.substring(4));
System.out.println(str.concat(" shelke"));	
		

	}

}
