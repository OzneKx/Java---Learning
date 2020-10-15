package Training.AbstractAccount;

public abstract class Account {
  // Attributes set
  private int number;
  private String holder;
  protected double balance;


  // Constructor method
  public Account() {

  }

  public Account(int number, String holder, double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }


// Special Methods (Getter && Setter)
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
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
  public void withdrawMoney(double amount) {
    if (this.balance >= 0) {
      this.balance -= (amount + 5.0);
    } else {
      System.out.println("Não há saldo suficiente para sacar");
    }
  }
  
  public void depositMoney(double amount) {
    this.balance += amount;
  }
}
