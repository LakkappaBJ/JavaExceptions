//Exception Handling  
package com.xworkz.exception;

public class Calculator {
	public static void main(String[] args) {
//		System.out.println("starting main()");
//int num1=0;
//int num2=10;
//System.out.println(num2/num1);    // 10/0 arithmetic exception
//System.out.println("End main()");
//===================================================================================
		System.out.println("starting main()");
		int num1 = 0;
		int num2 = 10;
		//int num2 = 10;
		String s=null;
		try {
			System.out.println(s.toLowerCase());
			System.out.println(num2 / num1); // 10/0 arithmetic exception
		} catch (ArithmeticException exception) {
			
			System.out.println(exception.getMessage());
		}
		//We can use multiple catch blocks
		catch(NullPointerException e) {
			System.out.println(e.getMessage()+" "+e.getClass().getSimpleName());
		}

		System.out.println("End main()");
// =============================================================================
/*		System.out.println("starting main()");
		int num1 = 0;
		int num2 = 10;
		String name = null;
		try {
			System.out.println(num2 / num1); // 10/0 arithmetic exception
			System.out.println(name.toUpperCase());
		} catch (ArithmeticException | NullPointerException exception) {
			// TODO: handle exception
			System.out.println(exception.getClass().getSimpleName() + "\t" + exception.getMessage());
		}

		System.out.println("End main()");
		*/
	}
}
 