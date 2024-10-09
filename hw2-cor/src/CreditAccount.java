package hw2_cor;

/**
 * This class CreditAccount extends from the Account. This class holds methods specific to Credit accounts
 * 
 * @author Kavitha Sridhar
 *
 */
public class CreditAccount extends Account{

  public CreditAccount(String type, double balance) {
    this.type = type;
    this.balance = balance;
  }
  
  /**
   * This method deducts an amount from the credit account. If the credit limit is not sufficient 
   * then the availability of funds in the next account is checked. If there are no accounts then 
   * InsufficientFundsException exception is thrown
   * 
   * @param amount This is amount that needs to be paid towards cheque
   * @return None
   */
  @Override
  public void deduct(double amount) throws InsufficientFundsException {
    System.out.printf("Type = %s Account balance= %f amount due = %f\n", type,balance, amount);
    if(balance >= amount) {
      balance -= amount;
    } else if (successor != null ) {
        successor.deduct(amount-balance);
        balance = 0;
    } else {
        throw new InsufficientFundsException();
    }
  }

  /**
   * This method to add balance to the credit account
   * 
   * @param amount This is amount that needs to be added to the account
   * @return None
   */
  public void charge(double amount) {
    balance += amount;
  }
}
