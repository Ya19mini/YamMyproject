package inheritancePractice;

/*Every Kind of Inheritance will be achieved by using Implements but 
 *  Multiple can be performed only through  Interfaces
 * 
 * */

/* These classes to check why Multiple Inheritance wont support
class X{
	
}

class Y{
	
}

*/

class C extends B{	
	
	/*Class C will have class A,B data and can access both A& B
	 * Here as both Singleinheriatnce.java & MultilevelInheritance.java both r in same
	 * 
	 * package with object I have called classes A& B of ingleinheriatnce.java 
	 */
	
	
			void sub(int a, int b) {
				int c= a-b;
				System.out.println(c);
			}
}

public class MultiLevelInheritance {

		public static void main(String[] args) {
		
			C bobj = new C();
			bobj.display();
			bobj.add(5, 5);
			bobj.sub(10, 30);
			
		/*	X xboj = new X();
			Y yobj = new Y();
			yobj.
			xobj.
			
			*/


		}

}


