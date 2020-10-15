package Training.Shape;

public class Circle extends Shape {
  // Attributes set
  private double radius;
  

  // Constructor Method
  public Circle() {
    super();
  }

  public Circle(Color color, double radius) {
    super(color);
    this.radius = radius;
  }

  
  // Special Methods (Getter && Setter)
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return (Math.PI * radius * radius);
  }
}
