package trees;
import java.util.*;
public class PostOrderTraversal{
	
	static void postOrderTraversal(TreeNode tempnode, TreeNode leftmostchild){
		if (tempnode==null){
			return ;
		}else{
			postOrderTraversal(tempnode.left,leftmostchild);
			postOrderTraversal(tempnode.right,leftmostchild);
			if (tempnode==leftmostchild){
				System.out.print(tempnode.data);
			}else{
				System.out.print(" " + tempnode.data);
			}
			
			
		}
		
	}
	static TreeNode returnLeftmostChild(TreeNode temproot){
		
		while(temproot.left!=null){
			temproot=temproot.left;
		}
		return temproot;
	}
	static void doStuff(int[] ar){
		//your code here
		RecursiveTreeFormation rf= new RecursiveTreeFormation();
		TreeNode leftmostchild;
		if (ar.length==0){
			System.out.println("-1");
			return;
		}
		TreeNode root= rf.arrayToTree(ar, 0);
		TreeNode temproot=root;
		leftmostchild=returnLeftmostChild(temproot);
		postOrderTraversal(root, leftmostchild);
		System.out.println();
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
