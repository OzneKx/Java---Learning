package Training.CarRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

    System.out.println("Enter rental data: ");
    System.out.print("Car model: ");
    String carModel = scanner.nextLine();
    System.out.print("Pickup (dd/MM/yyyy): ");
    Date start = sdf.parse(scanner.nextLine());
    System.out.print("Return (dd/MM/yyyy): ");
    Date finish = sdf.parse(scanner.nextLine());

    CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

    System.out.print("Enter price per hour: ");
    double pricePerHour = scanner.nextDouble();
    System.out.print("Enter price per day: ");
    double pricePerDay = scanner.nextDouble();

    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

    rentalService.processInvoice(carRental);

    System.out.println("INVOICE: ");
    System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
    System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
    System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

    scanner.close();
  }
}
