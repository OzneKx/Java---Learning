package Training.Account;

public class Program {
  public static void main(String[] args) {
    // UPCASTING
    Account account1 = new SavingsAccount(1005, "Cleiton", 1000.0, 0.01);
    account1.withdrawMoney(200.0);
    System.out.println(account1.getBalance());
    Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWNCASTING
    BusinessAccount account4 = (BusinessAccount)account2;
    account4.loan(100.0);

    /* BusinessAccount account5 = (BusinessAccount)account3; */
    if (account3 instanceof BusinessAccount) {
      BusinessAccount account5 = (BusinessAccount)account3;
      account5.loan(200.0);
      System.out.println("Loan!");
    }
    
    if (account3 instanceof SavingsAccount) {
      SavingsAccount account5 = (SavingsAccount)account3;
      account5.updateBalance();
      System.out.println("Update!");
    }

    Account account5 = new BusinessAccount(1005, "Cléber", 1000.0, 500.0);
    account5.withdrawMoney(200.0);
    System.out.println(account5.getBalance());
  }
}
