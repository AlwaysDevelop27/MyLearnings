package Learnings.Learnings;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumSet_Collection {

	public static void main(String[] args) {
		/*
		 * EnumSet class
		 * Java EnumSet class is specialized set implementation for use with Enum Types. It inherits AbstractSet Class and implements set interface
		 * public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements cloneable,Serializable */
		
		Set<days> set = EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		
		Iterator<days> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
