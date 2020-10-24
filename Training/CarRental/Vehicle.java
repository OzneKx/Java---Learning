package Training.CarRental;

public class Vehicle {
  // Attributes set
  private String model;


  // Constructo Methods
  public Vehicle() {
    
  }
  
  public Vehicle(String model) {
    this.model = model;
  }


  // Special Methods (Getter && Setter)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}
