package inheritancePractice;

/* Data Abstraction 
 --Hiding Implementation Details and show only functionality.
 * can be achieved using 1. Interface
  						 2.By using Abstract class 
 
 * We can't achieve 100% abstarction By using Abstarction class whilist interfacce can do as its advanced concept

 Points to Remember for Abstract:
 1. An abstract class must be declared with an abstract keyword.
 2. It can have abstract and non-abstract methods.
 3. Abstract Method contains only SIgnature No BODY(Un -Implemented Method)
 */


/*Interface
 
  Class and Interface r similar except keyword.
  
  
 -- There are mainly three reasons to use interface
 1. It is used to achieve abstraction.
2.  By interface, we can support the functionality of multiple inheritance.
3. Intially developpers get only hiigh level Info on requirement 
	i.e Banking application --login function, logout  so they will create interface
	once get the full Design details Implementation will starts.
	
3.  It can be used to achieve loose coupling.
4. use Interface keyword
 
 
 Points to Remember for Interfacce: 
 
 * An interface in Java is a blueprint of a class

 * BYdefault Interface contains Final& static Variable 

 * Interface contains abstract methods (also allowed default methods & static methods from Java 8 onwards)
 
 * By default all Methods in Interface are ABSTRACT METHODS and those are PUBLIC
 *  supports Multiple Inheriatcce
 *  
 *  A class can extemds another class, A interfacce can extednds another interface,but
 *    A CLASS  IMPLEMENTS an INTERFACE. 
 *     
 -->   we can create Object Reference for interface but we cant Instantiate Interfacce
  			 This is  NOrmal object creation
  			
  			Test Obj = new Test()--; //Here actually the  created  object is Test();
  						new Test()--is called Instantiation
  			
  			we call method with class name.object also like
  			Test.obj.m1 --> m1 is function
  			
  			but to avoid multiple times of object cration we created reference varivale = OBj
  			
  			So in above line for Interface we can create Object Referencei.e obj variable only
  			
  			
  			Ex: Test obj = new Obj();  // 
  				Test Interfacce = new Test // Class--Test is implementing interface
  			
  			
 */


/* From Google :

An interface in Java is a blueprint of a class. It has static constants and abstract
methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract
methods in the Java interface, not method body. It is used to achieve abstraction and
multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It
cannot have a method body.

Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.
 * 
 */

