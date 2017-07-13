package trees;

public class MinDepth {
	
	
    public static int minDepth(TreeNode root) {
        int ldepth, rdepth;
        if (root==null){
            return 1;
        }else{
        if ((root.right==null) && (root.left==null)){
            return 1;
        }else if((root.right!=null) && (root.left!=null)){
            
            ldepth=minDepth(root.left);
            rdepth=minDepth(root.right);
            return Math.min(ldepth,rdepth)+1;
            
        }else  if ((root.right==null) && (root.left!=null)){
            ldepth=minDepth(root.left);
            return ldepth+1;
        }else if((root.right!=null) && (root.left==null)){
            rdepth=minDepth(root.right);
            return rdepth+1;
        }
        
       
        }
        return 1;
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(6);
        root.left=new TreeNode(5);
        root.left.left=new TreeNode(10);
        //root.right=new TreeNode(15);
        //root.right.right=new TreeNode(25);
        //root.right.right.right=new TreeNode(31);
        //root.left.left.left=new TreeNode(40);
        //root.right.left=new  TreeNode(29);
        System.out.println(minDepth(root));
    }

}
