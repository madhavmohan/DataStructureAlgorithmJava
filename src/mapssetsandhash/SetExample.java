package mapssetsandhash;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		HashSet set1 = new HashSet();
		set1.add(new Integer(6));
		set1.add(new Integer(1));
		System.out.println(set1);
		
		System.out.println("Iterating the hash set");
		Iterator<Integer> i = set1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
	}

}
