package Learnings.Learnings;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Collection {

	public static void main(String[] args) {
		/* TreeSet class implemets Set Interface that uses tree for storage.
		 * It inherits AbstractSet class and implements the NavigableSet Interface.
		 * Objects of TreeSet are stored in ascending order.
		 * Java TreeSet class contains unique elements only like Hash Set.
		 * Java TreeSet class access and retrivals time are quiet fast.
		 * java TreeSet doesnot allow null elements.
		 *  TreeSet is non synchronized.
		 *  TreeSet maintains ascending order
		 *  public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>,Cloneable,Serializable
		 * SortedSet headSet(E toElement)	
		 	It returns the group of elements that are less than the specified element.
		 * NavigableSet headSet(E toElement, boolean inclusive)	
			It returns the group of elements that are less than or equal to(if, inclusive is true) 
			the specified element.
		 * NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)	
		 	It returns a set of elements that lie between the given range.
		 * SortedSet subSet(E fromElement, E toElement))	
		   It returns a set of elements that lie between the given range which includes fromElement and 
		   excludes toElement.
		 * SortedSet tailSet(E fromElement)	
		   It returns a set of elements that are greater than or equal to the specified element.
		 * NavigableSet tailSet(E fromElement, boolean inclusive)	
		   It returns a set of elements that are greater than or equal to (if, inclusive is true) the 
		   specified element.*/
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Hello");
		ts.add("lion");
		ts.add("apple");
		ts.add("Doogy");
		
		for(String str:ts) {
			System.out.println(str);
		}
		System.out.println("**************Reverse Order(Descending)******************");
		
		Iterator<String> itr = ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("************** retrieve and remove the highest and lowest Value******************");
		TreeSet<Integer> set=new TreeSet<Integer>();    
        set.add(24);    
        set.add(66);    
        set.add(12);    
        set.add(15);   
        
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set);
		System.out.println("**************Head,subset,tail******************");
		TreeSet<String> set1=new TreeSet<String>();  
        set1.add("A");  
        set1.add("B");  
        set1.add("C");  
        set1.add("D");  
        set1.add("E");  
        System.out.println("Initial Set: "+set1);  
          
        System.out.println("Reverse Set: "+set1.descendingSet());  
          
        System.out.println("Head Set: "+set1.headSet("C", true));  
         
        System.out.println("SubSet: "+set1.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+set1.tailSet("C", false));  
		System.out.println("**************Reverse Order(Descending)******************");
		System.out.println("**************Reverse Order(Descending)******************");
		System.out.println("**************Reverse Order(Descending)******************");

	}

}
