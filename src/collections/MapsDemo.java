package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo {
	public static void main(String[] args) {
//		HashMap will maintain any order
//		Map<String, Integer> books = new HashMap<>();
		
//		LinkedHashMap will maintain insertion order
//		Map<String, Integer> books = new LinkedHashMap<>();
		
//		TreeMap will maintain ascending order for numeric data and alphabetical for character data
		Map<String, Integer> books = new TreeMap<>();
		
		
		
//		size of the map
		System.out.println("no of books in the map : "+books.size());
		
		//adding data to the map
		books.put("Wings of fire", 10);
		books.put("Applied Physics", 12);
		books.put("Electrical Machines", 20);
		books.put("Core Java", 50);
		
		System.out.println("no of books in the map : "+books.size());
		
		//retrieve the data from a map
		System.out.println(books.get("Core Java"));
		
		//print the map data
		System.out.println(books);
		
		//retrieve the keys of map
		Set<String> keys = books.keySet();
		
		for(String key : keys) {
			System.out.println(key+" = "+books.get(key));
		}
		
		//retrieve the values
		Collection<Integer> values = books.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		
		//retrieve key and value pair
		Set<Entry<String, Integer>> entrySet = books.entrySet();
		for(Entry<String, Integer> eachSet : entrySet) {
			System.out.println(eachSet.getKey() + " = "+eachSet.getValue());
		}
		
		//removing data from the map
		books.remove("Wings of fire");
		
		System.out.println(books);
		
		books.remove("Core Java", 50);
		System.out.println(books);
		
		//remove all the contents of map
		books.clear();
		System.out.println(books);
		
		//to verify a map is empty or not
		System.out.println(books.isEmpty());
	}

}
