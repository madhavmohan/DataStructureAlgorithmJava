package stack_que_linkedlist;


class ListNode {
      int val;
      ListNode next;   
      ListNode(int x) { val = x; }
 }


public class ReverseLinkedList {
    
public static ListNode reverseListHelper(ListNode prevprev, ListNode prev, ListNode current){
        
        if (current==null){
            return prev;
        }else{
            //reverse previous and current 
        	prevprev=prev;
            prev=current;
            current=current.next;
            ListNode head=reverseListHelper(prevprev,prev,current);
            if (current==null){
                return head;
            }
            if (prevprev==null){
            	prev.next=null;
            }
            current.next=prev;
            return head;
        }

        
    }
    public static ListNode reverseList(ListNode head) {
        
        return (reverseListHelper(null,null,head));
    }
    public static void main(String[] args){
    	ListNode head=new ListNode(5);
    	head.next=new ListNode(20);
    	head.next.next=new ListNode(50);
    	head.next.next.next=new ListNode(90);
    	head.next.next.next.next=null;
    	ListNode head1=reverseList(head);
    	while(head1!=null){
    		System.out.println(head1.val);
    		head1=head1.next;
    	}
    	
    }
}