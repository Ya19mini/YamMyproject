package inheritancePractice;

import java.util.Scanner;

public class EvenOrOddPrint {
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the starting no& End no");
			
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();	
		
		for(int i=start; i<=end; i++) {
    		   if(i%2 == 0) 
    			   System.out.println(i +" " + "Even");
    		   else
    			   System.out.println(i + " "+"Odd");
    			   
    	   }   
		
		
	}

}
