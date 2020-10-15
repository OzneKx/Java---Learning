package Training.Product;

public class Imported extends Product {
  // Attributes set
  private double customsFee;

  // Constructor Method
  public Imported(String name, double price, double customsFee) {
    super(name, price);
    this.customsFee = customsFee;
  }

  // Special Methods (Getter && Setter)
  public double getCustomsFee() {
    return customsFee;
  }

  public void setCustomsFee(double customsFee) {
    this.customsFee = customsFee;
  }

  // Methods
  public double totalPrice() {
    return getPrice() + customsFee;
  }

  
  @Override
  public String priceTag() {
    return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ "
        + String.format("%.2f", customsFee) + ")";
  }
}
