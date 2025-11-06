
// Polymorphisim can be achieved by Data Over loading

//poly morphisim can be acheived by method overloading

package JavaLearn;

public class MethodOverloadCheck {

	
//  String shape;
	//int lenghth,breadth;
	//int side1;
	double area;
	int volume; 

	
	
  public void shape(int length,int breadth) {
		
		volume = length* breadth;
		System.out.println("volume of a rectangle is " + volume);
			
	} 
	
	public void shape(int side1,double side2) {
		
		area = side1*side2;
		System.out.println("area of a sqaure is " + area);
		
	}
	
	
	public static void main(String args[]) {
		
		MethodOverloadCheck mo = new MethodOverloadCheck();
		mo.shape(5, 5);
		mo.shape(5,10.2);
		
		
	}
	
	
	
	
	
}



