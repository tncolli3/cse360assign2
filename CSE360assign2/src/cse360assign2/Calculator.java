
package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * Class constructor.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the integer total.
	 * <p>
	 * This method returns the integer total.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * Adds together two numbers.
	 * <p>
	 * This method returns nothing but performs a simple add calculation.
	 * The parameter value is added to the total.
	 * @param value integer to be added to total.
	 */
	
	public void add (int value) {
		total += value;
	}
	
	
	/**
	 * Performs a simple subtraction.
	 * <p>
	 * This method returns nothing, but subtracts the parameter value from
	 * the total.
	 * @param value integer to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	
	/**
	 * Performs simple multiplication.
	 * <p>
	 * This method returns nothing, but multiplies the total by the value passed into
	 * the function.
	 * @param value integer to multiply by.
	 */
	public void multiply (int value) {
		total *=value;
	}
	
	
	
	/**
	 * performs integer division.
	 * <p>
	 * This method returns nothing, but divides the total by the 
	 * value passed into the method. If the value is zero, the total
	 * is set to zero and no division is performed.
	 * @param value integer to divide by.
	 */
	public void divide (int value) {
		if(value==0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	
	
	/**
	 * Returns the history of calculations
	 * <p>
	 * This function returns a string that contains all of the past
	 * operations. It contained the operators of the operations
	 * performed, and the values.
	 * @return  the history of calculations.
	 */
	public String getHistory () {
		return "";
	}
}