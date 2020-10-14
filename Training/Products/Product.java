package Training.Products;

public class Product {
  // Attributes set
  private String name;
  private double price;
  private int quantity;
  

  // Constructor Method
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Constructor Method (Overcharge)
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

  public int getQuantity() {
    return quantity;
  }
  

  // Methods
  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  @Override
  public String toString() {
    return name + ", price: $" + String.format("%.2f", price) + ", quantity: " 
    + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
  }
}