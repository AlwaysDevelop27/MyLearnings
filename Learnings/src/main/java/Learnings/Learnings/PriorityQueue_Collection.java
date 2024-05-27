package Learnings.Learnings;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Collection {

	public static void main(String[] args) {
		/*
		 * Queue:
		 * Interface Queue is available in java.util package and does contain collection interface
		 * It is used to keep elements in first in and first out (FIFO) manner.
		 * It is ordered list of objects where insertion of elements occurs at end of the list and removal of 
		   elements occurs at the beginning of the list.
		 * For Queue interface common classes are LinkedList and PriorityQueue in java and these are not thread safe.
		 * if we want to to implement thread safe, PriorityBlockingQueue class is available options.
		 * public interface Queue<E> extends Collection<E>
		 * Bounded Queue: Those Queues that are present in the util.concurrent package are known as bounded Queues.
		 * ArrayBlockingQueue: BlockingQueue<Integer> boundedQueue = new ArrayBlockingQueue<>(10);
		 * LinkedBlockingQueue: BlockingQueue<Integer> boundedLinkedQueue = new LinkedBlockingQueue<>(10); // Bounded
								BlockingQueue<Integer> unboundedLinkedQueue = new LinkedBlockingQueue<>(); // Unbounded
 		 * UnBounded Queue: Those Queues that are present in the util package are known as Unbounded Queues.
 		 * LinkedList: Queue<Integer> queue = new LinkedList<>();
 		 * PriorityQueue: Queue<Integer> priorityQueue = new PriorityQueue<>();
 		 * ConcurrentLinkedQueue: Queue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();
 		 * 
 		 * All Queues barring the Deques facilitates removal and insertion at the head and tail of the queue; respectively.
 		   In fact, deques support element insertion and removal at both ends.

		    
		 * PriorityQueue:
		 * PriorityQueue class is defined in collection framework that gives us way for processing the objects on the basis of priority.
		 * It already describes that the insertion and deletion of objects follow FIFO pattern in java queue.
		 * * Sometimes elements of the queue are needed to be processed according to the priority, that where a PriorityQueue comes into action.
		 * public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable 
		 * */
		
		Queue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Amit");
		priorityQueue.add("Balu");
		priorityQueue.add("Chandu");
		priorityQueue.add("ankith");
		priorityQueue.add("banu");
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.offer("Nishal"));
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.element());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
		
		
		
	}

}
