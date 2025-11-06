package inheritancePractice;
/*Final - Variables, class, methods.
 * 	 1. makes mutable to immutable.
 * 	 2. Final classes cant be extended () we cant extend the final classes to any other classes
 * 	 3. Final methods can't be Override in the child class or any other class
 * 
 */


class Test{
	
	final int a =100; /* example for final variable*/
}

class One {
	
		final void display() {
			System.out.println("This is Final Display Method");
		}
	}

class Two extends  One{ 				//Final methods can be overloaded. To over load return type is doent considered
	   
			int display(int a) {
				System.out.println("over loading final method");
				return a;
			}
}		
			
final class Three extends Two{
	
		void display() {  // This throwing bcoz Override cant possible with final Keyword in the child class
		}
	
}	

  class Four extends Three{		// Final classes cant be extended
	  
  }

	
public class FinalKeyword {
	public static void main(String[] args) {
		
		Test obj =  new Test();
		//obj.a=200;
		//once we declare, ther will be no changes. thstsy error
		System.out.println(obj.a);	
		
	}

}
