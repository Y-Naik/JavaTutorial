/**
 * 
 */
package com.collection.lists;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class ArrayListDemo {

	public ArrayListDemo() {
		ArrayList<String> al= new ArrayList<>();
		
		al.add("Surat");
		al.add("Mumbai");
		al.add("Delhi");
		
		al.add("Pune");
		al.add("Goa");
		al.add("Goa");

		
		al.add(3, "Kolkata");
		 System.out.println("----direct display"+ al);
		 System.out.println("-----Using iterator");		
		
		for (Iterator<String> iterator = al.iterator(); iterator.hasNext();) {
			 System.out.println(iterator.next());
		  }
		 System.out.println("-----Using For Each");

		for (String string : al) {
			 System.out.println(string);

		}
		
		//al.forEach(null);
		  System.out.println("----Contains: "+ al.lastIndexOf("Goa"));
		  System.out.println("----Contains: "+ al.set(3, "nasik"));
		  System.out.println("----direct display"+ al);
		  
		  //System.out.println("----direct display"+ al.listIterator(2));
		  
		  System.out.println("-----Using list iterator");		
			
			for (Iterator<String> iterator = al.listIterator(2); iterator.hasNext();) {
				 System.out.println(iterator.next());
			  }
			al.subList(3, 6).clear();
			
			 System.out.println("----direct display"+ al.subList(1, 3));
			  System.out.println("----direct display"+ al.size());
			al.sort(null);  
		  al.trimToSize();
		  System.out.println("----direct display"+ al);

		
	}
}
