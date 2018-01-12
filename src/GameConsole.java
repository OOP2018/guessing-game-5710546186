import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {
	
	private boolean correct = false;
	private int guess;

	/** play the game. */
	public int play(NumberGame game) {
		
		Scanner console = new Scanner(System.in);
		
		//describe the game
		System.out.println( game.toString() );
		
		//display range
		System.out.println( game.getMessage() );
		
		while(correct == false) {
			
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
			System.out.println( game.getMessage() );
			
		}
		
		return guess;
		
	}
	
}
