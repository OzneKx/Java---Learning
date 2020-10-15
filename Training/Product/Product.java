package Training.Product;

public class Product {
  // Attributes set
  private String name; 
  private double price;


  // Constructor Method
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }


  // Special Methods (Getter && Setter)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  // Methods
  public String priceTag() {
    return name + " $" + String.format("%.2f", price);
  }
}
