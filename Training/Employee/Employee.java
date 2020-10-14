package Training.Employee;

public class Employee {
  // Attributes set
  public String name;
  public double grossSalary;
  public double tax;

  // Methods
  public double netSalary() {
    return this.grossSalary -= tax;
  }

  public void increaseSalary(double percentage) {
    this.grossSalary += (grossSalary * percentage / 100);
  }

  @Override
  public String toString() {
    return name + ", $" + String.format("%.2f", netSalary());
  }
}
