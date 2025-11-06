package inheritancePractice;

/* when to use super keyowrd: 
 *  is used to refer to members (calssvariables, methods, or constructors) of the immediate parent class.


 	In base calss x=100 is there, in child class by doing overriding i.e by implementing/updating the x=200
	and when we call the x value in it will show 200 instead of 100.

	But If we want -Immediate parent class value with the same child class object then
	we need to use super key word			
 */

/* Scenario-1 explanation in another way
 
  	When we implement parent class with child class object, we should get parent class variables/methods
  	 (i.e Old Implemenation of the class) in such cases we need to use SUPER  keyword.
 
		
	--->  The super keyword in Java is used within a subclass to refer/Invoke the immediate parent class variable/method.
		Its primary uses are: [1, 2, 3, 4] 
		
		1. Invoking the parent class constructor:
		2. Accessing overridden methods of the parent class: I
		3. Accessing hidden instance variables of the parent class: I
		(For 1,2,3 notes refer 'Java-prep-from-Sdet-youtube' Yamini's wprd document)
		
	 */	
		
 /*		1. can NOT support in Interfacce i.e Multiple Interface it wont support .
  * 	2. super keyword cannot be used within a static method.
  */
		


 class Animal {
	 String colour = "Pink";
	
}
 
 class Dog extends Animal{
	//	@Override 			 we cant use this annotation while over riding variables. Applicable only for overrided methods.
	 String colour = "Green";		//overriding colour variable

	 	void displaycolour() {
	 		System.out.println(super.colour); //using super keyword
	 	}
	 
 }


public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.displaycolour(); //overrided string variable colour value=Green is printed  
	
		/*So Here If I need to print “Pink” colour super  key word need to use
         use super (Line.No-29) 
         */
		eat1 e = new eat1();
		e.eat();
	}

}
