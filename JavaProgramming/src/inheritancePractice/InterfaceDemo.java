package inheritancePractice;
// Created new Interface from -->File

/* 1. Interface allows abstract Methods
 * 2. after Java 8 , Interfaces allows Default & static Methods as they can be implemented 
 * 3.  By default variables  r Final & static
 */
public interface InterfaceDemo {
	
 /*	void sqaure() {    error due to Interface we cant implement
		
	}
 */
	
	int shape =10; //3.
	int width=20; 
	
	void circle(); //1. 
	
		/*Abstrat method as it  Has a declaration only (no body/implementation).
		 * In an interface, all methods are implicitly abstract unless they are marked as default or static.
			Must be implemented by the class that implements the interface.

		 */
		
	default void square() {  //2.
		System.out.println("This is default Square Method");
	}
	
	static void rectangle() {
		System.out.println("This is static  recangle Method");

	}
}
