package Training.Reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    List<Reservation> list = new ArrayList<>(); 

    Reservation reservation = new Reservation();

    System.out.print("Room number: ");
    int number = scanner.nextInt();
    System.out.println("Check-in date [dd/mm/yyyy]: ");
    Date checkin = sdf.parse(scanner.next());  
    System.out.println("Check-out date [dd/mm/yyyy]: ");
    Date checkout = sdf.parse(scanner.next());
    list.add(new Reservation(number, checkin, checkout));

    System.out.println(reservation);

  }
}
