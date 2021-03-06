package stack_que_linkedlist;
import java.util.*;

class LinkedListHelper{
	LinkedList stack2;
	LinkedListHelper(){
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
			return temp1;
		}else{
			temp1=stack2.head.data;
			stack2.head=stack2.head.next;
			return temp1;
		}
		
		
	}
	void push(int a){
		//no need to check for overflow as memory is dynamic
		//add to tail or the top of the linked list.
		Node newNode=new Node(a	, null);
		if (stack2.head==null){
			stack2.head=newNode;
		}else{
			newNode.next=stack2.head;
			stack2.head=newNode;
		}
			
		
	}
}
public class Main{

	static void doStuff(int[] ar){
		//your code here
		int i;
		LinkedListHelper lh=new LinkedListHelper();
		int count=0;
		for(i=0;i<ar.length;i++){
			
			if (ar[i]==-1){
				
				if (count==0)
					System.out.print(lh.pop());
				else{
					System.out.print(" " + lh.pop());
				}
				count++;
			}else{
				lh.push(ar[i]);
			}
			
		}
		System.out.println("\n");
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
			doStuff(ar);
		}
	}
}
