package inheritancePractice;

/*Below ex: for Heirarichal Inheritance(i.e 1-Parent, Many-Childs)
 * Here Bank -Parent, SBI&ICIC-childs
 * 
 * we r doing Method overriding by keeping Parent calss Definition/Declaration(parameters, order of params,No.of Params
  methods, variables) constant
    only implementing i.e changing the child class return amount
 */

class Bank{
	
	double RateOfInterest() {
		return 0;	
	}	
}

class ICICI extends Bank{
	
	double RateOfInterest() {
		return 10.5;	
	}	
}

class SBI extends Bank{
	
	@Override
	double RateOfInterest() {
		return 20.5;	
	}	
}

/* overriding only variables in a class ex: like below
 			
 * class Animal {
	 String colour = "Pink";
	
	}
 
 class Dog extends Animal{
		
	 String colour = "Green";		//overriding colour variable

	 	void displaycolour() {
	 		System.out.println(colour);
	 	}
	 
 }
 */


public class MethodOverriding {

	public static void main(String[] args) {
		ICICI iobj = new ICICI();
		System.out.println(iobj.RateOfInterest());
		
		SBI sobj = new SBI();
		System.out.println(sobj.RateOfInterest());
	}

}
