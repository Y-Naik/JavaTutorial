package com.collection.sets;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class TreeSetDemo {
	
	public TreeSetDemo() {
		// TODO Auto-generated constructor stub
	
	TreeSet<String> set=new TreeSet<>();  
	  set.add("Rose");  
	  set.add("Lilly");  
	  set.add("Sunflower");  
	  set.add("Lotus"); 
	  set.add("rose"); 
	//  set.add(null);
	  set.add("");	
	  
	  System.out.println("Tree set iterator");
	  for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			 System.out.println(iterator.next());
		  }
	  
	  //System.out.println(" descendingIterator"+set.descendingIterator());
		 System.out.println("------Tree set descendingIterator");

	  for (Iterator<String> iterator = set.descendingIterator(); iterator.hasNext();) {
			 System.out.println(iterator.next());
		  }
	  System.out.println("----set: "+ set);
	  
	  System.out.println("----set: "+ set.first());
	  System.out.println("----set: "+ set.floor("rose"));
	  //Functions similar to treeMap
	  

	}
}
