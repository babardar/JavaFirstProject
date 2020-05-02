
public class W3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Concatenate Variables
		String firstName = "Imtiaz ";
		String lastName = "Ashraf";
		System.out.println(firstName.concat(lastName));
		
		
//		ternary operator
		int a = 15;
		String result = (a < 18) ? "Good day. ": "Good evening. ";
		System.out.println(result);
		
		
/*		Insert the missing parts to handle the error in the code below.
		try
		{
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		} 
		catch (Exception e) {
			System.out.println("Something went wrong.");
			}*/
		
		
//		Insert the missing keyword to execute code, after try..catch, regardless of the result.
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} 
		finally
		{
			System.out.println("The 'try catch' is finished.");
		}
	}

}
