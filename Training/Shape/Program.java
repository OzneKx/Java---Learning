package Training.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Shape> list = new ArrayList<>();

    System.out.print("Enter the number of shapes: ");
    int quantity = scanner.nextInt();

    for (int c = 1; c <= quantity; c++) {
      System.out.print("Shape #" + c + " data:");
      System.out.print("Rectangle or Cicle? [R/C]: ");
      char option = scanner.next().charAt(0);
      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(scanner.next()); 
      if (option == 'R') {
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        list.add(new Rectangle(color, width, height));
      } else {
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        list.add(new Circle(color, radius));
      }
    }

    System.out.println();
    System.out.println("SHAPE AREAS:");
    for (Shape c : list) {
      System.out.println(String.format("%.2f", c.area()));
    }

    scanner.close();
  }
}
