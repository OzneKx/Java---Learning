package Training.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Used extends Product {
  // Attributes set
  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  private Date manufactureDate;


  // Construtor Method
  public Used(String name, double price, Date manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }


  // Special Methods (Getter && Setter)
  public Date getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  
  // Methods
  @Override
  public String priceTag() {
    return getName() 
    + " (used) $" 
    + String.format("%.2f", getPrice())
    + " (Manufacture date: "
    + sdf.format(manufactureDate)
    + ")";
  }
}
