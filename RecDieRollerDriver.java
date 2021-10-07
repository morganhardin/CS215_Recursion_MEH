/** This class instantiates a new variation of the
 * RecDieRoller class and calls the recursive method
 * roll.
 * 
 * @author morganhardin
 *
 */
public class RecDieRollerDriver 
{
	/** This main method calls the RecDieRoller class
	 * through its instantiation. That method will
	 * roll a dice continuously until the number 2 is
	 * rolled, stopping the program and printing the
	 * number of times the dice was rolled.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		RecDieRoller roller = new RecDieRoller();
		roller.roll();
		
		System.out.println("\nDice was rolled " + roller.loop + " times to find the number " + roller.number + ".");
		
	}
}
