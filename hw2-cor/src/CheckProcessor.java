package hw2_cor;

/**
 * This class is used to process the check
 * 
 * @author Kavitha Sridhar
 *
 */
public class CheckProcessor {
  
/**
 * This method is used to process a check by deducting the amount from the bank account
 * 
 * @param amount This is the amount that needs to be paid
 * @param account This is the checking account from which the attempt to make the payment would start
 * @return true - if the process to check is successful
 * @return false - if the process to check is failed due to insufficient funds in the account
 */
  public boolean processCheck(BankAccount account, double amount){
    try {
      account.deduct(amount);
      return true;
    }
    catch (InsufficientFundsException e)
    {
      return false;
    }
  }

}
