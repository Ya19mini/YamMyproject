package wrapperClassesAndCasting;

/** Converting data/value from lower data type or object to higher type/version is called casting.
 * casting applicable for both primitive type and objects
 * 
 *  Up casting /Widening
	int -->Long
	float -->Double
 	
 *  Down casting /Narrowing
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

public class Casting {
	
	public static void main (String [] args) {
		
		int intvalue = 10;
		long a = intvalue;			//Up casting OR Widening
		System.out.println(a);
		
		float floatvalue = 20.5F;
		double d = floatvalue;
		System.out.println(d);
		
		
		//Down casting
		
	double d1 = 100.567d;
	float flt = (float)d1;
	System.out.println(flt);
	
	int ivalue = (int)d1;
	System.out.println(ivalue);
	
	byte b = (byte)floatvalue;
	System.out.println(b); 
		
	
	//Casting with OBJECTS
		
		
	}

}
