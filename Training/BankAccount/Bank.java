package Training.BankAccount;

public class Bank {
  // Atributes set
  public int accountNumber;
  protected String type;
  private String owner;
  private float balance;
  private boolean status;


  // Constructor Method
  public Bank(int accountNumber, String type, String owner, float balance, boolean status) {
    this.accountNumber = accountNumber;
    this.type = type;
    this.owner = owner;
    this.balance = balance;
    this.status = status;
  }


  // Methods
  public void openAccount(String type) {
    this.setType(type);
    this.setStatus(true);
    if (type == "CC") {
      this.balance = 50;
      System.out.println("Conta corrente aberta com sucesso em nome de " + this.getOwner());
    } else if (type == "CP") {
      this.balance = 150;
      System.out.println("Conta poupança aberta com sucesso em nome de " + this.getOwner());
    } else {
      System.out.println("Não há outro tipo de conta além de CC e CP");
    }
  }

  public void closeAccount() {
    if (this.balance > 0 ) {
      System.out.println("Não é possível fechar a conta, pois ainda há dinheiro nela!");
    } else if (this.balance < 0 ) {
      System.out.println("Não é possível fechar a conta, pois ainda está devendo dinheiro!");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso em nome de " + this.getOwner() + "!");
    }
  }

  public void cashDeposit(float value) {
    if (this.isStatus()) {
      this.setBalance(getBalance() + value);
      System.out.println("Depósito de " + this.getBalance() + " feito em nome de " + this.getOwner());
    } else {
      System.out.println("Não foi possível fazer depoósito. Conta está fechada!");
    }
  }

  public void drawMoney(float value) {
    if (this.isStatus()) {
      if (this.balance < 0) {
        System.out.println("Não foi possível depositar dinheiro. Conta está fechada!");
      } else if (this.balance == 0) {
        System.out.println("Não foi possível depositar dinheiro. Conta está com saldo igual a zero!");
      } else {
        this.setBalance(getBalance() - value);
        System.out.println("Saque de " + this.getBalance() + " feito em nome de " + this.getOwner());
      }
    } else {
      System.out.println("Não foi possível fazer saque. Conta está fechada!");
    } 
  }

  public void monthlyPayment() {
    int paymentValue = 0;
    if (this.getType() == "CC") {
      paymentValue = 12;
      System.out.println("Valor mensal de R$12,00 cobrados por conta corrente.");
    } else if (this.getType() == "CP") {
      paymentValue = 20;
      System.out.println("Valor mensal de R$20,00 cobrados por conta poupança.");
    }
    if (this.isStatus()) {
      this.setBalance(this.getBalance() - paymentValue); 
      System.out.println("Mensalidade paga com sucesso!");
    } else {
      System.out.println("Não foi possível cobrar mensalidade. Conta está fechada!");
    }
  }


  @Override
  public String toString() {
    return "Bank [accountNumber=" + accountNumber + 
           ", balance=" + balance + 
           ", owner=" + owner + 
           ", status=" + status +
           ", type=" + type + "]";
  }
  


  // Special Methods (Getter && Setter)
  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
