
/**
* 
* This is a test program that does exactly what the 
*
* @author  Sam Catalfo
* @version 1.0
* @since   2020-10-05 
*/
package cse360assignment02;

public class MainTest {

	public static void main(String[] args) 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
	}

}
