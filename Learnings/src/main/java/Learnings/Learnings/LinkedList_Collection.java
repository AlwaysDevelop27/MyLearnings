package Learnings.Learnings;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Collection {

	public static void main(String[] args) {
		/*LinkedList:
		 * LinkedList is a class available in list interface
		 * LinkedList class uses doubly linked list to store elements
		 * LinkedList can contain duplicate elements
		 * LinkedList class maintain insertion order
		 * LinkedList class is non synchronized
		 * LinkedList class manipulation is fast because no shifting need to occur.
		 * LinkedList class can be used as List, Stack and Queue
		 * 
		 * 
		 * public class LinkedList extends AbstractSequentialList<E> implements List<E>,Queue<E>, Cloneable, Serializable
		 *   
		 * */
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hello");
		ll.add("mister");
		ll.add("hru");
		
		Iterator<String> itr = ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
