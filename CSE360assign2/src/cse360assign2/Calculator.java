
package cse360assign2;

public class Calculator {

	private int total;
	private String history= "";
	
	/**
	 * Class constructor.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history=String.valueOf(total);
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
	 * The parameter value is added to the total and the calculation is added
	 * to the history.
	 * @param value integer to be added to total.
	 */
	
	public void add (int value) {
		total += value;
		history=history+" + "+ value;
	}
	
	
	/**
	 * Performs a simple subtraction.
	 * <p>
	 * This method returns nothing, but subtracts the parameter value from
	 * the total and adds the calculation to the history.
	 * @param value integer to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
		history=history+" - "+ value;
	}
	
	
	/**
	 * Performs simple multiplication.
	 * <p>
	 * This method returns nothing, but multiplies the total by the value passed into
	 * the function and adds the calculation to the history.
	 * @param value integer to multiply by.
	 */
	public void multiply (int value) {
		total *=value;
		history=history+" * "+ value;
	}
	
	
	
	/**
	 * performs integer division.
	 * <p>
	 * This method returns nothing, but divides the total by the 
	 * value passed into the method. If the value is zero, the total
	 * is set to zero and no division is performed.
	 * The calculation is then added to the history.
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
		
		history=history+" / "+ value;
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
		return history;
	}
}