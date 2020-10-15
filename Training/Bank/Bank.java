package Training.Bank;

public class Bank {
  // Attributes set
  private int number;
  private String holder;
  private double balance;


  // Constructor Method
  public Bank(int number, String holder) {
    this.number = number; 
    this.holder = holder;
  }

  public Bank(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    depositMoney(initialDeposit);
  }


  // Special Methods (Getter && Setter)
  public int getNumber() {
    return number;
  }

  public String getHolder() {
    return holder;
  }
  
  public void setHolder(String holder) {
    this.holder = holder;
  }
  
  public double getBalance() {
    return balance;
  }


  // Methods
  public void depositMoney(double amount) {
    if (this.getBalance() >= 0 ) {
      this.balance += amount;
    } else {
      System.out.println("Você já está devendo dinheiro");
    }
  }

  public void withdrawMoney(double amount) {
    this.balance -= amount + 5.0;
  }


  @Override
  public String toString() {
    return "Account " + this.getNumber() + ", Holder: " 
    + this.getHolder() + ", Balance: $" + String.format("%.2f", this.getBalance());
  }
}
