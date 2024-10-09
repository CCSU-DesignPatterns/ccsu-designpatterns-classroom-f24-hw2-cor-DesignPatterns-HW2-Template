package hw2_cor;

/**
 * This Abstract Account class representing a generic account
 * 
 * @author Kavitha Sridhar
 *
 */
public abstract class Account {
  
  //Holds the handle to the next account owned by the customer
  protected Account successor;
  //Holds the type of the account which could be checking or saving
  protected String type;
  //Holds the amount available in the account
  protected double balance;
  
  /**
   * Abstract method to deduct an amount from the account
   * 
   * @param amount This is amount that needs to be paid towards cheque
   * @return None
   */
  public abstract void deduct (double amount) throws InsufficientFundsException;

  /**
   * Method used to set the handle to next account owned by the customer
   * 
   * @param account account object owned by the customer
   * @return None
   */
  public void setSuccessor(Account account) {
    this.successor = account;
  }

/**
 * Method used to get the type (checking or savings) of the account
 * 
 * @param None
 * @return None
 */
  protected String getType() {
    return type;
  }

/**
 * Method used to get the type (checking or savings) and balance in the account
 * 
 * @param None
 * @return None
 */
  public void getDetails() {
    System.out.printf("Type = %s Account balance= %f\n", type,balance);
  }
}
