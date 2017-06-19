import java.util.Scanner;

public class Hanoi2disksAnySrcDest {

	static void doStuff(int a, int b){
		//your code here
		int first;
		if (((a%3) + 1 )!=b){
			System.out.print(a + "->" + ((a%3) + 1) );
			System.out.print(" " + a + "->" +  b );
			System.out.print(" " + ((a%3) + 1) + "->" +  b );
		}
			
		else{
			System.out.print(a + "->" + ((((a%3) + 1))%3 + 1) );
			System.out.print(" " + a + "->" +  b );
			System.out.print(" " + ((((a%3) + 1))%3 + 1) + "->" +  b );
		}
		
	}


	//boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int a = in.nextInt();
			int b= in.nextInt();
			doStuff(a, b);
			System.out.println();
		}
	}
}