/**
 * 
 */
package com.collection.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class LinkedHashSetDemo {
	
	public LinkedHashSetDemo() {
		LinkedHashSet<String> set=new LinkedHashSet<>();  
		  set.add("Rose");  
		  set.add("Lilly");  
		  set.add("Sunflower");  
		  set.add("Lotus"); 
		  set.add("rose"); 
		//  set.add(null);
		  set.add("");	
		  
		  for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
				 System.out.println(iterator.next());
			  }
		  // Same as HashSet, but insertion order is retained
	}
}
