package Training.Account;

public class BusinessAccount extends Account {
  // Attributes set
  private double loanLimit;

  // Constructor Method
  public BusinessAccount() {
    super();
  }

  public BusinessAccount(int number, String holder, double balance, double amount) {
    super(number, holder, balance);
    this.loanLimit = amount;
  }

  // Special Methods (Getter && Setter)
  public double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(double loanLimit) {
    this.loanLimit = loanLimit;
  }

  // Methods
  @Override
  public void withdrawMoney(double amount) {
    super.withdrawMoney(amount);
    balance -= 2.0;
  }

  public void loan(double amount) {
    if (amount <= loanLimit) {
      balance += amount - 10.0;
    }
  }
}
