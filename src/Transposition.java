import java.util.Arrays;
import java.util.Scanner;


public class Transposition {
	public static void doStuff(String text){
	   //your code here
		int firstg=-1;
		String str;
		int i;
		if ((text.length()==1) || (text.length()==0)){
			System.out.println(text);
			return;
		}
		
		for(i=0;i<text.length();i++){
			if (((text.charAt(i))!='g') && ((text.charAt(i))!='n') && firstg==-1){
				
				continue;
				
			}
			else if(((text.charAt(i))=='g') && firstg==-1){
				
				firstg=i;
				
			}
			else if(((text.charAt(i))!='g') && ((text.charAt(i))!='n') && firstg!=-1){
				firstg=-1;
			}
			else if(((text.charAt(i))=='g') && firstg!=-1){
				continue;
			}
			else if (text.charAt(i)=='n'){
				
				//store n in first g index
				//and g in current index
				
				if(text.charAt(i-1)=='g'){
					char[] arr=text.toCharArray();
					arr[i]='g';
					arr[firstg]='n';
					if((i-firstg)>1){
						firstg=firstg+1;
					}else
						firstg=i;
					str= new String(arr);
					text=str;
					
				}
			}
			
			
		}
		
		System.out.println(text);
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