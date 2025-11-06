package inheritancePractice;

//Method OverLoading Vs Riding
class ABC{
	
		void m1(int a) {
			System.out.println(a);
		}
		
		void m2(int b) { 
			System.out.println(b);
		}
		
}
class XYZ extends ABC{
	
	void m1(int a) {               //Here we r OverRiding as we didn't change the Definition of method void m1(int a)
	  System.out.println(a*a);   // only Implementation is changed  
     }	
	
	void m2(int a, int b) {		//This is over loading by changing no.of params & same function name
		System.out.println(a+b);
		
	}
	
}
/*Total Methods in XYZ = 3

Basically it should be 2+2= 4, but as  method -->void m1(int a) is overrided
m1() method will consider as only ONE i.e m1()=1

->OverLoaded method can be consisdered as seperate method. so we have m2() =2

*/
public class MethodOverloadVsMethodOverRiding {
	
	public static void main(String args[]) {
		XYZ obj = new XYZ();
		obj.m1(10); //Overrided method is considered 10*10=100  
		obj.m1(20);
		obj.m2(10, 20);
	}

}
