import java.util.Scanner; //Importing the scanner utility.

public class VowelCounter {
	
	  /*-----------------------------------------------------------------

	 	A program that will count vowels from a user input sentence.

	  -----------------------------------------------------------------*/

	public static void main(String[] args) {

		//Preparing for input.
		Scanner scn = new Scanner(System.in);
		
		int a = 0, e = 0, i = 0, o = 0, u = 0, z = 0;
		
		//Ask for the input.
		System.out.println("Enter any words and I will count the vowels: ");
		String wordInput=scn.nextLine();
		
		//Using the switch/break method and the for conditional.
		for(int x = 0; x < wordInput.length(); x++) {
			
			switch(wordInput.charAt(x)) {
			
			case 'a' : a++; break;
			case 'e' : e++; break;
			case 'i' : i++; break;
			case 'o' : o++; break;
			case 'u' : u++; break;
			default : z++;
										}
			
													}
		//Print the final results.
		System.out.println("The exact amount of the letter A is: "+a);
		System.out.println("The exact amount of the letter E is: "+e);
		System.out.println("The exact amount of the letter I is: "+i);
		System.out.println("The exact amount of the letter O is: "+o);
		System.out.println("The exact amount of the letter U is: "+u);
		System.out.println("..and you have this many that aren't vowels: "+z);
	}	
		
}
