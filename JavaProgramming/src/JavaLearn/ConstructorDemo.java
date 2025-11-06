/* constructor name should starts with class name
 * constructor is only to assign the values, not to perform any tasks/operations.
 * 
 * in main class, constructor can be called like below with passing values
 * ConstructorDemo cd= new ConstructorDemo(500,600); 

constructor used to initialize/declare values/methods
It dodenst has any return type not even void type
		
* */

package JavaLearn;

public class ConstructorDemo {
	
	int a,b;

	
	ConstructorDemo(){  //3.non-parameterized constructor
		
		a= 100;
		b=200;
	}

	
	ConstructorDemo(int x, int y){  //2.Parameterized constructor
		
		a=x;
		b=y;
	}

	 
	void sum() {
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
	
	//	ConstructorDemo cd= new ConstructorDemo(); //1. object creation and by default constructor also invoked
		
		ConstructorDemo cd= new ConstructorDemo(500,600); //Parameterized constructor
		cd.sum();
		
		
			
		
	}

}
