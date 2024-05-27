package Learnings.Learnings;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_collection {

	public static void main(String[] args) {
		/*HashTable
		 * Java HashTable class implements a hashtable, which maps keys to value.It inherits Dictonary class and implements Map interface
		 * HashTable is array of list. Each list is known as bucket. The position of the bucket is identified by calling the hashode()
		 * A HashTable contains values based on key
		 * HashTable class contains unique elements
		 * HashTable doenot contain null key and value
		 * HashTable is synchronized
		 * The initail capacity of HashTable is 11 with a load factor of 0.75
		 * Hashtable is synchronized. It is thread-safe and can be shared with many threads.
		 * Hashtable is a legacy class.
		 * Hashtable is traversed by Enumerator and Iterator.
		 * Enumerator in Hashtable is not fail-fast.Hashtable is slow.
		 * public class HashTable<K,V> extends Dictonary<K,V> implements Map<K,V>, Cloneable, Serializable
		 * */
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(1,"Nishal");
		ht.put(2,"yellow");
		ht.put(3,"Richa");
		ht.put(4, "Riya");
		
		for(Map.Entry<Integer,String> m:ht.entrySet()) {
			System.out.println(m);
		}
		

	}

}
