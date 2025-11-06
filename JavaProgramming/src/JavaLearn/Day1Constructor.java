package JavaLearn;

public class Day1Constructor {
	
	int empid;
	String name;
	
	void display() {
		
		System.out.println(empid+" "+name+"   ");
		//System.out.println(name);
	}
	
	//purpose of method is store data in variables
	void EmployeeData(String Empname,int id) {
		
				name = Empname; //assigning local variable values to class variable 
				empid =id;
				
				
				
	} 
	
	/*3. creating constructor to store the variables/data
	 * Constructor Name should be same as Class
	 * constructor wont have any return type not even VOID
	 * It is only to initialize (i.e to assign values to variables)variables
	 * At the time of Object creation constructor will get called automatically no need to call 
	 * externally
	 * Constructor CAN NOT Be ABSTRACT, STATIC, FINAL AND SYNCHRONIZED.
	 */
	
	Day1Constructor(String Empname,int id) {
		
	  name = Empname; //assigning local variable values to class variable 
	  empid =id;
				
				
				
	}
	
	/*public static void main(String[] args) {
		
		System.out.println(10+20);
		int a[] = {10,20,30,40,40};
		for(int i:a) {
			System.out.println(i);
		} */
		
		/* This will throw bcoz we cant create method inside main method
		 * public void display() {
			
		} */ 
		
	/*	Day1 obj1 =new Day1(); //creating object
		obj1.empid =100;
		obj1.name  = "yamini";
		obj1.display();
	
		
	} */
	
	
	

}
