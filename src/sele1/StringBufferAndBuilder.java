package sele1;

public class StringBufferAndBuilder {
    
	  public static void main(String[] args){  
		  
//		  1)StringBuffer
	        StringBuffer buffer=new StringBuffer("hello");  
	        buffer.append("java"); 
	        buffer.reverse();
	        System.out.println(buffer);  
	        
//	      2)StringBuilder  
	        StringBuilder builder=new StringBuilder("hello");  
	        builder.append("java");  
	        System.out.println(builder);  
	        
//	      3)Combine  
	        
	        String s = new String("sagar");
	        StringBuffer sb = new StringBuffer("waje");//mutable
	        StringBuilder sbb = new StringBuilder("pune");//immutable
	        s.concat("W");
	        sb.append("sagar");
	        sbb.append("maharashtra");
	        System.out.println(s);
	        System.out.println(sb);
	        System.out.println(sbb);
	        
	        sb.reverse();
	        sbb.reverse();
	        System.out.println(sb);
	        System.out.println(sbb);
	    }  
}
