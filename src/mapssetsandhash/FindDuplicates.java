package mapssetsandhash;
import java.util.*;

public class FindDuplicates{
	static void doStuff(int[] ar){
		//your code here
		HashSet set2= new HashSet<>();
		int k=0;
		for(int i=0;i<ar.length;i++){
			if (set2.add(ar[i])==false){
				if(k==0)
					System.out.print(ar[i]);
				else 
					System.out.print(" " + ar[i]);
				k++;
			}
		}
		System.out.println();
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
