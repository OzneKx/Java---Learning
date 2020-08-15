package Training;

public class Bank_ {
  public static void main(String[] args) {
    // Creating client1 who is Jubileu
    Bank client1 = new Bank();

    // Setting attributes to Jubileu
    client1.setNumAccount(1111);
    client1.setOwnerName("Jubileu");
    client1.openAccount("cp");

    // Creating client2 who is Creusa
    Bank client2 = new Bank();

    // Setting attributes to Creusa
    client2.setNumAccount(2222);
    client2.setOwnerName("Creusa");
    client2.openAccount("cc");

    // Cash deposit
    client1.cashDeposit(300);
    client2.cashDeposit(500);
    
    // Withdraw cash
    client1.withdrawMoney(450);
    client2.withdrawMoney(550);

    // Cash deposit
    client1.cashDeposit(3000);
    client2.cashDeposit(5000);

    // Close account
    client1.closeAccount();
    client2.closeAccount();

    // Withdraw cash
    client1.withdrawMoney(3000);
    client2.withdrawMoney(5000); 

    // Montlhy payment
    client1.montlhyPayment();
    client2.montlhyPayment();

    // Close account
    client1.closeAccount();
    client2.closeAccount();

    // Cash deposit
    client1.cashDeposit(3000);
    client2.cashDeposit(5000);

    // Showing the current status of clients account
    client1.currentStatus();
    client2.currentStatus();
  }
}