/**
 * 
 */
package com.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class LinkedHashMapDemo {


	public LinkedHashMapDemo() {
		 HashMap<Integer, String> lhm= new LinkedHashMap<>();
		 
		 
		 lhm.put(1,"monday");  
		 lhm.put(2,"tuesday"); 
		 lhm.put(96,"saturday"); 
		 lhm.put(87,"5sunday"); 
		 lhm.put(3,"wednesday");   
		 lhm.put(4,"thursday"); 
		 lhm.put(5,"friday");
		 // Retains order of insersion, hence it is doubly linked.
		 for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("num.: "+key+"     name: "+val); 
		}
		 
			System.out.println("num.: "+ lhm.get(3));
			// lhm.put(3,"all day");
			 lhm.remove(3);

		 
			 for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
					Integer key = entry.getKey();
					String val = entry.getValue();
					System.out.println("num.: "+key+"     name: "+val); 
				} 
			 
			 
	}
 
	//Methods are same as HashMap
}
