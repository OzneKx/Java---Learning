package Training;

public class Bank {
  // Attributes set
  public int account;
  protected String type;
  private String owner;
  private float evaluate; 
  private boolean status;

  // Construct Method
  public Bank() {
    this.setBalanceValue(0);
    this.setStatus(false);
  }

  // GETTER methods (5)
  public int getNumAccount() {
    return this.account;
  }

  public String getAccountType() {
    return this.type;
  }

  public String getOwnerName() {
    return this.owner;
  }

  public float getBalanceValue() {
    return this.evaluate;
  }

  public boolean getStatus() {
    return this.status;
  }

  // SETTER methods (5)
  public void setNumAccount(int accountNum) {
    this.account = accountNum;
  }

  public void setAccountType(String accountType) {
    this.type = accountType;
  }

  public void setOwnerName(String nameOwner) {
    this.owner = nameOwner;
  }

  public void setBalanceValue(float balance) {
    this.evaluate = balance;
  }

  public void setStatus(boolean currentStatus) {
    this.status = currentStatus;
  }

  // Methods set (5)
  public void openAccount(String accountType) {
    this.setAccountType(accountType);
    this.setStatus(true);
    if (type == "cc") {
      this.evaluate = 50;
    } else if (type == "cp") {
      this.evaluate = 150;
    }
  }

  public void closeAccount() {
    if (this.evaluate > 0) {
      System.out.println("ERRO! Ainda há dinheiro na conta.");
    } else if (this.evaluate < 0) {
      System.out.println("ERRO! A conta está em débito.");
    } else {
      this.setStatus(false);
    }
  }

  public void cashDeposit(float value) {
    if (this.getStatus()) {
      this.setBalanceValue(getBalanceValue() + value);
    } else {
      System.out.println("ERRO! É Impossível depositar, pois a conta está fechada.");
    }
  }

  public void withdrawMoney(float value) {
    if (this.getStatus()) {
      if (this.evaluate >= value) {
        this.setBalanceValue(getBalanceValue() - value);
      } else {
        System.out.println("ERRO! Saldo insuficiente.");
      }
    } else {
      System.out.println("ERRO! É Impossível sacar dinheiro, pois a conta está fechada.");
      } 
    }

  public void montlhyPayment() { 
    int paymentValue = 0;
    if (this.getAccountType() == "cc") {
      paymentValue = 12;
    } else if (this.getAccountType() == "cp") {
      paymentValue = 20;
    }
    if (this.getStatus()) {
      this.setBalanceValue(this.getBalanceValue() - paymentValue);
      System.out.println("Mensalidade de R$" + this.getBalanceValue() + " paga com sucesso!");
    } else {
      System.out.println("ERRO! Impossível pagar a mensalidade, pois a conta está fechada.");
    }
  }

  // Método personalizado
  public void currentStatus() {
    System.out.println("-------------------------------");
    System.out.println("Conta: " + this.getNumAccount());
    System.out.println("Tipo da conta: " + this.getAccountType());
    System.out.println("Dono da conta: " + this.getOwnerName());
    System.out.println("Saldo da conta: " + this.getBalanceValue());
    System.out.println("Status: " + this.getStatus());
    System.out.println("-------------------------------");
  }
}