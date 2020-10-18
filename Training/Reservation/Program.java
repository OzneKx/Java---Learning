package Training.Reservation;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    
    System.out.print("Room number: ");
    int number = scanner.nextInt();
    System.out.print("Check-in date [dd/mm/yyyy]: ");
    Date checkin = sdf.parse(scanner.next());  
    System.out.print("Check-out date [dd/mm/yyyy]: ");
    Date checkout = sdf.parse(scanner.next());
    

    if (!checkout.after(checkin)) {
      System.out.println("Error in reservation: Check-out date must be after check-in date.");
    } else {
      Reservation reservation = new Reservation(number, checkin, checkout);
      System.out.println(reservation);

      System.out.println();
      System.out.println("Enter data to update the reservation:");
      System.out.print("Check-in date [dd/mm/yyyy]: ");
      checkin = sdf.parse(scanner.next());  
      System.out.print("Check-out date [dd/mm/yyyy]: ");
      checkout = sdf.parse(scanner.next());

      Date now = new Date();
      if (checkin.before(now) || checkout.before(now)) {
        System.out.println("Error in reservation: Reservation dates for update must be futere dates.");
      } else if (!checkout.after(checkin)) {
        System.out.println("Error in reservation: Check-out date must be after check-in date.");
      } else {
        reservation.updateDates(checkin, checkout);
        System.out.println(reservation);
      }
    }
    
    scanner.close();
  }
}
