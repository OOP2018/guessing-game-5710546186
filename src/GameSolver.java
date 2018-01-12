
public class GameSolver {

	private int guess;
	private boolean correct = false;
	
	private String tooSmall = "small";
	private String tooLarge = "large";
	
	private int lowerBound;
	private int upperBound;
	
	public int play(NumberGame game) {
		
		//describe the game
		System.out.println( game.toString() );
				
		//display range
		System.out.println( game.getMessage() );
		
		this.guess = game.getUpperBound() / 2;
		
		this.lowerBound = 0;
		this.upperBound = game.getUpperBound();
				
		while(correct == false) {
			
			System.out.println("I think of " + guess);
			correct = game.guess(guess);
			System.out.println(game.getMessage());
			
			if(game.getMessage().toLowerCase().indexOf(tooSmall.toLowerCase()) != -1) {
				this.lowerBound = this.guess;
				this.guess = (this.upperBound + guess) / 2;
			}
			else if(game.getMessage().toLowerCase().indexOf(tooLarge.toLowerCase()) != -1) {
				this.upperBound = this.guess;
				this.guess = (this.lowerBound + guess) / 2;
			}
			else {
				correct = true;
				break;
			}

		}
		
		return guess;
		
	}
	
}
