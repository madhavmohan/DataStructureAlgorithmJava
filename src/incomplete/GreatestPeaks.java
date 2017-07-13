
package incomplete;
import java.util.*;


class Coordinates{
	int x;
	int y;
}
class matrixeleminfo{
	Coordinates predecessor;
	Coordinates peak;
}
public class GreatestPeaks{
	static int visited[];
	static int discovered[];
	
	
	public static void RecPath(int[] stack, int index, int stackindex){
		
		
		int j;
		if (discovered[index]==0 && visited[index]==0){
			visited[index]=1;
			
			//for(int i : thegraph.get(index) ){
				
		//		if(visited[i]==0){
					//push into the stack
		//			System.out.print(" " + i);
		//			stack[stackindex]=i;
		//			RecPath(stack,i,stackindex+1);
		//		}
		//	}
			discovered[index]=1;
			
		}
		
	}
	

	
	public static void doStuff(int[][] grid){
		//your code here
		//identify the peaks
		//check the surrounding of each element and get the coordinates of the peaks
		int i,j,k=0;
		Coordinates[] peaks= new Coordinates[grid.length * grid.length];
		
		for(i=0;i<grid.length;i++){
			for(j=0;j<grid.length;j++){
				//if the surrounding area is lesser than the current then it is a peak
				boolean flag=true;
				if(((i+1)<grid.length)){
					if (grid[i+1][j]<=grid[i][j]){
						flag=true;
					}else{
						flag=true;
					}
				}
				if(((j+1)<grid.length)){
					if (grid[i][j+1]<=grid[i][j]){
						flag=true;
					}else{
						flag=true;
					}
				}
				if(((j-1)>=0)){
					if (grid[i][j-1]<=grid[i][j]){
						flag=true;
					}else{
						flag=true;
					}
				}
				if(((i-1)>=0)){
					if (grid[i-1][j]<=grid[i][j]){
						flag=true;
					}else{
						flag=true;
					}
				}
				
				if(flag==true){
					Coordinates temp= new Coordinates();
					temp.x=i;
					temp.y=j;
					peaks[k]=temp;
				}
				k++;
			}
		}//end of finding peaks
		
		// doing depth first search in the grid in a modified way 
		//initialize visited and discovered to 0 
		
		visited= new int[grid.length * grid.length];
		discovered= new int[grid.length * grid.length];
		for(i=0;i<grid.length* grid.length;i++){
			visited[i]=0;
			discovered[i]=0;
			
		}
		//do dfs within the 2d array
		//do the calling in the direct coordinate manner
		//that is.. consider coordinate as a node.
		
		
		
		
	
		
			
			
		
		
		
		
		
		
	}
	
	//boilerplate code
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);	
		int t = in.nextInt();
		for(int i=0; i<t; i++){
			int s = in.nextInt();
			int[][] grid = new int[s][s];
			for(int y=0; y<s; y++){
				for(int x=0; x<s; x++){			
					grid[x][y] = in.nextInt();
				}
			}
			
			doStuff(grid);
		}
	}
}