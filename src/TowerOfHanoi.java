import java.util.Scanner;

public class TowerOfHanoi {
	public static int returnIntermediate(int src, int dest){
		if (src==1 && dest==2){
			return 3;
		}else if (src==2 && dest==3){
			return 1;
		}else if (src==1 && dest==3){
			return 2;
		}else if (src==2 && dest==1){
			return 3;
			
		}else if(src==3 && dest==2){
			return 1;
		}else if(src==3 && dest==1){
			return 2;
		}else{
			return 0;
		}
		
	}

	public static void hanoitower(int src, int dest, int ndisks,int k, int count){
		int c=returnIntermediate(src,dest);
		if (ndisks==1){
			
			System.out.println(src + "->" + dest);
	
			
		}else if(ndisks==2){
			if (c!=dest){
				System.out.print(src + "->" + c );
				System.out.print(" " + src + "->" +  dest );
				System.out.print(" " + c + "->" +  dest  );
		
			}
				
			else{
				System.out.print(src + "->" + c );
				System.out.print(" " + src + "->" +  dest);
				System.out.print( c + "->" +  dest );
		
			}
		}else{
			
			hanoitower(src,c,ndisks-1,k,count++);
			hanoitower(src,dest,1,k,count++);
			hanoitower(c,dest,ndisks-1,k,count++);
		}
		
	}
	public static void doStuff(int a){
	    //your code here
		int k=((int) ((Math.pow(2, a))))-1;
		int count=1;
		hanoitower(1,3,a,k,count);
		
	}

	//boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int a = in.nextInt();
			doStuff(a);
		}
	}
}