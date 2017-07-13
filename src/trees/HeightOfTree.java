package trees;
import java.util.*;

class heightoftree{
	int calculateHeightofTree(TreeNode root){
		int lheight, rheight;
		if (root==null)
			return 0;
		else{
			lheight=calculateHeightofTree(root.left);
			rheight=calculateHeightofTree(root.right);
			if (lheight>rheight){
				return (lheight+1);
			}else if(rheight>lheight){
				return (rheight+1);
			}else{
				return (rheight+1);
			}
		}
		
	}
}
public class HeightOfTree{

	static void doStuff(int[] ar){
		//your code here
		int height;
		RecursiveTreeFormation rf= new RecursiveTreeFormation();
		TreeNode root= rf.arrayToTree(ar, 0);
		heightoftree ht= new heightoftree();
		height=ht.calculateHeightofTree(root);
		System.out.println(height);
		
		
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
