package JavaLearn;

public class ConstructorOverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstructOverload cod1 = new ConstructOverload(10.5,10.5,10.5); //this is the correct way to pass the variables for the created constructor
		
	/*	cod.ConstructOverload(10.5,1.5,1.5); This line will gives error bcoz we cant call the constructor in this way
		.only methods we can call using this way  */
		
		ConstructOverload cod = new ConstructOverload();
		ConstructOverload cod2 = new ConstructOverload(2.5);
		
		System.out.println(cod.volume()); //default constructor called, so 0 is printed
		System.out.println(cod1.volume()); //parameterized constructor
		
		System.out.println(cod2.volume());
		
	}

}
