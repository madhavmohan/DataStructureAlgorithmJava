import java.util.Scanner;

public class BinSearchSqRoot {
	
	public static int SearchForSquareRoot(int ar[], int imin, int imax,int num){
		int imid=imin+(imax-imin)/2;
		if(imin>imax){
			return -1;
		}
		if(num==ar[imid]*ar[imid]){
			return ar[imid];
		}else if(num<ar[imid]*ar[imid]){
			return(SearchForSquareRoot(ar,imin,imid-1,num));
			
		}else{
			return(SearchForSquareRoot(ar,imid+1,imax,num));
		}
	}
			
	public static int doStuff(int a){
	    //your code here
		int c=a/2;
		int imin,imax;
		int ar[]= new int[c];
		
		if (a==0){
			return 0;
		}else{
			if (a<0){
				return -1;
			}
			if(a==1){
				return 1;
			}
		}
		
		for(int i=0;i<ar.length;i++){
			ar[i]=i+1;
		}
		imin=0;imax=c-1;
	    return SearchForSquareRoot(ar,imin,imax,a);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int a = in.nextInt();
			int result = doStuff(a);
			System.out.println(result);
		}
	}
}