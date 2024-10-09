package hw2_cor;

/**
 * This class implements Custom exception for handling insufficient funds
 * 
 * @author Kavitha Sridhar
 *
 */
public class InsufficientFundsException extends Exception {

  /**
   * This method customizes the exception message for insufficient funds
   * 
   * @param None
   * @return None
   */
  public InsufficientFundsException() {
    super("You have insufficient funds in your accounts");
  }

}
