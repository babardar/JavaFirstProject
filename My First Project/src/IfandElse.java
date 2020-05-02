import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 8) You have four numbers add first two number and subtract last two numbers. And then Compare the result
//	  of first two numbers with Second two numbers and print whichever is greater.
		
		Scanner FourNumbers = new Scanner(System.in);
		System.out.println("First number");
		int first = FourNumbers.nextInt();
		System.out.println("Second Number");
		int second = FourNumbers.nextInt();
		int sum= (first+second);
		System.out.println("Sum of 2 Numbers= " + sum);
		System.out.println("First Number");
		int First = FourNumbers.nextInt();
		System.out.println("Second Number");
		int Second = FourNumbers.nextInt();
		int sub= (First-Second);
		System.out.println("Sub of 2 Numbers= " + sub);
		if (sum>sub) {
			System.out.println("sum is grater than sub");
		}
		else if (sum==sub) {
			System.out.println("sum is equal to sub");
		}
		else {
			System.out.println("sub is greater than sum");
		}
		studentgrade();
	}

	public static void studentgrade() {
		// TODO Auto-generated method stub
		
// 9) Display passed where student grade is greater than or equal to 60 and display fail if grade is less
//	than 60
		
		Scanner grade = new Scanner(System.in);
		System.out.println("First Grade");
		int result = grade.nextInt();
           int pass =result ;
		if (pass>=60)
		{
		System.out.println("Result= Passed " + result);
		}
		else {
			System.out.println("Result= Fail " + result);
		}
			}
	}


