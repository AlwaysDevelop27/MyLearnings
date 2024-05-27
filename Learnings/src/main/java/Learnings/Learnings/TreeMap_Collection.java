package Learnings.Learnings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_Collection {

	public static void main(String[] args) {
		/*
		 * Java TreeMap is red-black tree based implementation. It provides an efficient means of storing key-value pair in sorted order. 
		 * Java TreeMap contains values based on key. It implements NavigableMap interface and extends AbstractMap class
		 * Java TreeMap contain unique Elements
		 * TreeMap cannot have null key and multiple null values
		 * TreeMap is non synchronized
		 * TreeMap maintains ascending order
		 * public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>,Cloneable,Serializable
		 *  */

		TreeMap<Integer, String> det = new TreeMap<Integer, String>();
		det.put(100,"pushpa");
		det.put(101,"arjun");
		det.put(109,"rashi"); //Exception in thread "main" java.lang.NullPointerException
		det.put(106,"lalli");  //Exception in thread "main" java.lang.NullPointerException
		det.put(105,"lalli");
		det.put(102, "Kishal");
		
		for(Map.Entry<Integer, String> m:det.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		System.out.println(det.ceilingKey(100));
		
		//Java TreeMap Example: NavigableMap
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
	      
	      //Java TreeMap Example: SortedMap
	      SortedMap<Integer,String> map1=new TreeMap<Integer,String>();    
	      map1.put(100,"Amit");    
	      map1.put(102,"Ravi");    
	      map1.put(101,"Vijay");    
	      map1.put(103,"Rahul");    
	      //Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("headMap: "+map1.headMap(102));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map1.tailMap(102));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map1.subMap(100, 102));    
	}

}
