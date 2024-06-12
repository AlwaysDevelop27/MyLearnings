package Learnings.Learnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_collection {

	public static void main(String[] args) {
		/*
		 * Collection Class:
		 * Java collection class is execulsively used for static methods that operate on or return collection
		 * It inherits object class
		 * Collection class supports the polymorphsim algorthims that operate on collection
		 * Java collection class throws nullpointerexception if collection or class objects provided to them are null */
		
		List<String> list = new ArrayList<String>();
		list.add("Nishal");
		list.add("Dolly");
		list.add("Dimple");
		list.add("Suri");
		
		System.out.println(list);
		Collections.addAll(list,"JSP");
		System.out.println(list);

	}

}
