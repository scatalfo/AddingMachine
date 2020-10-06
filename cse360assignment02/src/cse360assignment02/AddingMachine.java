/**
* 
* This program is an adding machine/calculator created for CSE 360 Class that actively keeps a receipt of all transactions
*
* @author  Sam Catalfo
* @version 1.0
* @since   2020-10-05 
*/
package cse360assignment02;

public class AddingMachine 
{
	  private int total;
	  private String receipt;
	  
	  public AddingMachine () 
	  {
	    total = 0;  // not needed - included for clarity
	    receipt = "0 "; //starting the receipt with the initial 0 value 
	  }
	  
	  public int getTotal () 
	  { //returns the current value of total
		  return total;
	  }
	  
	  public void add (int value) 
	  { 
		  total+=value; //adds value to total
		  receipt= receipt + "+ "+ value + " "; //updates the receipt with the new addition operation
	  }

	  public void subtract (int value) 
	  { 
		  total-=value; //subtracts value from total
		  receipt= receipt + "- "+ value + " "; //updates the receipt with the new subtraction operation
	  }

	  public String toString () 
	  {//returns the current receipt
	    return receipt;
	  }

	  public void clear() 
	  {//clears the receipt and updates it with the current value of total
		  receipt = total + " ";
	  }
}
