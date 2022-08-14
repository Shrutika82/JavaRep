package collectionsPractice;
import java.util.*;

public class ArrayListDemo {
	ArrayList<String> ar;
	public void SetName() {
		ar=new ArrayList<String>();
		ar.add("Shrutika");
		ar.add("Ajinkya");
		ar.add("Rutuja");
		ar.add("Rushikesh");
		ar.add("Vaibhav");
		ar.add("Omkar");
		ar.add("Varun");
		
	}
	
	public	boolean traversePrint() {
		
		System.out.println("Iterator");
		Iterator<String> it=ar.iterator();
	System.out.println(ar.isEmpty());
		while(it.hasNext()) {
		
			System.out.println("List---"+it.next());
		}
		return true;
	}
	
	public void traversePrint1() {
		
		System.out.println("Iterator");
		ListIterator<String> li=ar.listIterator();
	
		while(li.hasNext()) {
		
			System.out.println("List---"+li.next());
		}
		System.out.println("Reverse back");
		while(li.hasPrevious()) {
			
			System.out.println("List---"+li.previous());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayListDemo obj=new  ArrayListDemo();
		 obj.SetName();
		 obj.traversePrint();
		obj.traversePrint1();
		
		
//		ArrayList<String> ar=new ArrayList<String>();
//		//ArrayList ar=new ArrayList();
//		ar.add("Shrutika");
//		ar.add("Ajinkya");
//		ar.add("Rutuja");
//		ar.add("Rushikesh");
//		ar.add("Vaibhav");
//		ar.add("Omkar");
//		ar.add("Varun");
//		ar.add("Tanish");
//		ar.add("Mrunal");
//		ar.add("Namrata");
//		ar.add("Mrunal");
//		ar.add("Namrata");
//		ar.add("99");
//		ar.add("999");
		
		
		
//	System.out.println(ar);//prints arraylist
//		int no=ar.size();// returns size of arraylist
//		System.out.println(no);
		
		
//	System.out.println(ar.get(10));//returns strings of that index
//	
//	System.out.println(ar.indexOf("Mrunal"));//returns index of 1st data in arraylist
//	
//	System.out.println(ar.contains("Sweet"));//true or false
	
//	ar.ensureCapacity(8);
//	for(String str:ar) {
//		System.out.println(str);
//	}
	
//	System.out.println(ar.remove(10));
//	System.out.println(ar);
//	ar.add(10, null);
//	System.out.println(ar);
	
//	
//	for(int i=0;i<=no-1;i++) {
//		System.out.println(ar.get(i));
//	}
//	
//		
//		for(Object a:ar) {
//			System.out.println(a);
//		}
//	ar.trimToSize();
//	System.out.println(ar);
		
		
		//Iterator
		
	
			
	
			
		
	
	}

}
