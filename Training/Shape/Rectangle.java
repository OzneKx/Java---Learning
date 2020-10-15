package Training.Shape;

public class Rectangle extends Shape {
  // Attributes set
  private double width;
  private double height;
  

  // Constructor Method
  public Rectangle() {
    super();
  }

  public Rectangle(Color color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
  }


  // Special Methods (Getter && Setter)
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double area() {
    return (width * height);
  }
}
