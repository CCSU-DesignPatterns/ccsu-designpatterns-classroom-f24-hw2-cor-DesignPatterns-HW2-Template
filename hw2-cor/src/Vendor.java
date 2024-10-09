package hw2_cor;

/**
 * This class implements the interface PayingParty to handle payment functionalities by Vendor
 * 
 * @author Kavitha Sridhar
 *
 */
public class Vendor implements PayingParty{

  /**
   * This method is used by Vendor to make payment.
   * 
   * @param amount This is the amount that needs to be paid
   * @return None
   */
  @Override
  public void pay(double amount) {
    System.out.println("Vendor made payment");
  }

}
