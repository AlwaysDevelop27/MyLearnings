package Learnings.Learnings;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Collection {
	
	public static void main(String[] args){
		/*
		 * Deque Interface is part of java.util package
		 * Deque supports the addition and removal of elements from both ends in data structure. Therefore deque can be used as both stack and queue
		 * Stack supports LIFO and Queue supports FIFO
		 * As deque supports both, either of the mentioned operation can be performed.
		 * public class Deque<E> extends Queue<E>
		 * */
		
		/*
		 * ArrayDeque:
		 * We know that we can create object of interface so we need a class to implement the Deque interface
		 * It grows and shrinks as per usage
		 * It inherits the AbstactCollection class
		 * Null elements are not allowed 
		 * ArrayDeque is not threadsafe,in the absence of external synchronization
		 * ArrayDeque has no capacity restrictions
		 * ArrayDeque is faster than LinkedList and Stack
		 * public class ArrayDeque<E> extends Abstract Collection<E> implements Deque<E>, Cloneable,Serializable*/
		
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("Amit");
		arrayDeque.add("Amit");
		arrayDeque.add("Balu");
		arrayDeque.add("Chandu");
		arrayDeque.add("ankith");
		arrayDeque.add("banu");
		
		System.out.println(arrayDeque);
		System.out.println("Object remove(): "+arrayDeque.remove());
		System.out.println(arrayDeque);
		System.out.println("boolean offer(object): "+arrayDeque.offer("Nishal"));
		System.out.println(arrayDeque);
		System.out.println("Boolean offerFirst(e): "+arrayDeque.offerFirst("Salman"));
		System.out.println(arrayDeque);
		System.out.println("Object offerLast(e): "+arrayDeque.offerLast("nandy"));
		System.out.println(arrayDeque);
		System.out.println("Object poll(): "+arrayDeque.poll());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque);
		System.out.println("Object peek(): "+arrayDeque.peek());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.peekLast());
		System.out.println(arrayDeque);
	}

}
