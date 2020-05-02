
public class FirstPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
// 1) Your 6-year-old client needs an application that will receive an integer from the user
//    banging on the keyboard, add 5 to it, double it, subtract 7 from it, and display the
//    result to the screen.
		
			int x = 3;
			int sum = x+5;
			int mul = sum *2;
			int sub = mul-7;
			System.out.println("Number1:");
			System.out.println(sub);
			sum();
	 }
	
		public static void sum() {
		
		
// 2) His little sister now wants a program to read three numbers, add them together and print their total.				
			int a= 5;
			int b= 6;
			int c=10;
			int sum=a+b+c;
			System.out.println("Number2:");
			System.out.println("sum of three number: " + sum);
			average();
	}

		public static void average() {
	
// 3) A program is needed to prompt the user operator for ten exam scores, calculate the average score and 
//   display the result to the screen. The average score is calculated as the sum of the scores divided by
//   the number of scores.
			int a=100;
			int b=150;
			int c=200;
			int d=250;
			int e=300;
			int f=350;
			int g=400;
			int h=450;
			int i=500;
			int j=550;
			int sum=a+b+c+d+e+f+g+h+i+j;
			int average= sum/10;
			System.out.println("Number3:");
			System.out.println("average of 10 exams: " + average);
			
// 4) Do the math operations like addition, multiplication, subtraction and division on two numbers and print
//    on the screen. 
			
			int x=6;
			int y=26;
			int sum1=x+y;
			int multiply=x*y;
			int sub=x-y;
			float div=x/y;
			System.out.println("Number4:");
			System.out.println("sum of 2 numbers: " + sum1);
			System.out.println("multiplication of 2 numbers: " + multiply);
			System.out.println("Subtraction of 2 numbers: " + sub);
			System.out.println("division of 2 numbers: " + div);
			
//	5) Now take two numbers but should be of different data types and perform the similar math operations on
//     it and print on the screen.
			
			int k=5;
			float l=2.4f;
			float num1= (k/l);
			float num2= (k*l);
			float num3= (k+l);
			System.out.println("Number5:");
			System.out.println("Division of 2 numbers: " + num1);
			System.out.println("Muliplication of 2 numbers: " + num2);
			System.out.println("Addition of 2 numbers: " + num3);
			ODDorEVEN();
			
			
			
			
			
	}

		public static void ODDorEVEN() {
			// TODO Auto-generated method stub
			
// 6) Write a Pseudo code for the problem statement- User Enters 2 integers(numbers).
//	  Check and print “ODD” for the odd numbers and “Even” for the even numbers from the set of numbers entered 
//	  by the user.
			
			int a=6;
			int b=5;
			System.out.println("Number6:");
			if (a%2==0)
			{
			System.out.println("Even " + a);
			}
			else 
			{
			System.out.println("ODD " + a);
			}
			if (b%2==0)
			{
			System.out.println("Even " + b);
			}
			else 
			{
			System.out.println("ODD " + b);
			}
			
			
			
	}
					
			
			
}
		
		
		
	