package stack_que_linkedlist;
import java.util.*;

class LinkedListHelper1{
	LinkedList stack2;
	LinkedListHelper1(){
		stack2= new LinkedList();
	}
	int pop(){
		int temp1;
		//check for underflow
		if (stack2.head==null){
			return -1;
		}else if (stack2.head.next==null){
			//pop tail element from the stack and set head to be null.
			temp1=stack2.head.data;
			stack2.head=null;
			stack2.tail=null;
			return temp1;
		}else{
			temp1=stack2.head.data;
			stack2.head=stack2.head.next;
			return temp1;
		}
		
		
	}
	void push(int a){
		//no need to check for overflow as memory is dynamic
		//add to tail of the linked list.
		Node newNode=new Node(a	, null);
		if (stack2.head==null){
			stack2.head=newNode;
			stack2.tail=newNode;
		}else{
			stack2.tail.next=newNode;
			stack2.tail=newNode;
		}
			
		
	}
}
public class LinkedListQueue{
	LinkedListHelper lh= new LinkedListHelper();
	
	public void push(int a ){
		lh.push(a);
	}
	public int pop(){
		return lh.pop();
	}

	//boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for(int c=0;c<t;c++){
			int n = in.nextInt();
			int[] ar = new int[n];
			for(int i=0;i<n;i++){
				ar[i]=in.nextInt();
			}
			
		}
	}
}
