package graph;

public class GraphNode {
	int id;
	int children[];
	GraphNode(int theid, int[] childids){
		int i;
		id=theid;
		for(i=0;i<children.length;i++){
			children[i]=childids[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
