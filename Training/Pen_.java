package Training;

public class Pen_ {
  public static void main(String[] args) {
    // Creating the pen object
    Pen pen1 = new Pen();

    // Attributes set
    pen1.color = "Blue";
    pen1.model = "Nip";
    // It is private so it won't work pen1.tip = 0.7f;
    pen1.filled = 100;
    // pen1.is_open = false;

    // Using Methods
    pen1.status();
    pen1.close();
    pen1.scribble();
    pen1.open();
    pen1.scribble();

    // Creating a new pen object
    Pen pen2 = new Pen();

    // Attributes set    
    pen2.color = "Black";
    pen2.model = "Ballpoint";
    // It is private so it won't work pen2.tip = 0.5f;
    pen2.filled = 50;
    // pen2.is_open = true;

    // Using Methods 
    pen2.status();
    pen2.scribble();
  }
}