package Training;

public class Pen {
  // Attributes (5)
  public String model;
  public String color;
  private float tip;
  protected int filled;
  private boolean is_open;
  
  // Methods (4)
  public void status() {
    System.out.println("Uma caneta " + this.color +"." );
    System.out.println("Seu modelo é " + this.model +".");
    System.out.println("Tamanho da ponta: " + this.tip + ".");
    System.out.println("Sua carga é de: " + this.filled + ".");
    System.out.println("Ela está tampada? " + this.is_open +".");
  }

  public void scribble() {
    if (this.is_open == true) {
      System.out.println("Ela está tampada, logo não poderá rabiscar.");
    } else {
      System.out.println("Rabisque a vontade :)");
    }
  } 

  public void close() {
    this.is_open = true;
  }

  public void open() {
    this.is_open = false;
  }
}