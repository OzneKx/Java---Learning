package Training.TryCatch;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] vect = scanner.nextLine().split(" ");
    int position = scanner.nextInt();
    System.out.println(vect[position]);
    
    scanner.close();
  }
}
