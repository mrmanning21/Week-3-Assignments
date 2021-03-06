import java.util.Scanner; //bring in the Scanner utility.

public class EvenNumSum {
	
	  /*-----------------------------------------------------------------

	 	A program that gives you the sum of all even numbers between the number
	 	a user requests and the number 2. (Will error if less than 2)

	  -----------------------------------------------------------------*/

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		//Declare variables.
		int sum = 0, numb;
		
		//Ask for the integer.
		System.out.println("Please enter a number that is >= to 2: ");
		numb = scn.nextInt();
		
		//Error statement.
		if(numb < 2) {
			System.out.println("I'm sorry, the number you entered is less than 2. "
					+ "Please try again: ");
			numb = scn.nextInt();
					}
		
		//Math mode for finding evens and in-between numbers and sum.
		if(numb % 2 != 0) numb--;
			int x = numb/2;
			sum = (x+1)*x;
			
		System.out.println("The even number sum between 2 and the number you entered is: "+sum);
			
	}
}
