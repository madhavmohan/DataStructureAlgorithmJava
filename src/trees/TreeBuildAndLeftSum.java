package trees;

import java.util.Scanner;

public class TreeBuildAndLeftSum {

	public static void doStuff(int[] ar){
		//your code here
		//create the nodes of the tree..
		//there are n nodes of the tree.
		// for each element in the array, create a node in the left and right.
		//for each element in the array create nodes and store the data into the node as children
		int i;
		
		TreeNode[] nodearr= new TreeNode[ar.length];
		for(i=0;i<ar.length;i++){
			nodearr[i]=new TreeNode(ar[i]);
		}
		
		for(i=0;i<ar.length;i++){
			if(((2*i+1)<ar.length) && ar[0]!=0){
				nodearr[i].left=nodearr[2*i+1];
			}else if(((2*i+1)<ar.length) && ar[0]==0){
				nodearr[i].left=null;
			}
			
			if(((2*i+2)<ar.length) && ar[0]!=0){
				nodearr[i].right=nodearr[2*i+2];
			}else if(((2*i+2)<ar.length) && ar[0]==0){
				nodearr[i].right=null;
			}
			
		}
		
		int sum=0;
		TreeNode tempnode=nodearr[0];
		while(tempnode!=null){
			
			sum+=tempnode.data;
			tempnode=tempnode.left;
			
		}
		System.out.println(sum);
	}
	
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
