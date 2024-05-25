package Learnings.Learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Collections {
	
	
	public static void main(String[] args) {
		/*
		 * ArrayList: 
		 * ArrayList is class available in java.util package
		 * This is used to store elements dynamically
		 * ArrayList stores elements in insertion order
		 * This stores duplicate elements too
		 * This is non synchronized
		 * ArrayList allows random access because array works on index basis
		 * In ArrayList manipulation is bit slower than LinkedList in java because a lot of shifting 
		 * needs to occur if any elements is removed from ArrayList
		 * */

		ArrayList<String> al = new ArrayList<String>();
		al.add("Nishal");
		al.add("James");
		al.add("Hello");
		
		System.out.println("Converting ArrayList to Array" ); 
		String[] item = al.toArray(new String[al.size()]);
		for(int i=0;i<item.length;i++) {
			System.out.println(item[i]);
		}
		
		System.out.println("Converting Array to ArrayList" );
		Integer[] num = {1,2,4,6};
		List<String> lt = Arrays.asList(item);
		List<Integer> lt_I = Arrays.asList(num);
		System.out.println(lt);
		System.out.println(lt_I);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("*****************Synchronized arraylist************************");
		
		//al = (ArrayList<String>) Collections.synchronizedList(al);
		
		synchronized (al) {
			Iterator<String> it = al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		System.out.println("*****************************************");
		
		List<String> list = Arrays.asList("Lion","Tiger","King");
		//list.add("Gates");
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/* Traversing-iterating elements of collections in java
		 * by iterator
		 * by for each loop
		 * by listIterator interface
		 * by for loop
		 * by forEach()
		 * by forEachRemaining()*/
		
		Iterator<String> itr1= al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("*****************************************");
		for(String str:al) {
			System.out.println(str);
		}
		
		System.out.println("*****************ll************************");
		
		ListIterator<String> ll = list.listIterator(list.size());
		while(ll.hasPrevious()) {
			String st = ll.previous();
			System.out.println(st);
		}
		
		System.out.println("*****************ll_a************************");
		ListIterator<String> ll_a = al.listIterator(al.size());
		while(ll_a.hasPrevious()) {
			System.out.println(ll_a.previous());
		}
		System.out.println("*****************ll1************************");
		while(ll.hasNext()) {
			String st1 = ll.next();
			System.out.println(st1);
		}
		
		System.out.println("*****************for loop************************");
		for(int i=0;i<=list.size()-1;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*****************forEach************************");
		al.forEach(a->{
		System.out.println(a);
		});

		System.out.println("*****************forEachRemaining************************");
		Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(a->
		{
			System.out.println(a);
		});
		
		System.out.println("*****************read-only ArrayList************************");
		List<String> unModified = Collections.unmodifiableList(al);
		System.out.println(unModified);
		//unModified.add("yellow"); //this line throw compile time error as java.lang.UnsupportedOperationException
		System.out.println(al); 
		
		/*	How to Sort ArrayList in Java

		  	Difference between Array and ArrayList

		  	When to use ArrayList and LinkedList in Java

		  	Difference between ArrayList and LinkedList

		  	Difference between ArrayList and Vector

			How to Compare Two ArrayList in Java

			How to reverse ArrayList in Java

			When to use ArrayList and LinkedList in Java

			How to make ArrayList Read Only

			Difference between length of array and size() of ArrayList in Java

			How to Synchronize ArrayList in Java

			How to convert ArrayList to Array and Array to ArrayList in java

			Array vs ArrayList in Java

			How to Sort Java ArrayList in Descending Order

			How to remove duplicates from ArrayList in Java*/
	
	}

}
