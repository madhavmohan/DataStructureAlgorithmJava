package trees;

import java.util.*;

public class TreeLeftSideSum{
	static void doStuff(int[] ar){
		//your code here
		int i,sum=0;
		int k=0;
		for(i=0;i<ar.length;i++){
			k=  (int)(Math.pow(2, i) - 1);
			if (k<ar.length)
				sum+=ar[k];
			
		}
		System.out.println(sum);
		
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
