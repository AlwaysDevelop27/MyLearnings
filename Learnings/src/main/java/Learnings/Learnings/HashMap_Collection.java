package Learnings.Learnings;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_Collection {

	public static void main(String[] args) {
		/*
		 * HashMap:
		 * HashMap Class implements Map interface which allows us to store key and value pair, where keys should be unique
		 * If you try to add duplicate key, it will replace the element of that corresponding key
		 * it is easy to perform key index like updation and deletion
		 * HashMap is like legacy HashTable class but not synchronized
		 * It allow us to store null elements as well, but there should be only one null key 
		 * Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. 
		 * It inherits the AbstractMap class and implements the Map interface.
		 * HashMap contains values based on key
		 * HashMap contains only unique key
		 * HashMap can have one null key and multiple null values
		 * HashMap doesnot maintain no order
		 * The initial default capacity i1 16 with a load factor of 0.75
		 * public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>,Cloneable,Serializable
		 * */
		
		/*
		 * How to iterate Map in Java
		 * How to Sort HashMap in Java
		 * Load Factor in HashMap
		 * Working of HashMap in Java | How HashMap Works
		 * Difference between HashMap and Hashtable
		 * How to Sort HashMap by Value
		 * Difference between HashSet and HashMap
		 * Difference between HashMap and TreeMap
		 * Java Map Interface*/
		
		//Let's see a simple example of HashMap to store key and value pair.
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1,"Hello");
		map.put(2, "World");
		map.put(3, "lion");
		map.put(4, "keys");
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
		}
		
		//No Duplicate Key on HashMap
		map.put(1, "Hi");
		System.out.println(map);
		
		//we see different ways to insert elements.
		map.putIfAbsent(5, "Danger");
		map.putIfAbsent(4, "Lock");
		
		System.out.println(map);
		
		//we see different ways to remove elements.
		map.remove(4);
		System.out.println(map);
		map.putIfAbsent(4, "Lock");
		
		//we see different ways to replace elements.
		map.replace(4, "Nandu");
		System.out.println(map);
		
		//How to Sort HashMap by Value
		List<Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer,String>>(map.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,String>>()
		{

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				System.out.println("val:"+o1.getValue().compareTo(o2.getValue()));
				return o1.getValue().compareTo(o2.getValue());
				
			}
			
		});
		

	}

}
