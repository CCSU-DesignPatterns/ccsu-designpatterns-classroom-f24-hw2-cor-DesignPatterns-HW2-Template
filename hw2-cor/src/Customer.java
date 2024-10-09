package hw2_cor;

import java.util.ArrayList;

/**
 * This class implements the interface PayingParty to handle payment functionalities by Customer
 * 
 * @author Kavitha Sridhar
 *
 */
public class Customer implements PayingParty{

  //List of accounts owned by the customer
  private ArrayList<Account> accounts;
  
  public Customer ()
  {
    this.accounts = new ArrayList<>();
  }
 
  /**
   * This method is used to process payment through CheckProcessor
   * 
   * @param amount This is the amount that needs to be paid
   * @return None
   */
  @Override
  public void pay(double amount)  {
    
    CheckProcessor processor = new CheckProcessor();
    Boolean checkProcessStatus = processor.processCheck((BankAccount)accounts.get(0), amount);
    if (checkProcessStatus)
      System.out.println("Payment is processed");
    else
      System.out.println("You have insufficient funds in your accounts" );
    return;
    
  }

  /**
   * This method is used to add an account to customer.
   * 
   * @param Account New account that needs to be added to the list of accounts owned by the customer
   * @return None
   */
  public void addAccount(Account account) {
    accounts.add(account);
  }

  /**
   * This method is used to get the list of accounts owned by a customer. The account could be a BankAccount or Credit Account.
   * 
   * @param None
   * @return accounts returns of list of accounts owned by Customer. 
   */
  public ArrayList<Account> getAccounts() {
    return accounts;
  }

}
