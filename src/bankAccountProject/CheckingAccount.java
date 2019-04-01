/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class CheckingAccount extends BankAccount {
// Data Fields
	private int accountNumber = 00001;
	private double value = 0;
	
// Constructors
	/**	
	 * The CheckingAcoount default constructor method
	 * Purpose: Creates a CheckingAccount object that inherits the super data fields
	 * @param void
	 * @return void
	 */
	public CheckingAccount() {
		super();
	}
	
	/**	
	 * The CheckingAcoount constructor method
	 * Purpose: Creates a CheckingAccount object with parameters
	 * @param int
	 * @param double
	 * @param double
	 * @return void
	 */
	public CheckingAccount(int accountNumber, double interestRate, double value) {
		this.accountNumber = accountNumber;
		this.value = value;
	}
	
	/**	
	 * The CheckingAcoount constructor method
	 * Purpose: Creates a CheckingAccount object that with specified data fields
	 * @param String
	 * @param int
	 * @param double
	 * @param int
	 * @param double 
	 * @param double
	 * @return void
	 */
	public CheckingAccount(String accountName, int routingNumber, double value, int accountNumber) {
		super();
		this.accountNumber = accountNumber;
		this.value = value;
	}
// Methods
	/**	
	 * The getAccountNumber method
	 * Purpose: gets the accountNumber
	 * @param void
	 * @return accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**	
	 * The getValue method
	 * Purpose: gets the value
	 * @param void
	 * @return value
	 */
	public double getValue() {
		return value;
	}
	
	/**	
	 * The setAccountNumber method
	 * Purpose: sets the accountNumber
	 * @param int
	 * @return void
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**	
	 * The setValue method
	 * Purpose: sets the value
	 * @param double
	 * @return void
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**	
	 * The toString method
	 * Purpose: displays the account information correctly
	 * @param void
	 * @return void
	 */
	public String toString() {
		return "";
	}

}
