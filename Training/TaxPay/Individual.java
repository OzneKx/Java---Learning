package Training.TaxPay;

public class Individual extends TaxPayer {
  // Attributes set
  private double healthExpenditures;

  // Constructor Methods
  public Individual() {

  }

  public Individual(String name, double anualIncome, double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public double tax() {
    if (getAnualIncome() < 20000.0) {
      return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
  }


  // Special Methods (Getter && Setter)
  public double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }
}
