package JavaLearn;

//Can we overload Main method? Yes

public class OverloadMainMethod {
	
	
	void main(int x) {
		
		System.out.println(x);
	}
	
	void main(String name){
		System.out.println(name);
	}
	
	void main(String s1, String s2) {
		System.out.println(s1+s2);
	}
	
	

	public static void main(String[] args) {
		/*Here args also one of the parameter like s1 & s2 and 
		 * String[]-- is an array type argument. so this main method has 2 params like above all.
		 * 
		 * so create to call above all main methods we need to create object in ACTUAL METHOD which is this
		 */
		
		
		
		OverloadMainMethod ov = new OverloadMainMethod();
		
		ov.main(190);
		
		ov.main("Yamini");
		
		
	}

}
