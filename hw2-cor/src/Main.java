/**
 * Package for Assignment2
 */
package hw2_cor;

import java.util.ArrayList;

/**
 * This class is main class used to creation of accounts and customer. This class is used to initiate and test the pay operation by Customer.
 * 
 * @author Kavitha Sridhar
 *
 */
public class Main {

  /**
   * This is the main method used to setup customer and the accounts owned by the customer as defined in the assignment
   * 
   * @param args No arguments needed
   */
  public static void main(String[] args) {
    
    Customer customer = new Customer();
    
    // Create a Customer with a checking account with $200
    BankAccount checking = new BankAccount("checking", 200);
    
    // Add a Savings BankAccount with $50
    BankAccount savings = new BankAccount("savings", 50);
    checking.setSuccessor(savings);
    
    // Add 3 CreditAccounts with three credit limits mentioned in the assignment
    CreditAccount credit1 = new CreditAccount("credit1",150);
    savings.setSuccessor(credit1);
    CreditAccount credit2 = new CreditAccount("credit2",220);
    credit1.setSuccessor(credit2);
    CreditAccount credit3 = new CreditAccount("credit3",5000);
    credit2.setSuccessor(credit3);

    // Associate accounts created to the customer
    customer.addAccount(checking);
    customer.addAccount(savings);
    customer.addAccount(credit1);
    customer.addAccount(credit2);
    customer.addAccount(credit3);

    //Customer initiates a payment of $9000
    customer.pay(5000);
         
    // Iterate over the Account list to check the account balances after payment
    System.out.println("\nCurrent balance in accounts");
    ArrayList<Account> accounts = customer.getAccounts();
    int size = accounts.size();
    for (int i = 0; i < size; i++) {
         accounts.get(i).getDetails();
    }
    
 }

}
