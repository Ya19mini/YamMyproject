package collections;


/*Program to print duplicate letters in a string and count of that*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraylistExample {
	
	/* way-2
	 * Using for Loop
	In this approach, we follow the steps given below 

	First convert the given string into character array and then sort it using Arrays.sort() method.
	Next, use the for loop to iterate over the element of character array.
		Use if block to check whether current character is equal to the next character.
		If found equal, mark the character as duplicate and repeat the process till the length of array.
	 */
	
	
	
	
	public  void CheckDuplicate(String str) {
		
		System.out.println("Given string :  " + str);
		
		char carray[] = str.toCharArray(); //To convert string to char array
		Arrays.sort(carray);
		
		System.out.println("The repeated chars in a string are:");
		
		int count =0;
		for (int i =0; i<carray.length-1; i++) {
			
			
			 if (carray[i] == carray[i + 1]) {
				 
		            System.out.println(carray[i]);
		            count++;     
			 	}	
			 
			 while (i < carray.length-1 && carray[i] == carray[i + 1]) {
				 i++;
			 }
			 
		}
		System.out.println("Total duplicate characters found: " + count);
	}
	

	public static void main(String[] args) {
		
		ArraylistExample ale = new ArraylistExample();
		ale.CheckDuplicate("ThisisString");
		
	//	CheckDuplicate("AddepalliYamini");  //if u declare above method as static then directly can call using this
		
	/* Way-1 
		
		//String a= "Yamini";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the string");
		String one = sc.nextLine();
		
		int total_count = one.length();
		
		//here how to count the repeated letters in a string
		int after_replace = one.replace("i","").length();
		
		int count = after_replace - total_count;
		
		System.out.println("Duplicate letters and count of a string is"+ count);
	 */
		
		
		
		
		
	}
	
 	
}	
		
		
		
		
		
		
		
		
		
		
		
	