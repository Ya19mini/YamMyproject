package inheritancePractice;

public class RunPolyMainClass {

	public static void main(String[] args) {
		
		Animal aniobj = new Animal(); // Normal way of object creation
		
		Animal aniobj1 = new Dog(); // \Here v creating New Dog()  object but upcasting Animal class as Dog also belongs to animal class
		
		/**
		 *up casting will be done automatically, here the object - "aniobj Reference type is - Animal class" 
		 * 
		 */
	//	aniobj.Cow(); //throwing error bcoz though cow() is in DOG, aniobj Reference type is - Animal class
		//so it will access only Animal class data
		
		
	}

}
