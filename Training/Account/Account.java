package Training.Account;

public class Account {
  // Attributes set
  private int number;
  private String holder;
  private double balance;


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
      this.balance -= amount;
    } else {
      System.out.println("Não há saldo suficiente para sacar");
    }
  }
  
  public void depositMoney(double amount) {
    this.balance += amount;
  }
}