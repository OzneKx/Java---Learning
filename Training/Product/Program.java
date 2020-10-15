package Training.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<Product> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int quantity = scanner.nextInt();

    for (int c = 1; c <= quantity; c++) {
      System.out.println("Product #" + c + "data:");
      System.out.print("Common; Used; Imported? (C/U/I): ");
      char option = scanner.next().charAt(0);
      System.out.print("Name: ");
      scanner.nextLine();
      String name = scanner.nextLine();
      System.out.print("Price: ");
      double price = scanner.nextDouble();
      if (option == 'C') {
        list.add(new Product(name, price));
      } else if (option == 'U') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date manufactureDate = sdf.parse(scanner.next());
        list.add(new Used(name, price, manufactureDate));
      } else {
        System.out.print("Customs fee: ");
        double customsFee = scanner.nextDouble();
        list.add(new Imported(name, price, customsFee));
      }
    }

    System.out.println();
    System.out.println("PRICE TAGS:");
    for (Product c : list) {
      System.out.println(c.priceTag());
    }

    scanner.close();
  }
}
