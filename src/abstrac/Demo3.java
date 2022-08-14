package abstrac;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Divisibility of 3");
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+",");
				
			}}System.out.println();
		System.out.println();
		System.out.println("Divisibility of 5");
		 for(int j=1;j<=100;j++) {
				if(j%5==0){
					System.out.print(j+",");
				}
			}System.out.println();
		 System.out.println();
		 System.out.println("Divisibility of 3 and 5");
		 for(int j=1;j<=100;j++) {
				if(j%5==0 && j%3==0) {
					System.out.print(j+",");
				}
			}
		 
		

	}

}
