/**
 * Automatically find the secret to any NumberGame
 * 
 * @author Kaninpat 5710546186
 *
 */
public class GameSolver {
	
	//Words to find in a hint
	private final String tooSmall = "too small";
	private final String tooLarge = "too large";
	
	/**
	 * Play a NumberGame and do the guessing stuff
	 * then return the solution
	 * 
	 * @param game is the NumberGame to solve
	 * @return guess is the secret number
	 */
	public int play(NumberGame game) {
		
		//Finding a first number to guess
		int lowerBound = 1;
		int upperBound = game.getUpperBound();
		int guess = lowerBound + (upperBound - lowerBound) / 2;
		
		//Start guessing until the answer is correct
		boolean correct = false;
		while (!correct) {
			
			correct = game.guess(guess);

			if(correct) {
				break;
			}
			//Look for a hint and guess a new number
			String msg = game.getMessage().toLowerCase();
			if (msg.contains(tooSmall)) {
				lowerBound = guess + 1;
				guess = (upperBound + lowerBound) / 2;
			}
			else if (msg.contains(tooLarge)) {
				upperBound = guess - 1;
				guess = (upperBound + lowerBound) / 2;
			}
			
			if(lowerBound > upperBound || upperBound < lowerBound) {
				break;
			}
			
		}
		
		return guess;
		
	}
	
}
