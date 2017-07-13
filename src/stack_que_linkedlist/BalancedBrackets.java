package stack_que_linkedlist;
import java.util.Scanner;

public class BalancedBrackets {
	public static boolean isClosingBracket(int a, int b){
		if (a==(int)'(' && b==(int)')')
			return true;
		if (a==(int)'{' && b==(int)'}')
			return true;
		if (a==(int)'[' && b==(int)']')
			return true;
		return false;
	}
	public static void doStuff(String text){
	   //your code here
		int i;
		LinkedListForStack l1= new LinkedListForStack();
		//take the text consisting of the parenthesis one character at a time
		if (text==null ){
			System.out.println("true");
			
		}else if(text.length()==1){
				if( text.charAt(0)!='{' && text.charAt(0)!='}' && text.charAt(0)!='(' && text.charAt(0)!=')' &&
				text.charAt(0)!='[' && text.charAt(0)!=']')
					System.out.println("true");
				else
					System.out.println("false");
						
		}
		else{
		
			for(i=0;i<text.length();i++){
				if (l1.head==null){
					l1.push(((int)text.charAt(i)));
					continue;
				}
				if (isClosingBracket(l1.head.data,(int)text.charAt(i))){
					l1.pop();
					
				}else{
					if( text.charAt(i)!='{' && text.charAt(i)!='}' && text.charAt(i)!='(' && text.charAt(i)!=')' &&
							text.charAt(i)!='[' && text.charAt(i)!=']'){
						continue;
						
					}else{
						l1.push(((int)text.charAt(i)));
					}
							
							
				}
				
				
			}
			if (l1.isEmpty()){
				System.out.println("true");
				
			}else{
				System.out.println("false");
			}
	}
	}

    //boilerplate code
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for(int i=0; i<n; i++){		
			String text = in.nextLine();
			doStuff(text);
		}
	}
}