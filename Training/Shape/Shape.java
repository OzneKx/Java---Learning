package Training.Shape;

public abstract class Shape {
  // Attributes set
  private Color color;


  // Constructor Method
  public Shape() {
    
  }

  public Shape(Color color) {
    this.color = color;
  }


  // Special Methods (Getter && Setter)
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }


  // Methods
  public abstract double area();

}
