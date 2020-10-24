package Training.CarRental;

public class Invoice {
  // Attributes set
  private double basicPayment;
  private double tax;
  private double totalPayment;

  
  // Constructor Methods
  public Invoice() {

  }

  public Invoice(double basicPayment, double tax) {
    this.basicPayment = basicPayment;
    this.tax = tax;
  }


  // Special Methods (Getter && Setter)
  public double getBasicPayment() {
    return basicPayment;
  }

  public void setBasicPayment(double basicPayment) {
    this.basicPayment = basicPayment;
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double getTotalPayment() {
    return getBasicPayment() + getTax();
  }

  public void setTotalPayment(double totalPayment) {
    this.totalPayment = totalPayment;
  }
}
