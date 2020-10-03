package Training.Aula10;

public class Employee extends Person {
  // Atributes set (2)
  private String sector;
  private boolean working;



  // Abstract Methods (1)
  public void changeJob() {
    System.out.println("A mudança de trabalho será feita.");
  }

  
  
  // Special Merhods (Getter && Setter) (4)
  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public boolean isWorking() {
    return working;
  }

  public void setWorking(boolean working) {
    this.working = working;
  }
}
