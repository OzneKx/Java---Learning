package Training.Worker;

public class OutsourceEmployee extends Employee {
  // Attributes set
  private double additionalCharge;


  // Constructor Methods
  public OutsourceEmployee() {
    super();
  }

  public OutsourceEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
  }


  // Special Methods (Getter && Setter) 
  public double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }


  // Methods
  public double payment() {
    double value = super.payment();
    return value += (additionalCharge * 1.1);
  }
}
