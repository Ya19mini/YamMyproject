package ExceptionHandling;

import java.util.Scanner;

/**
 * Exceptions r mainly 2 types 1. checked exceptions -- will Identified by compiler
 							   2. Unchecked exceptions --occur during run time/dynamic time. Not identified by 
 							   compiler						   
 */

/** Unchecked exceptions
 * 1. ArithmeticException :
  			 If we divide any number by zero, there occurs an ArithmeticException.
  2. ArrayIndexOutOfBoundsException occurs: When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 
  				there may be other reasons to occur ArrayIndexOutOfBoundsException. 

  3. Number Format Exception in Java :
 			If the formatting of any variable or number is mismatched, it may result into NumberFormatException. Suppose we have a string variable that has characters;
 	 		converting this variable into digit will cause NumberFormatException.
   4. Null -pointer ezceptions: 
   			If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
			String s=null;  
			System.out.println(s.length());//NullPointerException  
 */

public class TypesOfException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/** ex-1 java.lang.ArithmeticException
		 * 
		System.out.println("Enter a number:");
				int n = sc.nextInt();
		int d= 100/n;
		
		System.out.println(d);
	
		**/
		
		/** Ex-2 ArrayIndexOutOfBoundsException occurs
		int a[] = new int[5];
		
		System.out.println("Enter the postion where u want to add the number");
		
		int pos = sc.nextInt();
		System.out.println("Enter value of that above position(0-4)");
		int value = sc.nextInt();
		
		a[pos]=value;
		System.out.println("Added value in the position is :"+a[pos]);
		 */
		
		//Ex: 3   Number Format Exception in Java  
		
		/* String str = "abc"; // Initializing a String with non-numeric characters 
		 int num = Integer.parseInt(str);
		 System.out.println(num);
		*/ 
		 
		 //Ex: 4 Null Pointer Exception
		 
		 String str = null; // Initializing a String with null 
		 
		 System.out.println(str.length());
		 
		
	}	
		
}
