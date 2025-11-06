package wrapperClassesAndCasting;

/** what is wrapper class in Java--Converting one data type to another datatype is called wrapper calsses
 * 
Types of wrapper classes for Primitive data types
int - INTEGER.   Integer.parseInt(String value)
double -DOUBLE
float -- FLOAT
boolean --BOOLEAN
char -CHARACTER
String --It WONT comes under primitive
 */

/** Scenario where wrapper classes needed
 	In Java we can store data in 2 formats-1. Primitive 2. Object type. Int, float, bool,double are called promitive data types(i.e numbers)  
ex: String s ="Yamini"   ---1 way of storing data
String s  = new String("Yamini") --In Object format storing data

-->Suppose If we have string formate S1= "10.5", S2= "1.5"
If we want to get o/p of S1+S2 as 12 instead of 10.5+1.5
we need to use warpper class i.e which will convert string to. INTEGER

 */

/** Primitive Data types  Low to High(Increasing) order is:
 * 1. Boolean (T/F) 
   2. Byte (1 byte (8 bits). Stores whole numbers from -128 to 127)
   3. Char (16-bit unsigned Unicode character)
 * 4.Short(	16-bit signed integer)
 * 5. INT (32-bit signed integer)
 * 6.Long  (64-bit signed integer)
 * 7.Float (32-bit floating point number)
 *  8.DOUBLE (	64-bit floating point number)
 */
public class WrapperClass {

	public static void main(String[] args) {
		
		String S1 ="10";               //converting string to Int. rule is in double quotes any Integer should be there
		int a = Integer.parseInt(S1);
		System.out.println(a);
		
	/*	String S2 ="Yamini";        //thowed java.lang.NumberFormatException bcoz instead of num string is given
		int b = Integer.parseInt(S2);
	*/	
		
		
    /* Example for Int,double, bool, char to String conversion*/
		
		int var = 50;
		char c = 'Y';
		
		String s= String.valueOf(var);
		System.out.println(s);
		
		/* char to String */
		s= String.valueOf(c);
		System.out.println(s);
		
		
		
		
		
		/*String to Boolean
		
		String s = "Yamini";  //other than True if u pass anything it will give Error.
		System.out.println(Boolean.parseBoolean(s));
		
		*/
	}

}
