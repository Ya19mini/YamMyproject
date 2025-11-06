package inheritancePractice;

//import java.util.Scanner;

public class EvenOrOddPrintWthFunctions {
	int a,b;
	
	
	void ReadInput() {
		   
		   System.out.println("Enter the  ");
	   }
	    
    void check(int start, int end) {
 	    this.a=start;
 	    this.b=end;

 	   for(int i=a; i<=b; i++) {
 		   if(i%2 == 0) 
 			   System.out.println(i +" " + "Even");
 		   else
 			   System.out.println(i + " "+"Odd");
 			   
 	   }   
 	   
    }
    
public static void main(String[] args) {
		
		
		EvenOrOddPrintWthFunctions EOObj = new EvenOrOddPrintWthFunctions();
		EOObj.ReadInput();
		EOObj.check(1, 10);
	} 
	    
	  	
/*	   void ReadInput() {
		   
		   System.out.println("Enter the  ");
	   }
	    
       void check(int start, int end) {
    	   
  
    	   for(int i=start; i<=end; i++) {
    		   if(i%2 == 0) 
    			   System.out.println(i +" " + "Even");
    		   else
    			   System.out.println(i + " "+"Odd");
    			   
    	   }   
    	   
       }

	public static void main(String[] args) {
		
		
		//Scanner sc = new Scanner(System.in);
		
		EvenOrOddPrintWthFunctions EOObj = new EvenOrOddPrintWthFunctions();
		EOObj.ReadInput();
		EOObj.check(1, 10);
	} 
*/	

}

	