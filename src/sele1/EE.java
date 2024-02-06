package sele1;

import java.util.Scanner;

public class EE {
   
	public void test1() {
   	 Scanner scan = new Scanner(System.in);

   	 System.out.println("enter ur first name");
   	 String a = scan.next();
   	 System.out.println("enter ur surname");
   	 String b = scan.next();
     System.out.println("enter ur city");
   	 String f = scan.next();
    }
   	 
    public void test2() {
   	 Scanner scan1 = new Scanner(System.in);
   	 
   	 System.out.println("enter 1st no");
   	 int a = scan1.nextInt();
   	 System.out.println("enter 2nd no");
   	 int b = scan1.nextInt();
   	 try {
   		 int c = a/b;
   		 System.out.println(c);
   	 }
   	 catch(Exception e) {
   		 System.out.println(e);
   	 }
   	 finally {
   		 System.out.println("i am finally block");
   	 }
   	 
}
    public void test3() {
   	 System.out.println("thanku for using exception");
    }
    public static void main(String[] args)  {
   	 EE obj = new EE();
   		 obj.test1();
   		 obj.test2();
   		 obj.test3();
   	 }
}
