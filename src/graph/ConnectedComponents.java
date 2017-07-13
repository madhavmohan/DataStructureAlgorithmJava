package graph;

import java.util.*;




class GraphInfo1{
	int[] path;
	int[] visited;
	int[] discovered;
	ArrayList<ArrayList<Integer>> thegraph;
	
	GraphInfo1(ArrayList<ArrayList<Integer>> graph){
		path= new int[graph.size()];
		visited=new int[graph.size()];
		discovered=new int[graph.size()];
		
		//initialize all with false or 0 since no node is visited or discovered at the start
		for(int i=0;i< (graph.size());i++){
			path[i]=0;
			visited[i]=0;
			discovered[i]=0;
			thegraph=graph;
			
		}
	}
	
	
	
	
	public void RecPath(int[] stack, int index, int stackindex,int parent){
		
		
		int j;
		if (discovered[index]==0 && visited[index]==0){
			visited[index]=1;
			
			for(int i : thegraph.get(index) ){
				
				if(visited[i]==0){
					//push into the stack
					stack[stackindex]=i;
					RecPath(stack,i,stackindex+1,index);
				}
			}
			discovered[index]=1;
			
		}
		
	}
	
	public boolean startPathSearch(){
		path[0]=0;
		int j,i;
		for(i=0;i<thegraph.size();i++){
			RecPath(path, i, 1,-1);
			for(j=0;j<thegraph.size();j++){
				if(visited[j]==0){
					return false;
				}
			}
			for(j=0;j<thegraph.size();j++){
				visited[j]=0;
			}
			for(j=0;j<thegraph.size();j++){
				discovered[j]=0;
			}
		}
		return true;
			
	}
	
	
}

public class ConnectedComponents {
	
	// takes in a graph as an ArrayList of ArrayLists

	public static void doStuff(ArrayList<ArrayList<Integer>> graph){
		//your code here
		GraphInfo1 gi= new GraphInfo1(graph);
		boolean var=gi.startPathSearch();
		if (var==false)
			System.out.println("false");
		else
			System.out.println("true");
		
		
	}
	
	//create your own method here	
	
	// boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine()); // all t cases
		for(int i=0;i<t;i++){ 
			int n = Integer.parseInt(in.nextLine());  // Specific case
			ArrayList<ArrayList<Integer>> nodes = new ArrayList<ArrayList<Integer>>(n); 
			for(int j=0; j<n; j++){ 
				ArrayList<Integer> node = new ArrayList<Integer>();
				String[] nums = in.nextLine().split(" "); 		
				for(String num:nums){
					node.add(Integer.parseInt(num));
				}
				nodes.add(node);
			}
			doStuff(nodes);
		}
	}
}