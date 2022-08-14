package collectionsPractice;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		
		v.add("Shrutika");
		v.add("Ajinkya");
		v.add("Paygude");
		
		System.out.println(v);
		System.out.println(v.size());
		v.add(2, "Ajju");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(	v.firstElement());
		System.out.println(	v.lastElement());
		System.out.println(	v.elementAt(3));
		System.out.println(	v.contains("Ajju"));
		System.out.println(v.remove(2));
		System.out.println(v);
//		v.clear();
//		
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(	v.firstElement());
		
//		for(String s:v) {
//			System.out.println(s);
//		}System.out.println();
//		for(int i=0;i<v.size();i++) {
//			System.out.println(v.get(i));
//		}
		
//		Iterator<String> it=v.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println("List---"+it.next());
//		}
	ListIterator<String> li=v.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println();
	while(li.hasPrevious()) {
		
		System.out.println("List---"+li.previous());
	}	
		
		
	}

}
