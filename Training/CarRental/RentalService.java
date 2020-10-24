package Training.CarRental;

public class RentalService {
  // Attributes set
  private double pricePerHour;
  private double pricePerDay;

  private BrazilTaxService taxService;


  // Constructor Methods
  public RentalService() {

  }


  public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }


  // Special Methods (Getter && Setter)
  public double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(double pricePerHour) {
    this.pricePerHour = pricePerHour;
  }

  public double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public BrazilTaxService getBrazilTaxService() {
    return taxService;
  }

  public void setBrazilTaxService(BrazilTaxService taxService) {
    this.taxService = taxService;
  }

  
  // Methods
  public void processInvoice(CarRental carRental) {
    long t1 = carRental.getStart().getTime();
    long t2 = carRental.getFinish().getTime();
    double hours = (double)(t2 - t1) / 1000 / 60 / 60;

    double basicPayment;
    if (hours <= 12.0) {
      basicPayment = Math.ceil(hours) * pricePerHour;
    } else {
      basicPayment = Math.ceil(hours / 24) * pricePerDay;
    }

    double tax = taxService.tax(basicPayment);

    carRental.setInvoice(new Invoice(basicPayment, tax));
  }
}
