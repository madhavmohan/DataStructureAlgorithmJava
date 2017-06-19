import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> orders1=new ArrayList<>();//creates an empty ArrayList of Strings in java 7
		HashSet hash= new HashSet<>();
		ArrayList<String> list=new ArrayList<>(hash);
		orders1.add("apple");
		orders1.add("banana");
		orders1.add("cantaloupe");
		orders1.add("date");
		//System.out.println(orders1);
		ArrayList<String> orders2=orders1;
		orders2.remove("cantaloupe");
		//System.out.println(orders2);
		ArrayList<String> changingOrders= new ArrayList<>();
		changingOrders.addAll(orders1);
		changingOrders.add("eggplant");
		orders1.set(2, "eggplant");
		orders1.remove("banana");
		//changingOrders.removeAll(orders1);
		//changingOrders.clear();
		//To convert ArrayList to array, create array of correct size and pass it as a parameter to toArray
		int size= orders1.size();
		String[] orderArray= new String[size] ;
		orders1.toArray(orderArray);
		System.out.println(orders1);
		System.out.println(changingOrders);
		
	}	

}
