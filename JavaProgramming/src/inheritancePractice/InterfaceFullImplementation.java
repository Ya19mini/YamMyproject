package inheritancePractice;

public class InterfaceFullImplementation extends InterfacePartialExample {
	
	public void methodB() { System.out.println("methodB implemented"); }
    public void methodC() { System.out.println("methodC implemented"); }
    public void methodD() { System.out.println("methodD implemented"); }
    public void methodY() { System.out.println("methodY implemented"); }



	public static void main(String[] args) {
		InterfaceFullImplementation ifi = new InterfaceFullImplementation();
		ifi.methodY();
		
		 
	} 

}
