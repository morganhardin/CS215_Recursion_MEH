/** This class has a main method that will instantiate
 * the RecDieRoller method and call the recursive roll
 * method. It will do this inside a while loop that
 * will continue to call that class as long as rolls
 * is less thn 1000, meaning the class will be called
 * 1000 times.
 * 
 * @author morganhardin
 *
 */
public class RecDieRollerDriver_2 
{
	/** This is the main method that instantiates the 
	 * RecDieRoller class and calls the recursive method
	 * 1000 times. It then finds the mean and returns
	 * that value.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		RecDieRoller roller = new RecDieRoller();
		int[] rolls = new int[1001];
		
		for (int i = 0; i < 1001; i++)
		{
			rolls[i] = roller.roll();
		}
		
		int num = 0;
		for (int j = 0; j < rolls.length; j++)
		{
			num = num + rolls[j];
		}
		
		System.out.println("\nDice was rolled " + roller.loop + " times to find the number " + roller.number + ".");
		System.out.println("\nThe mean is " + ((roller.loop)/1000) + ".");
	}
}

