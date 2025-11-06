package InterviewProgramsForPractice;
import java.util.Scanner;

public class SplitNumbertoDIgits {
	
	
	public static void main(String []args) {
		
		System.out.println("ENter the digit");
		Scanner sc =new Scanner(System.in);
		
		int n,rem;
		int reverse=0;
		
		n= sc.nextInt();
		while(n>0) {
			rem = n%10;
			n /= 10;
			reverse=reverse*10+rem;
			
			
			
		}
	}
	
	
		

}
