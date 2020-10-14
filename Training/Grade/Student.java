package Training.Grade;

public class Student {
  // Attributes set
  public String name;
  public double score1;
  public double score2;
  public double score3;
  public String status;

  // Methods
  public double anualScore() {
    return (score1 + score2 + score3); 
  }

  public double calculus() {
    double quantity = (100 * 0.6); 
    return (quantity - anualScore());
  } 

  public String condition() {
    if (anualScore() >= 60) {
      this.status = "PASS";
    } else {
      this.status = "FAILED";
    }  System.out.println("\nMISSING " + calculus() + " POINTS");
    return status;
  }

  @Override
  public String toString() {
    return "FINAL GRADE = " + String.format("%.2f", anualScore()) + "\n" + condition();
  }
}
