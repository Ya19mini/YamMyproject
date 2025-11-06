package inheritancePractice;


class A{
			void display() {
	
				System.out.println("This is class A");	
			}
}

	 class B extends A{
		 
		 public void add(int x, int y) {
			 
			 int c = x+y;
			 System.out.println("This is class B");
			 System.out.println(c);
			 
		 }
	 }



public class singleInheritance {

	public static void main(String[] args) {
		
		B bobj = new B();
		bobj.display();
		bobj.add(5, 5);
		

	}

}
