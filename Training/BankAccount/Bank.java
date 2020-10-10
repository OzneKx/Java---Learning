package Training.BankAccount;

public class Bank {
  // Atributes set
  public int accountNumber;
  protected String type;
  private String owner;
  private float balance;
  private boolean status;


  // Constructor Method
  public Bank() {
    this.setBalance(0);
    this.setStatus(false);
  }


  // Methods
  public void openAccount(String type) {
    this.setType(type);
    this.setStatus(true);
    if (type == "CC") {
      this.setBalance(50);
    } else if (type == "CP") {
      this.setBalance(150);
    } else {
      System.out.println("Não há outro tipo de conta além de CC e CP");
    }
    System.out.println(this.getType() + " aberta com sucesso em nome de " + this.getOwner());
  }

  public void closeAccount() {
    if (this.getBalance() > 0) {
      System.out.println("Não é possível fechar a conta, pois ainda há dinheiro nela!");
    } else if (this.getBalance() < 0) {
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
      if (this.getBalance() < 0) {
        System.out.println("Não foi possível depositar dinheiro. Conta está fechada!");
      } else if (this.getBalance() == 0) {
        System.out.println("Não foi possível depositar dinheiro. Conta está com saldo igual a zero!");
      } else {
        this.setBalance(this.getBalance() - value);
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


  public void currentStatus() {
    System.out.println("-------------------------");
    System.out.println("Conta: " + this.getAccountNumber());
    System.out.println("Tipo: " + this.getType());
    System.out.println("Dono: " + this.getOwner());
    System.out.println("Saldo: " + this.getBalance());
    System.out.println("Status: " + this.isStatus());
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
