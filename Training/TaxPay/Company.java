package Training.TaxPay;

public class Company extends TaxPayer {
  // Attributes set
  private int numberOfEmplyees;

  // Constructor Methods
  public Company() {

  }

  public Company(String name, double anualIncome, int numberOfEmplyees) {
    super(name, anualIncome);
    this.numberOfEmplyees = numberOfEmplyees;
  }

  @Override
  public double tax() {
    if (numberOfEmplyees > 10) {
      return getAnualIncome() * 0.14;
    } else {
      return getAnualIncome() * 0.16;
    }
  }


  // Special Methods (Getter && Setter)
  public int getNumberOfEmplyees() {
    return numberOfEmplyees;
  }

  public void setNumberOfEmplyees(int numberOfEmplyees) {
    this.numberOfEmplyees = numberOfEmplyees;
  }
}
