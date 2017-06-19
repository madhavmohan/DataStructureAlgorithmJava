

class Node{
	int data;
	Node next;
	public Node (int d){
		data=d;
	}
	public Node (int d, Node n){
		data=d;
		next=n;
	}	
}
public class ListOutput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node a= new Node(1);
		Node b= new Node(2);
		Node c= new Node(3);
		a.next=b;
		b.next=c;
		c.next=null;
		System.out.println(a.next.next.data);

	}

}
