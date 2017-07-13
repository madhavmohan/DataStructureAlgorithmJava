package mapssetsandhash;
import java.util.*;

public class FindItemCount{
	static void doStuff(int[] ar){
		//your code here
		int i,k;
		int max=ar[0];
		k=0;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(i=0;i<ar.length;i++){
			if (hm.get(ar[i])==null){
				hm.put(ar[i], 1);
			}else{
				hm.put(ar[i], hm.get(ar[i])+1);
			}
		}
		//find max value and key in the hash map 
		for(i=0;i<ar.length;i++){
			if(hm.get(ar[i])>hm.get(max)){
				max=ar[i];
			}
		}
		
		
		//for(i=0;i<ar.length;i++){
		//	if (k==0)
		//		System.out.print(hm.get(ar[i]));
		//	else
		//		System.out.print(" " + hm.get(ar[i]));
		//			
		//	k++;
		//}
		System.out.println(max);
		
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
