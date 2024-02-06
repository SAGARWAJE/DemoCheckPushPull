package sele1;

public class ErrorsandExceptions1 {
	
	public void test1() {
		System.out.println("test1 run");
	}
	public void test2() {
		System.out.println();
	}
     public static void main(String[] args)  {//checked exception
    	 ErrorsandExceptions1 obj = new ErrorsandExceptions1();
    	 obj.test1();
    	 obj.test2();
	}
}
