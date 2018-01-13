import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {
	
	//Number to guess
	private int guess;

	/** play the game. */
	public int play(NumberGame game) {
		
		Scanner console = new Scanner(System.in);
		//Describe the game
		System.out.println( game.toString() );
		//Display range
		System.out.println( game.getMessage() );
		
		//Start guessing until the answer is correct
		boolean correct = false;
		while(!correct) {
			
			//Get user's input and show a hint
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
			System.out.println( game.getMessage() );
			
		}
		
		return guess;
		
	}
	
}
