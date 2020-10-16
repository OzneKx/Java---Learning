package Training.TaxPay;

public abstract class TaxPayer {
  // Attributes set
  private String name;
  private double anualIncome;


  // Constructor Method
  public TaxPayer() {

  }

  public TaxPayer(String name, double anualIncome) {
    this.name = name;
    this.anualIncome = anualIncome;
  }


  // Special Methods (Getter && Setter)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAnualIncome() {
    return anualIncome;
  }

  public void setAnualIncome(double anualIncome) {
    this.anualIncome = anualIncome;
  }


  // Methods
  public abstract double tax();
}
