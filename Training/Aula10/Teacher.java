package Training.Aula10;

public class Teacher extends Person {
  // Atributes set (2)
  private String speciality;
  private double salary;



  // Abstract Methods (1)
  public void receiveRaise() {
    System.out.println("O aluno será recebido.");
  }


  
  // Special Methods (Getter && Setter) (4)
  public String getSpeciality() {
    return speciality;
  }
  
  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
  
  public double getSalary() {
    return salary;
  }
  
  public void setSalary(double d) {
    this.salary = d;
  }
}
