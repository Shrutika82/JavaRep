package examples;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=5;i++) {
			for(int m=4;m>=i;m--) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				if(j<=i)
				System.out.print("* ");
			}System.out.println();
		}
		//System.out.println();
		System.out.println();
/*		
	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * *
*/
		
		for(int i=1;i<=5;i++) {
			for(int m=1;m<i;m++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				if(j>=i)
				System.out.print("* ");
			}System.out.println();
		}
	/*	
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
		    * 
*/
		
		
	
	}

}
