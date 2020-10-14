package Training.Rectangle;

public class Rectangle {
  // Attributes set
  public double width;
  public double height;

  // Methods
  public double area() {
    return (width * height);
  }

  public double perimeter() {
    return ((2 * width) + (2 * height));
  }

  @Override
  public String toString() {
    return "AREA = " + String.format("%.2f", area()) +
    "\nPERIMETER = " + String.format("%.2f", perimeter());
  }
}
