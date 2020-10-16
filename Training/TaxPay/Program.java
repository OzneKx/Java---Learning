package Training.TaxPay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<TaxPayer> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int quantity = scanner.nextInt();

    for (int c = 1; c <= quantity; c++) {
      System.out.print("TaxPayer #" + c + " data:");
      System.out.print("Individual or Company? [I/C]: ");
      char option = scanner.next().charAt(0);
      System.out.print("Name: ");
      scanner.nextLine();
      String name = scanner.nextLine();
      System.out.print("Anual Income: ");
      double anualIncome = scanner.nextDouble();
      if (option == 'I') {
        System.out.print("Health Expenditures: ");
        double healthExpenditures = scanner.nextDouble();
        list.add(new Individual(name, anualIncome, healthExpenditures));
      } else {
        System.out.print("Number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        list.add(new Company(name, anualIncome, numberOfEmployees));
      }
    }

    double sum = 0.0;
    System.out.println();
    System.out.println("TAXES PAID:");
    for (TaxPayer c : list) {
      double tax = c.tax();
      System.out.println(c.getName() + ": $" + String.format("%.2f", tax));
      sum += tax;
    }

    System.out.println();
    System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

    scanner.close();
  }
}
