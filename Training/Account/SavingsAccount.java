package Training.Account;

public class SavingsAccount extends Account {
  // Attributes set
  private double interestRate;

  
  // Constructor method
  public SavingsAccount() {
    super();
  }

  public SavingsAccount(int number, String holder, double balance, double amount) {
    super(number, holder, balance);
    this.interestRate = amount;
  }


  // Special Methods (Getter && Setter)
  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }


  // Methods
  public void updateBalance() {
    balance += balance * interestRate;
  }
}
