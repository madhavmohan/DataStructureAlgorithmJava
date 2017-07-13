package trees;

import java.util.Scanner;

public class BinarySearchTreeInorder {

	public static TreeNode returnNodeAtWhichInserted(TreeNode root,int data1){
		if(root.left==null && root.data>=data1){
			return root ;
		}else if(root.right==null && root.data<data1){
			return root;
		}else if (root.right!=null && root.data<data1){
			return(returnNodeAtWhichInserted(root.right, data1));
		}else if(root.left!=null && root.data>=data1){
			return(returnNodeAtWhichInserted(root.left, data1));
		}else {
			return root;
		}
		
	}
	public static void insertIntoTree(TreeNode tempnode, int data1){
		//find the place for the insertion. 
		TreeNode node=returnNodeAtWhichInserted(tempnode,data1);
		if(node.data>=data1){
			node.left=new TreeNode(data1);
		}else if(node.data<data1){
			node.right=new TreeNode(data1);
		}else{
			return ;
		}
		
		
	}
	public static void printInorder(TreeNode tempnode,TreeNode root){
		if(tempnode==null){
			return;
		}else{
			if (tempnode==root)
				System.out.print(tempnode.data);
			else{
				System.out.print(" " + tempnode.data);
			}
			printInorder(tempnode.left,root);
			printInorder(tempnode.right,root);
		}
	}
	
	public static void doStuff(int[] ar){
		TreeNode root = null;
		for(int i=0;i<ar.length;i++){
			if (i==0){
				root=new TreeNode(ar[0]);
				
			}else{
				insertIntoTree(root,ar[i]);
			}
			
			
		}
		
		printInorder(root,root);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
