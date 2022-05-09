package com.collection.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.tutorial.collections.CarObjectDemo;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class HashMapDemo {

	public HashMapDemo() {

	HashMap<Integer, String> days= new HashMap<>();
	   days.put(1,"monday");  
	   days.put(2,"tuesday"); 
	   days.put(96,"saturday"); 
	   days.put(87,"5sunday"); 
	   days.put(3,"wednesday");   
	   days.put(4,"thursday"); 
	   days.put(5,"friday"); 
	   
	   System.out.println("Clone HashMap");
	   HashMap<Integer, String> weekDays=  (HashMap<Integer, String>) days.clone();
	   
	   System.out.println("days.containsKey(6)=" +weekDays.containsKey(6));
	       
	   System.out.println("days.containsValue(\"today\")=" +weekDays.containsValue("today"));
	   
	   System.out.println("Size of the hasmap"+weekDays.size());
	   
	   System.out.println("print value with key equal to 2 "+ weekDays.get(2));
	   System.out.println("print value with key equal to 3 if not present default value " + weekDays.getOrDefault(9, "Today"));
	   System.out.println("prints if two objects are equal"+days.equals(weekDays));

		System.out.println("print hash code"+days.hashCode());
		System.out.println("Check if hash map is  empty"+days.isEmpty());
		System.out.println(" Replaces value for gievn key old value="+ weekDays.get(3));
		System.out.println(" Replaces value for gievn key"+weekDays.replace(3, "wednesday", "Wednesday")+ " New value="+ weekDays.get(3));

		System.out.println(""+days.values());
		System.out.println(""+days.keySet());
		System.out.println(""+days.toString());

		days.clear();
		System.out.println("After clear function, checked if empty and size  : " + days.isEmpty()+" : "+ days.size());
//----------------------------------------------------------------------------------------------	   
		
		
		// iterating the map
		
		
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry<Integer, String> m : weekDays.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
       }  	
	   
	   System.out.println("Iterating Hashmap... keyset"); 
	   for (int num: weekDays.keySet())         //iteration over keys  
	   {  
	   //returns the value to which specified key is mapped  
	   String day=weekDays.get(num);   
	   System.out.println("num: " + num + ", Day: " + day);   
	   }  
	   System.out.println("Iterating Hashmap... keyset"); 
	   
	   for (Integer num : weekDays.keySet())   //using keyset() method for iteration over keySet  
		   System.out.println("num-: " + num);   
	   
	   System.out.println("Iterating Hashmap...Values"); 
	   for (String day : weekDays.values())         //using values() for iteration over keys  
		   System.out.println("day-: " + day);  
	   
	    //Lambda expression for iterating the map
		// dayss.forEach((k,v) -> System.out.println("key: "+ k + ", Value: " + v)); 

	   System.out.println("Iterating Hashmap... using Iterator");    
		   Iterator <Integer> it = weekDays.keySet().iterator();       //keyset is a method  
		   while(it.hasNext())  
		   {  
		   int key=(int)it.next();  
		   System.out.println("num.: "+key+"     name: "+weekDays.get(key)); 
		   }
 //-----------------------------------------------------------------------------------------	
	   
		  // Sorting in hashmap
		   
		   
		   System.out.println("Sorted Hashmap... using treemap");  
		   TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (weekDays); 
		   
		   //iterating by iterator
		   for (Iterator<Entry<Integer, String>> iterator = tm.entrySet().iterator(); iterator.hasNext();) 
		   {
			Map.Entry<Integer, String> map =  iterator.next();
			System.out.println("num.: "+ map.getKey()+"     days: "+map.getValue()); 
		   }
		   
		   
		   //iterating by Map
		   for (Map.Entry<Integer, String> map : tm.entrySet()) {
			   
				System.out.println("num.: "+ map.getKey()+"     days: "+map.getValue()); 
		   }
		   
		   
		   //sorting using Comparator
		   System.out.println("Sorted Hashmap... using Comparator Compar function on values"); 
		   for ( Map.Entry<Integer, String> map: sortByValue(weekDays).entrySet()) {
			   System.out.println("num.: "+ map.getKey()+"     days: "+map.getValue());
		   }
		   
		   
//-----------------------------------------------------------------------------------------	
    CarObjectDemo c1= new CarObjectDemo("MH", "Tata", "Nano", 5);
    CarObjectDemo c2= new CarObjectDemo("MH", "Suzuki", "800", 8);
    CarObjectDemo c3= new CarObjectDemo("PB", "Hyundai", "Verna", 5);
    
    
    //Adding Object to HashMap
    HashMap<Integer, CarObjectDemo> carMap= new HashMap<>();
	    carMap.put(1, c1);
	    carMap.put(2, c2);
	    carMap.put(3, c3);
	    
	 for (Map.Entry<Integer, CarObjectDemo> map : carMap.entrySet()) {
		int key= map.getKey();
		CarObjectDemo c= map.getValue();
		
		System.out.println( "Key:"+ key+ " State:"+ c.state+ " Company:" + c.company+" Model:"+ c.model+ " Quantity:"+ c.quantity);
	}   
	 
	//----------------------------------------------------------------------------------- 
	 //Making Map thread safe. HashMap is non synchronized. It is not-thread 
	 //safe and can't be shared between 
	 //many threads without proper synchronization code.
	 
	 Map<Integer, String> m = Collections.synchronizedMap(weekDays);
	 
}
	
	public static HashMap<Integer, String> sortByValue(HashMap<Integer, String> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, String> > list =
               new LinkedList<Map.Entry<Integer, String> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1,
                               Map.Entry<Integer, String> o2)
            {
            	return (o1.getValue()).compareTo(o2.getValue());
                //return (o1.getValue()).compareToIgnoreCase(o2.getValue());
            }
        });
        
        // put data from sorted list to hashmap
        HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer, String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	
	/*public static HashMap<String, Integer>
    sortByValueLambda(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list
            = new LinkedList<Map.Entry<String, Integer> >(
                hm.entrySet());
 
        // Sort the list using lambda expression
        Collections.sort(
            list,
            (i1,
             i2) -> i1.getValue().compareTo(i2.getValue()));
 
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp
            = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }*/
}