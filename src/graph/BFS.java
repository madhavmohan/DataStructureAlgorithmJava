package graph;
import stack_que_linkedlist.*;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int value, Node thenext){
		data=value;
		thenext=next;
	}
}
class LinkedListQueueDemo{
	Node tail, head;
	LinkedListQueueDemo(){
		tail=head=null;

	}
	
	int pop(){
		
		//if no elements exist in the queue return -1
		int temp;
		if(head==null){
			return -1;
		}
		
		
		//if 1 element exist
		else if((head!=null) && (head.next==null)){
			temp=head.data;
			head=null;
			tail=null;
			return temp;
		}
		
		
		
		//if more than one element exist
		
		else if((head!=null) && (head.next!=null) ){
			temp=head.data;
			head=head.next;
			return temp;
		}
		
		return 0;
		
	}
	void push(int a){
		//insert at the tail
		
		//if there is no value in the queue enter the first value
	   if ((tail==null) && (head==null)){
			tail=head=new Node(a, null);
		}
		
		
		//if there is single value in the queue, enter it after that value and update the tail.
		else if( (tail!=null) && (tail.next)==null){
			Node newnode= new Node(a, null);
			tail.next= newnode;
			tail=newnode;
		}
		
		
		//if there is more than 1 value in the queue, enter it in the tail position.
		else if((tail!=null) && (tail.next!=null)){
			
			Node newnode= new Node(a, null);
			tail.next=newnode;
			tail=newnode;
			
		}
	}
	
}
public class BFS {
	
	// takes in a graph as an ArrayList of ArrayLists
	public static void doStuff(ArrayList<ArrayList<Integer>> graph){
		 LinkedListQueueDemo queue = new LinkedListQueueDemo();
		 int i;
		 int v;

		 //initialize the vertexes. 
		 
		 //1 - not visited
		 //0 - visited
		 //-1 - discovered
		 
		 int[] visited = new int[graph.size()];
		 for(i=1;i<(graph.size());i++){
			 visited[i]=1;
		 }
		 //source vertex is made as visited.
		 
		 visited[0]=0;
		 queue.push(0);
		 System.out.print("0");
		 while((queue.head)!=null){
			 v=queue.pop();
			 for(int u:graph.get(v)){
				 //add the children to the queue and display the children
				 if (visited[u]==1){
					 System.out.print(" " + u) ;
					 visited[u]=0;
					 queue.push(u);
				 }
			 }
			 visited[v]=-1;
			 
		 }
		 
		 
		System.out.println(); 
		
	}
	
	//create your own method here	
	
	// boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine()); // all t cases
		for(int i=0;i<t;i++){ 
			int n = Integer.parseInt(in.nextLine());  // Specific case
			ArrayList<ArrayList<Integer>> nodes = new ArrayList<ArrayList<Integer>>(n); 
			for(int j=0; j<n; j++){ 
				ArrayList<Integer> node = new ArrayList<Integer>();
				String[] nums = in.nextLine().split(" "); 		
				for(String num:nums){
					node.add(Integer.parseInt(num));
				}
				nodes.add(node);
			}
			doStuff(nodes);
		}
	}
}