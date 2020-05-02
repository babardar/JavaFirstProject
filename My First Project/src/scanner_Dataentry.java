
import java.util.Scanner;

public class scanner_Dataentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7) Take the integers or string from the user dynamically and print on the screen.
		
	
					Scanner directentry = new Scanner(System.in);	
					System.out.println("Number 7: ");
					System.out.println("Two Numbers: ");
					
					int first= directentry.nextInt();
					int second= directentry.nextInt();
					
					System.out.println("Number1: "+ ali);
					System.out.println("Number2: "+ second);
					
					int sum = first+second;
					
					System.out.println("Addition of two numbers: " + sum);
					
					
				Scanner information = new Scanner(System.in);
				System.out.println('\n');
				System.out.println("Scanner Practice:");
				System.out.println("What is your first name? ");
				String firstname= information.next();
				System.out.println("What is your last name? ");
				String lastname = information.next();
				System.out.print(firstname.concat( lastname));
				
				
				
	}

}
