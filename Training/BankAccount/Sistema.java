package Training.BankAccount;

public class Sistema {
  public static void main(String[] args) {
    Bank p1 = new Bank();
    p1.setAccountNumber(1111);
    p1.setOwner("Jubileu");
    p1.openAccount("CC");
  
    Bank p2 = new Bank();
    p2.setAccountNumber(2222);
    p2.setOwner("Creuza");
    p2.openAccount("CP");  
    
    p1.cashDeposit(100);
    p2.cashDeposit(500);

    p1.drawMoney(150);
    p1.closeAccount();

    p1.currentStatus();
    p2.currentStatus();
  } 
}
