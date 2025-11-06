package ExceptionHandling;
//https://www.youtube.com/watch?v=NsctooZANVk
//https://www.youtube.com/watch?v=OIozDnGYqIU

// Class name should be the customexceotion name which you want to create
public class CustomeException extends Exception{

	String str;
	
	CustomeException(String str) { //THIS IS CONSTTUCTOR
		this.str = str;
		if(str == "Yamini") {
			System.out.println("string matched");
		}
		
	}
	
	
	
}


