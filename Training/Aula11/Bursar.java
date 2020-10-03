package Training.Aula11;

public final class Bursar extends Student {
  // Atributes set (1)
  private float scholarship;


  // Abstract Methods (2)
  public void renewScholarship() {
    System.out.println("Renovando bolsa de " + this.getName());
  }

  @Override
  public void payTuition() {
    System.out.println("Pagando mensalidade de " + this.getName());
  }



  // Special Methods (Getter && Setter) (2)
  public float getScholarship() {
    return scholarship;
  }

  public void setScholarship(float scholarship) {
    this.scholarship = scholarship;
  }
}
