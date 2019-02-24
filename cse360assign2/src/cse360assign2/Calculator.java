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
	private String history = "0";	// history of all actions, initialized to 0

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
		return this.total;
	}

	/**
	 * Takes in a single parameter and adds it to the running total.
	 * <p>
	 * Updates history with the operation and value.
	 * 
	 * @param value contains the int that will be added to the total.
	 */
	public void add(int value)
	{
		total = total + value;
		history = history + " " + "+" + " " + value;
	}

	/**
	 * Takes in a single parameter and subtracts it from the running total.
	 * <p>
	 * Updates history with the operation and value.
	 * 
	 * @param value  contains the int that will be subtracted from the total.
	 */
	public void subtract(int value)
	{
		total = total - value;
		history = history + " " + "-" + " " + value;
	}

	/**
	 * Takes in a single parameter and multiplies it by the running total.
	 * <p>
	 * Updates history with the operation and value.
	 * 
	 * @param value contains the int that the total will by multiplied by.
	 */
	public void multiply(int value)
	{
		total = total * value;
		history = history + " " + "*" + " " + value;
	}

	/**
	 * Takes in a single parameter and divides the total by the parameter.
	 * <p>
	 * Updates history with the operation and value. If parameter is 0, total
	 * is reset to 0. 
	 * 
	 * @param value contains the int that the total will be divided by.
	 */
	public void divide(int value)
	{
		if(value == 0)
		{
			total = 0;
			history = history + " " + "/" + " " + value;
		} else
		{
			total = total / value;
			history = history + " " + "/" + " " + value;
		}
	}

	/**
	 * Will return a history of all actions as a String.
	 * <p>
	 * The return string will separate all values and operations by a space.
	 * There is no length limit for the return String.
	 * 
	 * @return this returns all previous actions performed as a String.
	 */
	public String getHistory()
	{
		return this.history;
	}
}
