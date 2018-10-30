package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		hashSet will not maintain any insertion order
//		Set<String> names = new HashSet<>();//[dharani, latha, lakshmi, vidya, teja]
//		LinkedHashSet will maintain insertion order
//		Set<String> names = new LinkedHashSet<>();
//		TreeSet will maintain ascending order for numeric data and alphabetical order for character data
		Set<String> names = new TreeSet<>();//[dharani, lakshmi, latha, teja, vidya]
//		get the size of set
		System.out.println("before adding any data "+names.size());
		
		//adding data to the set
		names.add("vidya");
		names.add("dharani");
		names.add("latha");
		names.add("teja");
		names.add("dharani");
		names.add("lakshmi");
		
		System.out.println("after adding data "+names.size());
		
		// print the set values 
		System.out.println(names);
		
		//retrieve data using for loop
		for(String name : names) {
			System.out.println(name);
		}
		
		//retrieve data using iterator interface
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove the data from set
		names.remove("teja");
		System.out.println(names);
		
		//search for the data
		System.out.println(names.contains("teja"));
		
		//delete all the data from the set
		names.clear();
		
		//verify a set is empty or not
		System.out.println(names.isEmpty());
		
	}
}
