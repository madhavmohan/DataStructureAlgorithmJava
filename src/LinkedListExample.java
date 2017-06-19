
import java.util.Scanner;




class LinkedList{
	Node head;
	Node tail;
	/* Add node to the end of the list with given num as data 
	 * make sure it correctly sets the head ( and tail) when adding	
	 * the first item to the list
	 */
	public void add(int num){
		if (head==null){
			//first item of the list. Set head to this item. 
			head=new Node(num,null);
			tail=head;
			
		}else{
			tail.next=new Node(num,null);
			tail=tail.next;
		}
		
	}
	public int get(int num){
		Node temp=head;
		int count=0;
		if (head==null){
			return -1;
		}else{
			//find out length
			
			while(temp!=null){
				count++;
				temp=temp.next;
			}
			if (num>=count){
				return -1;	
			}else{
				count=0;
				temp=head;
				while(temp!=null){
					if (count==num){
						return temp.data;
					}else{
						temp=temp.next;
					}
					count++;
				}
			}
				
			
			
			
		}
		return 0;
	}
	private Node getNode(int index) {
		
		int count=0;
		Node temp=head;
		index--;
		while(temp!=null){
			if (count==index){
				return temp;
			}else{
				temp=temp.next;
			}
			count++;
		}
		return null;
		
		
	}
	
	public int remove(int b){
		//1. beginning of the list
		//	1.1 only 1 element
		//		1.1.1 remove the element and assign head and tail to null  DONE
		//	1.2 more than one element 
		//		1.1.2 remove that element and assign head to next element. DONE
		// 2. end of the list
		//	2.1 remove the element and assign tail to the previous element DONE
		// 3. not at end or beginning
		//	3.1 assign prev next to prev next next. DONE
		int sizeoflist;
		Node prev;
		int temp1;
		//beginning of the list
		sizeoflist=Size();
		prev=getNode(b);
		
		if (b==0){
			
			if (sizeoflist==0){
				return -1;
			}else if(sizeoflist==1){
				temp1=head.data;
				head=null;
				tail=null;
				return temp1;
				
			}else if (sizeoflist>1){
				temp1=head.data;
				head=head.next;
				return temp1;
			}
		}else if(b==sizeoflist-1){
			temp1=prev.next.data;
			prev.next=null;
			tail=prev;
			return temp1;
		}else {
			temp1=prev.next.data;
			prev.next=prev.next.next;
			return temp1;
		}
		return 0 ;
	}
	public int Size(){
		int count=0;
		Node temp=head;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public int add(int pos,int b){
		int lengthoflist=0;
		if (pos==0){
			//add at head and make the new node the head.
		
			Node newNode=new Node(b, null);
			head=newNode;
			
		}else{
			//get one node previous to the position to be inserted
			Node insertLoc=getNode(pos);
			if (insertLoc==null){
				return -1;
			}else{
				lengthoflist=Size();
				Node temp=insertLoc.next;
				insertLoc.next=new Node(b,temp);
				if (lengthoflist==b){
					tail=insertLoc.next;
				}
			}
			
		}
		
		return b;
		
	}
	public void pushtohead(int a){
		Node temp;
		if(head==null){
			head=new Node(a, null);
		}else{
			temp=head;
			head=new Node(a,null);
			head.next=temp;
			
		}
	}
	public int popfromhead(){
		int temp1;
		if (head==null){
			return -1;
		}else if(head.next==null){
			temp1=head.data;
			head=null;
			return temp1;
		}else{
			temp1=head.data;
			head=head.next;
			return temp1;
		}
		
	}
	
			
}


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		for(int i=0;i<n;i++){
			int a= in.nextInt();
			int b= in.nextInt();
			if (a==-6){
				System.out.println(list.get(b));
			}else if (a==-9){
				list.add(b);
			}else if (a>=0){
				list.add(a,b);
			}else if (a==-1){
				System.out.println(list.remove(b));
			}
		}
		
		
	}

}
