package inheritancePractice;

/**
 This is the Main class used to call Interface-interfaceDemo.java and MultipleInheritanceInterface
can implements 2 or more interfaces in a single class which is called implementing Multiple Inheritance

*/
public class InterfaceMainClass implements InterfaceDemo,MultipleInheritanceInterface{
	
	//we can implements multiple interfaces in a single class
	
	/* once we write implements in main class, we should call immediately 
	
	parent class abstract method otherwise it will give error
	 */	
	@Override
	public void circle() {
 //	default void circle() { --This will give error, to resolve give PUBLIC
		//public is higher modfier, default is lesser modifier
		
		/*whatever access modifier provided in parent class,
		with same modifier we should implement in child/main class
		
		*/
		System.out.println("Here we implementing abstract method circle");
		
		
		//whenever implement interface with abstract method, the modifier hsould be PUBLIC
		
		

	}
	
		public void m1(int x, int y) {
			     System.out.println(x+y);
	
			}
	
	

	public static void main(String args[]) {
			
		InterfaceMainClass imobj = new InterfaceMainClass();
	
			//scenario-1
			imobj.circle(); //abstract
			imobj.square(); //default
			InterfaceDemo.rectangle(); //static method can access directly from interfacce
			/*static variables or methods can be invoked directly 
			in main class without any object creation  if both r in same class. 
			IF Both Main class and static Method
			-- are in diff interface we should call with 	 INTERFACE.StaticMethod NAME*/
	
			//scenario-2
			/*
			 * variable of Interfacce can hold the object of class
			 * i.e following this rule
			  we can create Object Reference for interface but we cant Instantiate Interface

			 */
			System.out.println("\n Scneario-2");
			InterfaceDemo idobj = new InterfaceMainClass();
			
				idobj.circle();
				idobj.square();
				
				MultipleInheritanceInterface miobj = new InterfaceMainClass();
				miobj.m1(200, 100); //overridedvalues r taken 100, 200 though intailly declared as 0,200
				
	}


}
