package stack_que_linkedlist;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingMaximum {
	//using  a double ended queue. 
	
	public static void doStuff(int ar[],int k){
		Deque dqwindow= new LinkedList();
		int count=0;
		int i;
		for(i=1;i<=k;i++){
		
		
			while(!(dqwindow.isEmpty()) && ar[(int)dqwindow.getFirst()]<=ar[i]){
				//pop elements from rear of the dqwindow
				dqwindow.removeFirst();
			}
			//push the element
			dqwindow.addFirst(i);
		}
		//first window is ok.
		for(i=k+1;i<ar.length;i++){
			//display first window maximum
	
			if (count==0)
				System.out.print(ar[(int) dqwindow.getLast()]);
			else
				System.out.print(" " + ar[(int)dqwindow.getLast()]);
			
			if (!(dqwindow.isEmpty()) && (int)dqwindow.getLast()<=i-k){
				dqwindow.removeLast();
			}
			while(!(dqwindow.isEmpty()) && ar[(int)dqwindow.getFirst()]<=ar[i]){
				//pop elements from rear of the dqwindow
				dqwindow.removeFirst();
			}
			dqwindow.addFirst(i);

			
			count++;

			
			count++;
			}
		
		System.out.println(" "+ ar[(int)dqwindow.getLast()]);
		
				
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for(int c=0;c<t;c++){
			int n = in.nextInt();//number of numbers
			int[] ar = new int[n];
			for(int i=0;i<n;i++){
				ar[i]=in.nextInt();
			}
			int k= ar[0];
			
			doStuff(ar,k);
		}


	}

}
