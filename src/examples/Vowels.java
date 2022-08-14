package examples;



public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shrutika is beautiful";
		
		int cnt=0;
		
		int no=str.length();
		
		for(int i=0;i<no;i++) {
			char a=str.charAt(i);
			
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				cnt=cnt+1;
				System.out.println(a);
			}
			
		}
		System.out.println("Total no of vowels in string->"+str+" is->"+cnt);
	}

	
}
