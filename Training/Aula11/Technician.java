package Training.Aula11;

public final class Technician {
  // Atributes set (1)
  private int professionNumber;



  // Abstract Methods (1)
  public void practice() {
    System.out.println("Praticando.");
  }



  // Special Methods (Getter && Setter) (2)
  public int getProfessionNumber() {
    return professionNumber;
  }

  public void setProfessionNumber(int professionNumber) {
    this.professionNumber = professionNumber;
  }
}
