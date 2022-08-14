package examples;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Number divisibilty by 3 till 100");
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+",");
			}
		}
			
			System.out.println("\n");
			System.out.println("Number divisibilty by 5 till 100");
			
			for(int j=1;j<=100;j++) {
				if(j%5==0) {
					System.out.print(j+",");
				}
			}
			
			System.out.println("\n");
			System.out.println("Number divisibilty by 3 and 5 till 100");
			
			for(int j=1;j<=100;j++) {
				if(j%5==0 && j%3==0) {
					System.out.print(j+",");
				}
			}
			
		
	}

}
