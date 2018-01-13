import java.util.Random;
/**
 * Guessing number game
 * 
 * @author Kaninpat 5710546186
 *
 */
public class KaninpatGame extends NumberGame{

	//The upper bound number for the secret
	private int upperBound;
	//Secret is the answer
	private int secret;
	//Counter to count how many guesses the user makes
	private int counter;
	
	/**
	 * Initialize a new default game
	 * 
	 * @param upperBound is a bound for creating the secret
	 */
	public KaninpatGame(int upperBound) {
		
		//Construct a upperBound number
		this.upperBound = upperBound;
		
		//Random the secret
		Random r = new Random();
		int lowerBound = 1;
		this.secret = r.nextInt(upperBound) + lowerBound;
		
		//Starting message
		super.setMessage("Try to guess a number between " + lowerBound + " and " + upperBound + ".");
		
		//Default value for the amount of guesses
		this.counter = 0;
	}
	
	/**
	 * Evaluate a user's guess
	 * 
	 * @param number is the user's guess
	 * @return true if guess is correct, false otherwise
	 */
	public boolean guess(int number) {
		
		//Correct answer
		if(number == secret) {
			counter++;
			setMessage("Correct!");
			return true;
		}
		
		//Wrong answer
		if(number < secret) {
			setMessage(number + " is too small");
			counter++;
		}
		else if(number > secret) {
			setMessage(number + " is too large");
			counter++;
		}
		return false;
		
	}
	
	/**
	 * Get the game upper bound
	 */
	public int getUpperBound() {
		
		return this.upperBound;
		
	}
	
	/**
	 * Get the amount of guesses
	 */
	public int getCount() {
		
		return this.counter;
		
	}
	
	/**
	 * Describe the game
	 */
	public String toString() {
		
		return "This is a simple guessing number game.";
		
	}
}
