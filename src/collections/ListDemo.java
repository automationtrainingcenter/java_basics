package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.xml.sax.helpers.NamespaceSupport;

public class ListDemo {
	public static void main(String[] args) {
//		List<String> names = new ArrayList<>();
		List<String> names = new LinkedList<>();
		// size of list
		System.out.println("before adding any data size is : " + names.size());

		// adding data to the list
		names.add("vidya");
		names.add("teja");
		names.add("dharani");
		names.add("lakshmi");
		names.add("teja");

		System.out.println("after adding data size is: " + names.size());

		// retrieve data from the list
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
//		System.out.println(names.get(3));

//		print the data inside the list
		System.out.println(names);

//		retrieve data using for loop
//		for(String name : names) {
//			System.out.println(name);
//		}

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		names.add(2, "himaja");

		System.out.println(names);

		// delete data from a list
		names.remove(2);

		System.out.println(names);

		names.remove("lakshmi");
		System.out.println(names);

		// search for data inside the list
		System.out.println(names.contains("lakshmi"));

		// delete all the data from the list
		names.clear();

		// verify a list is empty or not
		System.out.println(names.isEmpty());
	}

}
