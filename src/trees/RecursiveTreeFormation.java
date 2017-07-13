package trees;

public class RecursiveTreeFormation {

	
	static TreeNode arrayToTree (int ar[], int i){
		
		if (i>=ar.length || ar[i]==0)
			return null;
		
		TreeNode node= new TreeNode(ar[i]);
		node.left=arrayToTree(ar,2*i+1);
		node.right= arrayToTree(ar, 2*i + 2);
		
		return node;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,0,3};
		
		System.out.println(arrayToTree(ar,0).data);

	}

}
