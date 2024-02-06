package sele1;

import java.util.HashMap;
import java.util.Hashtable;

public class Collection2 {
    public static void main(String[] args) {
		
//    	1) HashMap
       
//    	HashMap<Integer,String> hm = new HashMap<Integer,String>();//latest value first if duplicate key present
//    	hm.put(1, "sagar");
//    	hm.put(2, "waje");
//    	hm.put(1, "pune");
//    	hm.put(null, null);
//    	hm.put(3, null);
//    	
//    	System.out.println(hm.get(2));
//    	System.out.println(hm.get(null));
//    	System.out.println(hm.get(3));
//    	System.out.println(hm.get(1));
//	
    
//       2) HashTable

        Hashtable<String,Integer> ht= new Hashtable<String,Integer>();//if we use null then  null point exception throws
        ht.put("one", 1);
        ht.put("two", 2);
//      ht.put(null, null);
        ht.put("three", 3);
        
        System.out.println(ht.get("one"));
        System.out.println(ht.get("two"));
//      System.out.println(ht.get(null));
        System.out.println(ht.get("three"));
  }
}