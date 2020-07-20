import java.util.Random;
import java.util.Scanner; //bringing in the utility to run the Scanner and Randomizer.

public class AgeGuessWeek3 {

  /*-----------------------------------------------------------------

 	A program that asks for a Age Guess and lets you keep guessing.

  -----------------------------------------------------------------*/

public static void main(String[] args) { 
	
	Random gen = new Random();
	Scanner keyscan = new Scanner(System.in); //declaring scanner name, Randomizer name and a new object. 

	int ageGuess, age = gen.nextInt(100); //Adding int variables.

	String name;  

	System.out.print("Enter your name : "); //Prompt for user's info. 

	name=keyscan.nextLine();

	System.out.print("Guess the age I am thinking of : "); 

	ageGuess=keyscan.nextInt(); //Inputs age and moves on.  

	System.out.println("The name you have supplied is "+name); 
	
	//Using loops to get the age correct.
	while (ageGuess != age) {
	
    	if (ageGuess > age) { //If statement to start the guessing fun.

        System.out.println("You guessed wrong! Try again with a younger guess!");
    	
    	ageGuess = keyscan.nextInt();
    						}

    	if (ageGuess < age) {//If statements for wrong guesses.
    	
    	System.out.println("You guessed wrong! Try again with an older guess!");
    	
    	ageGuess = keyscan.nextInt();
    						}
		}
	
	System.out.println("Great! The age I was thinking of is : "+age);
 }
}