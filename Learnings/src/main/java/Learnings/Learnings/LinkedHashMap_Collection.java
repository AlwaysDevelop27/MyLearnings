package Learnings.Learnings;

import java.util.LinkedHashMap;

public class LinkedHashMap_Collection {

	public static void main(String[] args) {
		/*
		 * LinkedHashMap class is HashTable and linkedlist implementation of Map interface with predictable iteration order
		 * It inherits HashMap class and Map interface
		 * Java LinkedHashmap contains values based on key
		 * LinkedHashMap contains unique elements
		 * LinkedHashMap can have ony null key but multiple null values.
		 * LinkedHashMap is non syncronized
		 * LinkedHashMap maintain insertion order
		 * The Initail default capacity of java HashMap class is 16 with a load factor of 0.75
		 * public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  
		 * */
		
		LinkedHashMap<Integer, String> det = new LinkedHashMap<Integer, String>();
		det.put(100,"pushpa");
		det.put(101,"arjun");
		det.put(null,"rashi");
		det.put(null,"lalli");
		det.put(102, "Kishal");
		det.put(103,null);
		det.put(105, null);
		
		System.out.println(det);
		System.out.println(det.keySet());
		System.out.println(det.entrySet());
		System.out.println(det.values());
		System.out.println(det.remove(102));
		System.out.println();

	}

}
