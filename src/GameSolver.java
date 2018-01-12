
public class GameSolver {
	
	private final String tooSmall = "too small";
	private final String tooLarge = "too large";
	
	public int play(NumberGame game) {
		
		//describe the game
		System.out.println( game.toString() );
				
		//display range
		System.out.println( game.getMessage() );
		
		int lowerBound = 1;
		int upperBound = game.getUpperBound();
				
		int guess = (lowerBound + upperBound) / 2;
		
		boolean correct = false;
		while (!correct) {
			
			System.out.println("I think of " + guess);
			correct = game.guess(guess);
			System.out.println(game.getMessage());
			
			String msg = game.getMessage().toLowerCase();
			if (msg.indexOf(tooSmall) != -1) {
				lowerBound = guess + 1;
				guess = (upperBound + lowerBound) / 2;
			}
			else if (msg.indexOf(tooLarge) != -1) {
				upperBound = guess - 1;
				guess = (upperBound + lowerBound) / 2;
			}
			else {
				correct = true;
				break;
			}

		}
		
		return guess;
		
	}
	
}
