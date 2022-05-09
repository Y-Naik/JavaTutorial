/**
 * 
 */
package com.collection.sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class HashSetDemo {

@SuppressWarnings("unlikely-arg-type")
public HashSetDemo() {
	HashSet<String> set=new HashSet<String>();  
	  set.add("Rose");  
	  set.add("Lilly");  
	  set.add("Sunflower");  
	  set.add("Lotus"); 
	  set.add("rose"); 
	//  set.add(null);
	  set.add("");

	  HashSet<String> s=new HashSet<String>();  
	  s.add("marigold");  
	  s.add("Lilly");
	  s.add("Rose");  
	  
	  HashSet<String> hs=new HashSet<String>();  
	  hs.add("Lotus");  
	
	  System.out.println("----For Iterator");
	  System.out.println("----iterator: "+ set.iterator());

	  for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
		 System.out.println(iterator.next());
	  }
	  System.out.println("----spliterator: "+ set.spliterator());
	  Spliterator<String> ss= set.spliterator();
	  //use for parallel utilization of subsets to perform different operation
	  
	 
	  
	  System.out.println("----Contains: "+ set.contains("rose"));
	  System.out.println("----containsAll: "+ set.containsAll(s));
	  
	  //System.out.println("----iterator: "+ set.iterator());
	 // System.out.println("----spliterator: "+ set.spliterator());
	  
	  HashSet<String> st= (HashSet<String>) set.clone(); 
	  
	  System.out.println("----clone: "+ st);
	  
	  for (Object string : st.toArray()) {
		  if (string != null) {
			  System.out.println("----clone array: "+ string.toString());
		}

	}
	  System.out.println("----sorted: "+ sort(set));


	  System.out.println("----size: "+ set.size());
	  System.out.println("----remove: "+ set.remove("rose"));
	  System.out.println("----set: "+ set);

	  System.out.println("----removeall: "+ set.removeAll(s));

	  System.out.println("----set: "+ set);
	  
	  
	  System.out.println("----retainall: "+ set.retainAll(hs));

	  System.out.println("----set: "+ set);
	  



}

@SuppressWarnings("unchecked")
public static HashSet<String> sort(HashSet<String>  s)
{
    // Create a list from elements of HashMap
    LinkedList<String> list =
           new LinkedList<>(s);

    // Sort the list
    Collections.sort(list, new Comparator() {
   		@Override
		public int compare(Object o1, Object o2) {
        	return ((String) o1).compareToIgnoreCase((String) o2);
		}
    });
    
    // put data from sorted list to hashmap
    HashSet<String> temp = new LinkedHashSet<String>();
    for (String a : list) {
        temp.add(a);
    }
    return temp;
}

}
