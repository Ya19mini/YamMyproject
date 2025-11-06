package JavaLearn;

 /* When to use static:
	If u find any command data  across multiple objects , then static need to use other wise no need.

  * If we declare variable& methods as static then no need of object creation if its in a same class
 
  * we can directly access static methods & variables directly 
  
 
  
 If we made any object/variable as static it will become common/shared  for every object 
  once we declare as static in one place, it will reflect in all the places 

* static methods can access static stuff directly (without object) in the same class
 * static methods can also access non-static variable/methods using object.
 
 * Non-static method can access everything
 
 * To access static variables/method in another class we needto access via class name of the
 * function where its presented.
 * 
 * Static can be used for variables & Methods not for classes
 */
public class StaticDemo {
	
	static int x=20;
	int a =10;
	
	static void m1() {
		System.out.println("This is static method");
	}
	
	void m2() {
		System.out.println("This is non-static method");
	}

	 void m() {
		 
		 m1();
		 m2();
	 }
	
	/*Incorrect way of declaring main method-- public void static main(String[] args) { 
	 * 
	 * Return Type always should be before the Method
	 */
	 
		
	 public static void main(String[] args) { 
	 
		/* "System is Pre defined class in Java
			Out -is is static variable of printstream   type and 
			And print;ln is also from printstream class"
		 * */
		
	 /*	System.out.println(x);
		m1();
		// System.out.println(a); this will give error as object is not created
		
		StaticDemo sd = new StaticDemo();
		sd.m1();
		System.out.println(sd.a);
		
		*/
		StaticDemo sd = new StaticDemo();
		sd.m();
		
	}
	
}
