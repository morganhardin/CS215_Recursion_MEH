/** This RecDieRoller class will roll a dice
 * continuously until the number 2 is rolled.
 * 
 * @author morganhardin
 *
 */
public class RecDieRoller 
{
	/** These private integer variables 
	 * initiate number and loop as 
	 * variables inside this class that 
	 * will be used.
	 * 
	 */
	int number;
	int loop;
	
	/** This empty constructor sets the previous
	 * private variables number and loop
	 * equal to 0.
	 * 
	 */
	RecDieRoller()
	{
		number = 0;
		loop = 0;
	}
	
	/** This roll method takes no parameters and will
	 * continuously generate a random number between
	 * 1 and 6 to simulate a dice being rolled. If the
	 * number 2 is rolled, the program will stop. Otherwise,
	 * the program will recursively call itself and will
	 * generate another number, continuing this process
	 * until 2 is called.
	 * @return 
	 * 
	 */
	int roll()
	{
		number = (int) (Math.random() * 6) + 1;
		loop++;
		
		if (number == 2)
		{
			System.out.println(number);
		}
		else
		{
			System.out.println(number);
			roll();
		}
		
		return number;
	}
}

