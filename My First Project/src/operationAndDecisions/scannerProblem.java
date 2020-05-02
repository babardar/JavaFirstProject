package operationAndDecisions;

import java.util.Scanner;

public class scannerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner week = new Scanner(System.in);
		System.out.println("Switch: Enter number between 1 and 7 to display day of week");
		
		int num = week.nextInt();
	
		
		switch(num) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				
		}
		ELSEIF();
	}

	public static void ELSEIF() {
		// TODO Auto-generated method stub
		
		Scanner week= new Scanner(System.in);
		System.out.println("IF ELSE IF: Enter number between 1 and 7 to display day of week");
		int number = week.nextInt();
		
		if (number==1) {
			System.out.println("Monday");
		}
			else if (number==2){
				System.out.println("Tuesday");
		}
			else if (number==3){
				System.out.println("Wednesday");
			}
			else if (number==4){
				System.out.println("Thursday");
			}
			else if (number==5){
				System.out.println("Friday");
			}
			else if (number==6){
				System.out.println("Saturday");
			}
			else if (number==7){
				System.out.println("Sunday");
			}
	}

}
