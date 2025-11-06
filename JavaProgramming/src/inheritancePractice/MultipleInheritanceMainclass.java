package inheritancePractice;

/**This is to implement 2 interfaces (1. InterfaceDemo, 2. MultipleInheritanceInterface) 
 					+
 To extend   1. one single child class-InterfaceMainClass
all 3 together in a single class InterfaceMainClass)


which is Hybrid inheritance
*/

public class MultipleInheritanceMainclass extends InterfaceMainClass {

	public static void main(String[] args) {
		
		MultipleInheritanceMainclass mim = new MultipleInheritanceMainclass();
		mim.circle();
		mim.square();
		mim.m1(x, y);
	
	}

}
