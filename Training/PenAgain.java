package Training;

public class PenAgain {
  // Attributes set (4)
  public String model;
  private float tip;
  private String color;
  private boolean is_open;

  // Method set (7)
  
   public PenAgain(String m, String c, float p) {
    this.model = m;
    this.color = c;
    this.tip = p;
    this.close();
    //Constructor Method
  } //

  public String getModel() {
    return this.model;
    // Getter Method 
  }

  public void setModel(String m) {
    this.model = m;
    // Setter Method
  }

  public float getTip() {
    return this.tip;
    // Getter Method
  }

  public void setTip(float t) {
    this.tip = t;
    // Setter Method
  }

  public void close() {
    this.is_open = true;
  }

  public void open() {
    this.is_open = false;
  }

  public void status() {
    System.out.println("\nEspecificações da caneta: ");
    System.out.println("Modelo: " + this.getModel());
    System.out.println("Ponta: " + this.getTip());
    System.out.println("Cor: " + this.color);
    System.out.println("Tempada? " + this.is_open);
  }
}
