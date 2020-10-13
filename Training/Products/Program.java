package Training.Products;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Product product = new Product();

    System.out.println("Enter product data:");
    System.out.print("Name: ");
    product.name = sc.nextLine();
    System.out.print("Price: ");
    product.price = sc.nextDouble();
    System.out.print("Quantity: ");
    product.quantity = sc.nextInt();

    System.out.println("Product data: " + product.name + ", $" + product.price + 
    ", " + product.quantity + " units, Total: $" + product.totalValueInStock());

    System.out.print("Enter the number of products to be added in stock: ");
    product.addProducts(sc.nextInt());

    System.out.println("Updated data: TV, $" + product.price + 
    ", " + product.quantity + " units, Total: $" + product.totalValueInStock());

    System.out.print("Enter the number of products to be removed in stock: ");
    product.removeProducts(sc.nextInt());

    System.out.println("Updated data: TV, $" + product.price + 
    ", " + product.quantity + " units, Total: $" + product.totalValueInStock());

    sc.close();
  }
}
