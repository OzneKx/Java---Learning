package Training.Reservation;

import java.util.Date;

public class Reservation {
  // Attributes set
  private int roomNumber;
  private Date checkin;
  private Date checkout;
public Object list;


  // Constructor method
  public Reservation() {

  }

  public Reservation(int roomNumber, Date checkin, Date checkout) {
    this.roomNumber = roomNumber;
    this.checkin = checkin;
    this.checkout = checkout;
  }

  
  // Special Methods (Getter && Setter)
  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Date getCheckin() {
    return checkin;
  }

  public void setCheckin(Date checkin) {
    this.checkin = checkin;
  }

  public Date getCheckout() {
    return checkout;
  }

  public void setCheckout(Date checkout) {
    this.checkout = checkout;
  }


  // Methods
  @Override
  public String toString() {
    return "Reservation: Room " + roomNumber + ", check-in: " 
    + checkin + ", check-out: " + checkout + /* duration() + */ " nights";
  }

  /* public int duration() {
    return ();
  } */

  public void updateDates(Date checkin, Date checkout) {
    if (checkin == checkout) {
      System.out.println("Datas de checkin e checkout devem ser diferentes.");
    } else {
      setCheckin(checkin);
      setCheckout(checkout);
    }
  }
}
