import java.util.*;

public class SubsetSumProblemDp{
	static boolean doStuff(int[] ar, int k){
		//your code here
		int i,j;
		//initialize a matrix of size [k+1][ar.size+1]
		int[][] dparr= new int[k+1][ar.length+1];
		for (i=0;i<k+1;i++){
			for(j=0;j<(( ar.length)+1);j++){
				dparr[i][j]=0;
			}
		}
		//first the sum of all the subsets should be true for the sum of zero
		for(i=0;i<=0;i++){
			for(j=0;j<((ar.length)+1);j++){
				dparr[i][j]=1;
			}
		}
		//for the rest of the dparr elements, if the value of the array 
		for(j=0;j<=0;j++){
			for(i=1;i<k+1;i++){
				dparr[i][j]=0;
			}
		}
		//for the rest of the elements starting from i=j=1 to i=k+1, j=ar.length + 1
		// if i>ar[j-1]
		//	assign dparr[i][j]= dparr[i-ar[j-1]][j-1]
		// else 
		//  assing dparr[i][j]=dparr[i][j-1]
		
		for(i=1;i<k+1;i++){
			for(j=1;j<((ar.length)+1);j++){
				if (i>=ar[j-1]){
					if (dparr[i][j-1]==0)
						dparr[i][j]=dparr[i-ar[j-1]][j-1];
					else
						dparr[i][j]=1;
				}else{
					dparr[i][j]=dparr[i][j-1];
				}
			}
		}
		if (dparr[k][ar.length]==1){
			return true;
		}else{
			return false;
		}
		
		
		
		
	}

	//boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean bool;
		int cases = in.nextInt();
		for(int c=0; c<cases; c++){
			int n = in.nextInt() - 1;
			int[] ar = new int[n];
			int num = in.nextInt();
			for(int i=0; i<n; i++){
				ar[i]=in.nextInt();
			}
			bool=doStuff(ar, num);
			if (bool==true)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}