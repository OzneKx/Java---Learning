package Training.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of employees: ");
    int quantity = scanner.nextInt();

    List<Employee> list = new ArrayList<>();

    for (int c = 1; c <= quantity; c++) {
      System.out.println("Employee #" + c + " data:");
      System.out.print("Outsourced? [Y/N]: ");
      char option = scanner.next().charAt(0);
      System.out.print("Name: ");
      scanner.nextLine();
      String name = scanner.nextLine();
      System.out.print("Hours: ");
      int hours = scanner.nextInt();
      System.out.print("Value per hour: ");
      double valuePerHour = scanner.nextDouble();
      if (option == 'Y') {
        System.out.print("Additional charge: ");
        double additionalCharge = scanner.nextDouble();
        list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        list.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");
    for (Employee c : list) {
      System.out.println(c.getName() + " - $ " + String.format("%.2f", c.payment()));
    }

    scanner.close();
  }
}
