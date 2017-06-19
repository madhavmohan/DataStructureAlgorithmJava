import java.util.Scanner;

	class AlgorithmMinStack{
		LinkedList mainstack, specialstack;
		public AlgorithmMinStack() {
			// TODO Auto-generated constructor stub
			mainstack= new LinkedList();
			specialstack=new LinkedList();
		}
		public void push(int a){
			
			//push into main stack
			
			mainstack.pushtohead(a);
			//add into the special stack only if
			//	1. special stack top is greater than a
			//	2. special stack is empty
			//if special stack top is less than a
			//	1. add stack top to special stack
			if (specialstack.head==null && specialstack.tail==null){
				specialstack.pushtohead(a);
				
			}else if(specialstack.get(0)>a){
				specialstack.pushtohead(a);
			}else if (specialstack.get(0)<a){
				specialstack.pushtohead(specialstack.get(0));
			}
			
		}
		
		public int pop(){
			
			//pop from both the stacks
			
			mainstack.popfromhead();
			specialstack.popfromhead();
			
			return 0;
		}
		public int getMin(){
			return specialstack.get(0);
		}
	}
	public class MinStackProblem {
		
		public static void doStuff(int[] ar){
			int count=0;
			AlgorithmMinStack am= new AlgorithmMinStack();
			for(int i=0;i<ar.length;i++){
				if (ar[i]==-1){
					am.pop();
					
				}else{
					am.push(ar[i]);
					if (count==0)
					System.out.print(am.getMin());
					else
					System.out.print(" " + am.getMin());
					count++;
				}
			}
			System.out.println("");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
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
