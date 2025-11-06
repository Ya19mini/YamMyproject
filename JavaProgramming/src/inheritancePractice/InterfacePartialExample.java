package inheritancePractice;

public class InterfacePartialExample {
	
	interface Interface1 {
	    void methodA();
	    void methodB();
	    void methodC();
	    void methodD();
	}

	interface Interface2 {
	    void methodX();
	    void methodY();
	}

	abstract class PartialImplementation implements Interface1, Interface2 {

	    // Only implementing some methods
	    public void methodA() {
	        System.out.println("methodA implemented");
	    }

	    public void methodX() {
	        System.out.println("methodX implemented");
	    }

	    // methodB, methodC, methodD, methodY are not implemented
	    // So this class must be declared abstract
	}


}
