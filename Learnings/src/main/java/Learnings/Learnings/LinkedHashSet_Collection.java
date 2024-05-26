package Learnings.Learnings;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Collection {

	public static void main(String[] args) {
		/*
		 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface
		 * It inherits the HashSet class and implements Set Interface
		 * LinkedHashSet class contains unique elements only like HashSet class
		 * LinkedHashSet class provides all optional set operations and permits null elements
		 * LinkedHashSet is non synchronized
		 * LinkedHashSet class maintain insertion order
		 * Note:
		 * Keeping the insertion order in the LinkedHashset has some additional costs, 
		 * both in terms of extra memory and extra CPU cycles. 
		 * Therefore, if it is not required to maintain the insertion order, 
		 * go for the lighter-weight HashMap or the HashSet instead.
		 * The LinkedHashSet class extends the HashSet class, which implements the Set interface. 
		 * The Set interface inherits Collection and Iterable interfaces in hierarchical order.
		 * public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable,Serializable
		 * */

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Hello");
		lhs.add("jello");
		lhs.add("Stoll");
		lhs.add("Kood");
		lhs.add("Stoll");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
