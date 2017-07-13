
package trees;

import java.util.*;


//Algorithm
//1. find the least path from a node  to leaf  in the inorder traveral
//2. find the maximum path / height from node to leaf  in the inorder traveral
//3. take the difference and see if it is equal to 1.
class TreeNodeWithLevel{
	TreeNode treenode;
	int level;
	TreeNodeWithLevel(TreeNode thenode,int thelevel){
		treenode=thenode;
		level=thelevel;
	}
}
class CheckIsitBalanced{
		int sizeoftree;
		CheckIsitBalanced(int size){
			sizeoftree=size;
		}
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
		int shortdistBFS(TreeNode root){
		
			TreeNodeWithLevel[] queue= new TreeNodeWithLevel[sizeoftree];
			int front,rear;
			front=rear=-1;
			//add the root into the queue.
			
			queue[++rear]=new TreeNodeWithLevel(root, 0);
			
			while(front!=rear){
				TreeNodeWithLevel node=queue[++front];
				
				//add left and right children to the queue
				if ((node.treenode)!=null){
					if (((node.treenode.left)==null) && (node.treenode.right)==null){
						return node.level;
					}
					queue[++rear]=new TreeNodeWithLevel(node.treenode.left, node.level+1);
					queue[++rear]=new TreeNodeWithLevel(node.treenode.right, node.level+1);
					
				}
				
				
			}
			return 0;
			
			
			
			
			
			
		}
		boolean doinorderandreturnifbalanced(TreeNode root){
			
			int maxdist,mindist;
			
			if (root==null){
				return true;
			}else{
				//maximum distance from node to the leaf
				boolean lsubtree= doinorderandreturnifbalanced(root.left);
				boolean rsubtree= doinorderandreturnifbalanced(root.right);
					
				maxdist=calculateHeightofTree(root)-1;
				// find out minimum distance from node to the leaf
				if(((root.right)==null) ||((root.left)==null) ){
					mindist=0;
				}else{
					mindist=shortdistBFS(root);
				}
				if (((maxdist-mindist) <= 1) && (lsubtree==true) && (rsubtree==true)){
					return true;
				}else{
					return false;
				}
				
				
			}
			
			
		}
		
}
public class IsItBalanced{
	static void doStuff(int[] ar){
		RecursiveTreeFormation rf= new RecursiveTreeFormation();
		TreeNode root= rf.arrayToTree(ar, 0);
		CheckIsitBalanced cb = new CheckIsitBalanced(ar.length);
		boolean var = cb.doinorderandreturnifbalanced(root);
		if (var==true){
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
