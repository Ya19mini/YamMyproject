package ExceptionHandling;

//Example for unchecked exceptions.
import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		try {
			int d= 100/n;
			System.out.println(d);
		
		 
			String a ="abc";
			int value = Integer.parseInt(a);
			System.out.println(value);
			
		   }
		
		catch(Exception e) {
			System.out.println("catching the  exception");
			System.out.println(e);
		}
		
		try {
			throw new CustomeException("custom excep for specidic condition");
			//System.out.println("example for custom exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		   
		 
		
		//System.out.println(d);
		
		

	}

}
