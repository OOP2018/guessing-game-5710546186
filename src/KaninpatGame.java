import java.util.Random;

public class KaninpatGame extends NumberGame{

	private int upperBound;
	private int secret;
	private int counter;
	
	public KaninpatGame(int upperBound) {
		
		//construct a upperbound number
		this.upperBound = upperBound;
		
		//random a secret number
//		Random r = new Random();
		int lowerBound = 0;
//		this.secret = r.nextInt(upperBound-lowerBound) + lowerBound;
		this.secret = 8;
		
		//starting message
		super.setMessage("Try to guess a number between " + lowerBound + " and  " + upperBound + ".");
		
		//counter to count how many guesses the user makes
		this.counter = 0;
	}
	
	public boolean guess(int number) {
		//correct answer
		if(number == secret) {
			counter++;
			setMessage("Correct!");
			return true;
		}
		
		//wrong answer
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
	
	public int getUpperBound() {
		
		return this.upperBound;
		
	}
	
	
	public int getCount() {
		
		return this.counter;
		
	}
	
	public String toString() {
		
		return "This is a simple guessing number game.";
		
	}
}
