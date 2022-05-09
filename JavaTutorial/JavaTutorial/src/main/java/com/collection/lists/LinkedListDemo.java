/**
 * 
 */
package com.collection.lists;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class LinkedListDemo {

public LinkedListDemo() {
	LinkedList<String>ll=new LinkedList<>();

	ll.add("Surat");
	ll.add("Mumbai");
	ll.add("Delhi");
	ll.addLast("Nasik");

	ll.add("Pune");
	ll.add("Goa");
	ll.addFirst("Nasik");
	
	 System.out.println("----direct display"+ ll);

	for (String string : ll) {
		 System.out.println( string);
	}
	System.out.println("----peek"+ ll.peek());
	System.out.println("----peek"+ ll.peekFirst());

	System.out.println("----peek"+ ll.peekLast());
	System.out.println("----pop "+ ll.pop());
	System.out.println("----listIterator "+ ll.listIterator());

	for (Iterator<String> iterator = ll.listIterator(); iterator.hasNext();) {
		 System.out.println(iterator.next());
	  }

	ll.offer("Nagpur");
	 System.out.println("----direct display"+ ll);

}
}