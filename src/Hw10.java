import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {

		int i = GetUserInput();
		int random = RollDice(i);

		/*if (i == 1) {
			random = RollDice(6);
			
		} else if (i == 2) {
			random = RollDice(12);
			
		} else if (i == 3) {
			random = RollDice(18);
		
		} else {
			
			System.out.print("Bye bye!");

		}
		*/
		GuessPoint(random);
	}
	/**
	 * 
	 * @return number of dices to roll - 1,2,or 3
	 */
	public static int GetUserInput()
	{
		System.out.print("Roll Dice Game. How many dices do you want to play?");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.print(i);
		
		return i;
	}
	
	/**
	 * 
	 * @param  
	 * @return a random number
	 */
	public static void GuessPoint(int random)
	{
		System.out.print("Can you guess the point? ");
		Scanner userGuess = new Scanner(System.in);
		int userGuessNumber = userGuess.nextInt();
	
		if (userGuessNumber == random) {
			System.out.print("Correct!");
		} else {
			System.out.print("Sorry. Wrong!");
		}
		
		return;
	}
	
	public static int RollDice(int numberOfDices)
	{
		int random = 0;
		if(numberOfDices >= 1  && numberOfDices <=3){
			random =  (int) (Math.random() * numberOfDices * 6 + 1);
		}
		else {
			System.out.print("Bye bye!");
		}
		System.out.print("Random Number " + random);
		return random;
	}
	
	
	}

