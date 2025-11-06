package JavaLearn;

import java.util.Set;

/*By default all variables can be accessed by creating object. But if we want to control the accessing then create
 * the variables as Private and create methods to access the variables
 * 
 *Outside of the class we can't access the private variables.
 *
 *To assign the values to the private variables we need to create the Getters & setters methods
 */


public class Encapsulation {
	
	private int serialno;
	private String name;
	private String section;
	private double salary;
	

	public int getSerialno() {
		return serialno;
	}


	public void setSerialno(int serialno) {
		//serialno = serialno;  
		/*here both local variables & class variables name is same
		 * thst is the reason in main class its giving error. To avoid that we. Need to tell that 
this class variable is belongs to present class, to tell that we use this key word.

This key word will tell , this is a present class variable
 
		 */

		
	 this.serialno = serialno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}



}