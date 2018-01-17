/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	
	public static void main(String[] args) {
		
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new KaninpatGame(upperBound);
		GameSolver ui = new GameSolver( );
		int solution = ui.play( game );
		
		//Display the answer returned by play
		System.out.println("Answer is " + solution);
		
		//Display how many guesses the user made
		System.out.println(game.getCount() + " guess/es counted.");
		
		//Verify answer
		System.out.println("game.guess returns " + game.guess(solution));
		
	}
	
}
