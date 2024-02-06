package sele1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Collection1 {
     public static void main(String[] args) {
		
//    	 1) ArrayList
        
//    	 ArrayList ar = new ArrayList();//it can save duplicate value
//    	 ar.add("sagar");
//    	 ar.add(1);
//    	 ar.add('a');
//    	 ar.add("waje");
//    	 ar.add("waje");
//    	 
//    	 
//    	 for(int i=0;i<ar.size();i++) {
//    		 System.out.println(ar.get(i));
//    	 }
    	 
//       2) LinkedList
    	 
//    	 LinkedList li = new LinkedList();//it can save duplicate value
//    	 li.add("sagar");
//    	 li.add(2);
//    	 li.add(null);
//    	 li.add("waje");
//    	 li.add(null);
//    	 
//    	 for(int i=0;i<li.size();i++) {
//    		 System.out.println(li.get(i));
//    	 }
    	 
//    	 3) Vectors
    	 
//    	 Vector v = new Vector();//it can save duplicate value
//    	 v.add("sagar");
//    	 v.add(3);
//    	 v.add(null);
//    	 v.add(null);
//    	 v.add("waje");
//    	 
//    	 for(int i=0;i<v.size();i++) {
//    		 System.out.println(v.get(i));
//    	 }
    	 
//   	 4) PriorityQueue
    	 
//    	 PriorityQueue<String> pq = new PriorityQueue<String>();
//    	 pq.add("sagar");
//    	 pq.add("waje");
    	 
//    	 System.out.println(pq.peek());//peak method is used to get the peak data
//    	 System.out.println(pq.poll());//poll method is used to get the poll data
   	 
//    	 System.out.println(pq);
//    	 System.out.println(pq.poll());
//    	 System.out.println(pq.peek());
    	 
//    	5) HashSet
    	 
    	 HashSet hs = new HashSet();//it cannot save duplicate value and latest value will be print first
    	 hs.add("sagar");
    	 hs.add(4);
    	 hs.add(4);
    	 hs.add(null);
    	 hs.add(null);
    	 
    	 Iterator it = hs.iterator();
    	 
    	 while(it.hasNext()) {
    		 System.out.println(it.next());
    	 }
 
	}
}
