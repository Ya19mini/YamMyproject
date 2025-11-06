package JavaLearn;

public class MainClaass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. using object reference variable to store the /params data
	/*	Day1 obj1 =new Day1(); //creating object
		obj1.empid =100;
		obj1.name  = "yamini";
		obj1.display();
	}  */

		
		//2.using method to store /variables parameters
		
		/*	Day1 obj1 =new Day1();
		obj1.EmployeeData("Yamini", 01);//1st this will call
		//whatever order the params r declared in method same order need to follow 
		
		//obj1.EmployeeData("Madhavi", 02);
		obj1.display();//2nd this will call and print the data
		
		 */	
		
	//3. using constructor to store the data/variables
	
		Day1Constructor obj1 =new Day1Constructor("Yamini",1); //pass the values as defined in constructor
		obj1.display();
		
	}
	
	
	
}
	