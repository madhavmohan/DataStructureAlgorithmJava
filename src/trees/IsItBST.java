package trees;
import java.util.*;

class BSTCheck{
	boolean checkifBST(TreeNode root, int min, int max){
		boolean currentnode,leftside,rightside;
		
		if(((root.data)<=max) && ((root.data)>=min) ){
			 currentnode=true;
		}else{
			currentnode=false;
		}
		
		if((root.left)!=null){
			leftside=checkifBST(root.left, min, root.data);
		}else{
			leftside=true;
		}
		if((root.right)!=null){
			
			rightside=checkifBST(root.right, root.data,max);
		}else{
			rightside=true;
		}
		if ((currentnode==true) && (leftside==true) && (rightside==true)){
			return true;
		}else{
			return false;
		}
		
	}
}
public class IsItBST{
	static void doStuff(int[] ar){
		RecursiveTreeFormation rf= new RecursiveTreeFormation();
		TreeNode root= rf.arrayToTree(ar, 0);
		BSTCheck bt= new BSTCheck();
		if ((bt.checkifBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))==true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
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
