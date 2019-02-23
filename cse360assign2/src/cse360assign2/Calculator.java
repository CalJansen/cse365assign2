package cse360assign2;

/**
 * Name: Callan Jansen 
 * Class ID: CSE360 #11369 
 * Assignment #2 
 * Description: Practice with a version control system. 
 * The Calculator class has a single variable that holds the total.
 * The class also has methods for basic arithmetic operations. In addition,  
 * it has an accessor method to return the total and a history method that 
 * returns a String.
 */

public class Calculator
{
	private int total;

	/**
	 * Class constructor.
	 */
	public Calculator()
	{
		total = 0; // not needed - included for clarity
	}
	
	/**
	 * Getter method for the total variable.
	 * 
	 * @return returns the current total.
	 */
	public int getTotal()
	{
		return 0;
	}

	/**
	 * Takes in a single parameter and adds it to the running total.
	 * 
	 * @param value contains the int that will be added to the total.
	 */
	public void add(int value)
	{

	}

	/**
	 * Takes in a single parameter and subtracts it from the running total.
	 * 
	 * @param value  contains the int that will be subtracted from the total.
	 */
	public void subtract(int value)
	{

	}

	/**
	 * Takes in a single parameter and multiplies it by the running total.
	 * 
	 * @param value contains the int that the total will by multiplied by.
	 */
	public void multiply(int value)
	{

	}

	/**
	 * Takes in a single parameter and divides the total by the parameter.
	 * 
	 * @param value contains the int that the total will be divided by.
	 */
	public void divide(int value)
	{

	}

	/**
	 * Will return a history of all actions as a String.
	 * <p>
	 * The return string will separate all values and operations by a space.
	 * There is no limit set for the return String.
	 * 
	 * @return this returns all previous actions performed as a String.
	 */
	public String getHistory()
	{
		return "";
	}
}
