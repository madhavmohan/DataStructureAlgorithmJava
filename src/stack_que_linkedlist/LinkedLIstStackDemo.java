package stack_que_linkedlist;

class LinkedListForStack{
	Node head;
	public void push(int data){
		Node newnode=new Node(data,null);
		if (head!=null){
			
			newnode.next=head;
			head=newnode;
		}else{
			head=newnode;
		}
	}
	public int pop(){
		
		if(head!=null){
			int val=head.data;
			head=head.next;
			return val ;
		}else{
			System.out.println("underflow");
			return -1;
		}
		
	}
	public boolean isEmpty(){
		if (head==null){
			return true;
		}else{
			return false;
		}
	}
	
}

public class LinkedLIstStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListForStack l1=new LinkedListForStack();
		l1.push(10);
		l1.push(20);
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		//l1.push(20);
		System.out.println(l1.pop());
	}

}
