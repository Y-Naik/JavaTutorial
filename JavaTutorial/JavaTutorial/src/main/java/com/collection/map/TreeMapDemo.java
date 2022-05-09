/**
 * 
 */
package com.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Yogita R Naik
 *
 * @date 08-May-2022
 */
public class TreeMapDemo {

public TreeMapDemo() {
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	          
	      map.put(2,"February");    
	      map.put(3,"March");    
	      map.put(10,"April");
	      map.put(7,"May"); 
	      map.put(9,"June"); 
	      map.put(1,"january");
	      System.out.println("Iterating Treemap... "); 
	      for(Map.Entry<Integer,String> m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      } 
	      System.out.println(map.ceilingEntry(4));
	      
	      
	      TreeMap<String,String> tm=new TreeMap<String,String>();    
	      tm.put("one","january");    
	      tm.put("two","February");  
	      tm.put("three","March");    
	      tm.put("four","April"); 
	      System.out.println(tm.ceilingEntry("hundred"));
	      
	      System.out.println("Comparator :"+tm.comparator());
	      System.out.println("FirstKey :"+tm.firstKey());
	      System.out.println("FloorKey :"+tm.floorKey("y")+" :   "+ map.floorKey(8));
	      System.out.println("LastKey :"+map.lastKey());
	      System.out.println("HigherKey :"+tm.higherKey("five")+":   "+ map.higherKey(8));
	      System.out.println("descendingMap :"+map.descendingMap());
	      System.out.println("descendingMap :"+tm.descendingMap());
	      System.out.println("firstEntry :"+map.firstEntry());
	      System.out.println("firstEntry :"+tm.firstEntry());
	      System.out.println("floorEntry :"+map.floorEntry(8));
	      System.out.println("floorEntry :"+tm.floorEntry("y"));
	      
	      System.out.println("headMap :"+map.headMap(8));
	      System.out.println("headMap :"+tm.headMap("gje"));
	      
	      System.out.println("navigableKeySet :"+map.navigableKeySet());
	      System.out.println("navigableKeySet :"+tm.navigableKeySet());
	      
	      System.out.println("KeySet :"+map.keySet());
	      System.out.println("KeySet :"+tm.keySet());
	      
	      
	      System.out.println("subMap :"+map.subMap(1, 7));
	      System.out.println("subMap :"+tm.subMap("four", true, "one", false));
	      
	      System.out.println("pollFirstEntry :"+map.pollFirstEntry());
	      System.out.println("pollFirstEntry :"+tm.pollFirstEntry());
	      
	      

	      Map<Integer, String> sortedMap = valueSort(map);
	      System.out.println("sortedMap :"+ sortedMap);
	      
	      Map<String, String> sortedMaps= valueSort(tm);
	      System.out.println("sortedMap :"+ sortedMaps);
	      
	      
	      
	      // All the Methods called in HashMap are also applicable

	      }


// Method for sorting the TreeMap based on values
public static <K, V extends Comparable<V> > Map<K, V>
valueSort(final Map<K, V> map)
{
    // Static Method with return type Map and
    // extending comparator class which compares values
    // associated with two keys
    Comparator<K> valueComparator = new Comparator<K>()
    {
          
        public int compare(K k1, K k2)
        {

            int comp = map.get(k1).compareTo(map.get(k2));

            if (comp == 0)
                 return 1;

            else
                 return comp;
        }
    };

    // SortedMap created using the comparator
    Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
    sorted.putAll(map);
    return sorted;
}



  



}
