package Training.Products;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter product data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    
    Product product = new Product(name, price);

    System.out.println("Product data: " + product);

    System.out.print("Enter the number of products to be added in stock: ");
    product.addProducts(sc.nextInt());

    System.out.println("Updated data: " + product);

    System.out.print("Enter the number of products to be removed in stock: ");
    product.removeProducts(sc.nextInt());

    System.out.println("Updated data: " + product);

    sc.close();
  }
}
