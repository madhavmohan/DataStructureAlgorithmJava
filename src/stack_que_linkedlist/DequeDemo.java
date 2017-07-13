package stack_que_linkedlist;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
public class DequeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dequeA= new LinkedList();
		Deque dequeB=new ArrayDeque();
		dequeA.add("element 1 ");
		dequeA.addFirst("element 2");
		dequeA.addLast("element 3");
		Object firstElement1 = dequeA.element();
		Object firstElement2= dequeA.getFirst();
		Object lastElement= dequeA.getLast();
		Deque dequeC=new LinkedList();
		dequeC.add("element 0");
		dequeC.add("element 1");
		dequeC.add("element 2");
		//access via the iterator
		Iterator iterator= dequeC.iterator();
		while(iterator.hasNext()){
			String element = (String) iterator.next();
		
		}
		//access via new for loop
		for(Object object:dequeC){
			String element = (String) object;
		}
		
		//Removing elements 
		//to remove the elments call the remove() , removeFirst(), removeLast()
		
		Object firstElementremoval1=dequeA.removeFirst();
		Object lastElementremoval= dequeA.removeLast();
		Object firstElementremoval2=dequeA.removeFirst();
		
		//Generic Deque
		
		
		
		
	}

}
