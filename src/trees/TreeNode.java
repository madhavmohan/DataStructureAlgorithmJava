package trees;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int nodeData){
		data=nodeData;
		left=null;
		right=null;
	}
	public int getData(){
		return data;
	}
}
