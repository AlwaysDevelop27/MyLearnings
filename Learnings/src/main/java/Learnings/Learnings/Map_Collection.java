package Learnings.Learnings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Collection {

	public static void main(String[] args) {
		/*
		 * Map:
		 * A Map conatins a value on basis of key i.e key and value. Each key and value is know as entry
		 * A Map contains Unique keys
		 * A Map is useful if you have to search, update and delete elements on the basis of key.
		 * There are two Interfaces: Map and SortedMap, three classes: HashMap, LinkedHashMap and TreeMap
		 * A Map doesnot allow duplicate keys, but can have duplicate values.
		 * HashMap and LinkedHashMap allows null keys and values
		 * TreeMap doesnot allow null Key or value.
		 * A Map cant be traversed. so we need to convert it into set using keySet() or entrySet() method
		 * 
		 * HashMap: is the implementation of Map, but it doesnot maintain any order.
		 * LinkedHashMap: is implementation of Map.It inherits HashMap class. It maintain insertion order.
		 * TreeMap: is implementation of Map and SortedMap Interface. It maintain ascending order. 
		 * 
		 * */

		Map<String, String> map = new HashMap<String, String>();
		map.put("Amit", "tripadi");
		map.put("Banu", "kunal");
		map.put("Cenu", "kashap");
		
		System.out.println(map);
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Entry<String, String>> setent = map.entrySet();
		Iterator<Entry<String, String>> itr1 = setent.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		for(Map.Entry<String,String> m:map.entrySet()) {
			System.out.println(m.getKey()+"="+m.getValue());
		}
		
		map.entrySet().
		stream().sorted(Map.Entry.comparingByKey()).
		forEach(System.out::println);
		
		map.entrySet().
		stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
		forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
	
	

}
