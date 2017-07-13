package stack_que_linkedlist;
import java.util.*;

public class CoinProblem{
	
	public static boolean calculateSum(int[] ar, int k, int index, int n){
		
		if (index==n){
			return false;
		}
		if (k<0){
			return false;
		}
		if ( k==0){
			return true;
		}
		int a=k-ar[index];
		if (calculateSum(ar,a,index+1,n)==true) {
			return true;
		}
				
		if (calculateSum(ar,k,index+1,n)==true) {
			return true;
		}
		return false;
	
	

	
	}
	
		
	public static void doStuff(int[] ar, int k){
		//your code here
		if (calculateSum(ar,k,0,ar.length)== true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}

	//boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = in.nextInt(); 
		for(int c=0; c<cases; c++){
			int n = in.nextInt() - 1;
			int[] ar = new int[n];
			int num = in.nextInt();
			for(int i=0; i<n; i++){
				ar[i]=in.nextInt();
			}
			doStuff(ar, num);
			System.out.println("");
		}
	}
}